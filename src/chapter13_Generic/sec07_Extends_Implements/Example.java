package chapter13_Generic.sec07_Extends_Implements;

public class Example {

	public static void main(String[] args) {
		//Tv, 종류, 회사
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		
		//Product(부모)의 method
		product.setKind(new Tv());
		product.setModel("smartTV");
		
		//ChildProduct(자식)의 method
		product.setCompany("samsung");
		
		//////////////////////////////////////////////////////////////////
		
		//배열 크기를 매개변수로 Storage<Tv> 생성
		Storage<Tv> storage = new StorageImp<>(5);
		
		for(int i=0 ; i<storage.getCapacity() ; i++) {
			storage.add(new Tv("삼성"+(i+1)), i);
		}
		
		for(int i=0 ; i<storage.getCapacity() ; i++) {
			System.out.println(storage.get(i).name);
		}
		
	} //end main

} //end class
