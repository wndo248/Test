package test;
//***************************
// 파일명: UsedCarTest.java 
// 작성자: 윤주애
// 작성일: 2022.11.04
// 내용: UsedCarTest 클래스  
//***************************
public class UsedCarTest{
	public static void main(String[] args) {
		System.out.println("hw11_1 윤주애");
		
		Car C = new Car("blue", 2000000);
		System.out.println("자동차의 색상과 가격은? : " + C.getColor()  +" "+ C.getPrice() );
		
		UsedCar C2 = new UsedCar("red", 1000000, 2004);
		System.out.println("자동차의 색상과 가격은? : " + C2.getColor() +" "+ C2.getPrice() + " " +C2.getYear() );
		
		
		}
}

		
		
		
		









