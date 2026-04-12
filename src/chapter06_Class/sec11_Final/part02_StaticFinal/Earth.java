package chapter06_Class.sec11_Final.part02_StaticFinal;

public class Earth {
	/* 
	 * [static final] : 상수(공용성 & 불변성)
	 *  - 상수 : 불변의 값을 상수(constant)라고 한다.
	 *  - 불변의 값은 객체마다 저장할 필요가 없는 공용성을 띠고 있으며, 여러 가지 값으로 초기화 될 수 없다. 
	 *     즉, final 필드는 객체마다 저장되고, 생성자의 매개값을 통해서 여러 가지 값으로 초기화될 수 없기 때문에 상수가 될 수 없다.
	 *  - 상수는 객체마다 저장할 필요가 없는 공용성을 띠어야 한다 -> static final 
	 *     즉, 객체마다 저장되지 않고 클래스에만 포함된다. 한번 초기값이 저장되면 변경할 수 없다.
	 */
	//상수 이름은 모두 대문자로 하는 것이 관례이다.
	public static final double EARTH_RADIUS = 6400;
	public static final double EARTH_SURFACE_AREA;
	
	/* 정적 초기화 블록 */
	//상수의 초기값이 단순한 값이라면 선언 시에 주는 것이 일반적이지만, 복잡한 초기화일 경우 정적 블록에서 초기화 할 수 있다.
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}	
	
	public static void main(String[] args) {
		
		System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS + " km");
		System.out.println("지구의 표면적: " + Earth.EARTH_SURFACE_AREA + "  km^2");
		
	} //end main
	
} //end class
