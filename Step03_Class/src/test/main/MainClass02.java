package test.main;

import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		//Car 클래스로 객체를 생성해서 참조값을 car1 이라는 Car type 지역변수에 담기
		Car car1= new Car();
		
		//Car 클래스로 객체를 생성해서 참조값을 car2라는 Car type 지역변수에 담기
		Car car2 = new Car();
		
		//필드에 String type 의참조값 대입하기
		car1.name="소나타";
		car2.name="그랜저";
		
		//메소드 호출하기  drive 라는 메소드
		car1.drive();
		car2.drive();
		//다른 객체 임으로 false이다
		boolean result = car1 == car2;
		//car2 에 들어있는 참조값을 car3 라는 지역변수에 대입하기(복사해주기) 
		//car3 지역변수를 만들어서 car2참조값을 car3안에 복사해준다
		Car car3=car2; 
		car3.drive(); //car2내용을 복사한거라서 그랜저가 달린다 가 출력됨

		//동일객체(car2와 car3에 저장된 참조값이 같다) 임으로 true이다
		boolean result2 = car2 == car3;
		
	}

}
