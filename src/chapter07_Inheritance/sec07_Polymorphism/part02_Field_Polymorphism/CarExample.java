package chapter07_Inheritance.sec07_Polymorphism.part02_Field_Polymorphism;

public class CarExample {
	
	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i = 1; i <= 5; i++) {
			// 타이어 전체를 한바퀴 굴리고, 펑크난 위치를 리턴받음
			int problemLocation = car.run();
			switch (problemLocation) {
				case 1: // 앞왼쪽
					System.out.println("앞왼쪽 HankookTire로 교체");
					car.frontLeftTire = new HankookTire("앞왼쪽", 15); // 자동타입변환
					break;
				case 2: // 앞오른쪽
					System.out.println("앞오른쪽 KumhoTire로 교체");
					car.frontRightTire = new KumhoTire("앞오른쪽", 13); // 자동타입변환
					break;
				case 3: // 뒤왼쪽
					System.out.println("뒤왼쪽 HankookTire로 교체");
					car.backLeftTire = new HankookTire("뒤왼쪽", 14); // 자동타입변환
					break;
				case 4: // 뒤오른쪽
					System.out.println("뒤오른쪽 KumhoTire로 교체");
					car.backRightTire = new KumhoTire("뒤오른쪽", 17); // 자동타입변환
					break;
			}
			System.out.println("----------------------------------------");
		}
		
	}
	
}