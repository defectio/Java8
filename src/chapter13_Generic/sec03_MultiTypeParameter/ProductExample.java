package chapter13_Generic.sec03_MultiTypeParameter;

public class ProductExample {

	public static void main(String[] args) {
		
		/* Product 객체 생성 */
		Product<Tv, String> product1 = new Product<Tv, String>();

		//setter
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
		
		//getter
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		System.out.println(tv);
		System.out.println(tvModel+"\n");
		
		//////////////////////////////////////////////////////////////
		
		/* 자바 7부터 제네릭 타입 파라미터의 중복 기술을 줄이기 위해 다이아몬드 연산자 <>를 제공한다. */
		/* Product 객체 생성 */
		Product<Car, String> product2 = new Product<>();
		
		//setter
		product2.setKind(new Car());
		product2.setModel("디젤");
		
		//getter
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		System.out.println(car);
		System.out.println(carModel);
	} //end main

} //end class