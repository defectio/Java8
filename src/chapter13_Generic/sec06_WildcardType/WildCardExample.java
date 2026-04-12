package chapter13_Generic.sec06_WildcardType;

import java.util.Arrays;

public class WildCardExample {

	/*
	 * [WildCard]
	 * 	 - 제네릭 타입을 매개값이나 리턴 타입으로 사용할 때 구체적인 타입 대신에 와일드카드를 다음과 같이 3가지 형태로 사용할 수 있다.
	 * 		(1) 제네릭타입<?> : Unbounded WildCards(제한 없음)
	 * 				- 타입 파라미터를 대치하는 구체적인 타입으로 모든 클래스나 인터페이스 타입이 올 수 있다.
	 * 		(2) 제네릭타입<? extends 상위타입> : Upper Bounded WildCards(상위 클래스 제한)
	 * 				- 타입 파라미터를 대치하는 구체적인 타입으로 상위 타입이나 하위 타입만 올 수 있다.
	 * 				- extends 뒤에 명시한 타입 이하의 타입만 가능
	 * 		(3) 제네릭타입<? super 하위타입> : Lower Bounded WildCards(하위 클래스 제한)
	 * 				- 타입 파라미터를 대치하는 구체적인 타입으로 하위 타입이나 상위 타입이 올 수 있다.
	 * 				- super 뒤에 명시한 타입 이상의 타입만 가능 
	 */
	
	//일반인 과정
	//Course<?> : 수강생은 모든 타입(Person, Worker, Student, HighStudent)이 될 수 있다.
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생 : "+Arrays.toString(course.getStudents()));
	}
	
	//학생 과정
	//Course<? extends Student> : 수강생은 Student 타입 이하(Student, HighStudent)만 될 수 있다.
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}
	
	//직장인 과정, 일반 과정
	//Course<? super Worker> : 수강생은 Worker 타입 이상(Wokder, Person)만 될 수 있다.
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		//Person Course 생성 -> Person 이하의 타입이 들어올 수 있음.
		Course<Person> personCourse = new Course<Person>("일반인 과정", 5);
		//Person 타입, Person의 하위 타입도 add 될 수 있음 -> Person 타입으로 타입 변환되어 저장됨.
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));

		//Worker Course 생성 -> Worker 이하의 타입이 들어올 수 있음.
		Course<Worker> workerCourse = new Course<Worker>("직장인 과정", 5);
		//Worker 타입만 add 될 수 있음
		workerCourse.add(new Worker("직장인"));
		//workerCourse.add(new Person("일반인"));
		//workerCourse.add(new Student("학생"));
		//workerCourse.add(new HighStudent("고등학생"));

		//Student Course 생성 -> Student 이하의 타입이 들어올 수 있음.
		Course<Student> studentCourse = new Course<Student>("학생 과정", 5);
		//Student 타입만 add 될 수 있음
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		//studentCourse.add(new Person("일반인"));
		//studentCourse.add(new Worker("직장인"));
		
		//HighStudent Course 생성 -> HighStudent 이하의 타입이 들어올 수 있음.
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생 과정", 5);
		//HighStudent 타입만 add 될 수 있음
		highStudentCourse.add(new HighStudent("고등학생"));
		//highStudentCourse.add(new Worker("직장인"));
		//highStudentCourse.add(new Person("일반인"));
		//highStudentCourse.add(new Student("학생"));

		//모든 코스 등록 가능
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();

		//Student 이하 타입 등록 가능
		//registerCourseStudent(personCourse);
		//registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();

		//Worker 이상 타입 등록 가능
		registerCourseWorker(workerCourse);
		registerCourseWorker(personCourse);
		// registerCourseWorker(studentCourse);
		// registerCourseWorker(highStudentCourse);			
	
	} //end main

} //end class