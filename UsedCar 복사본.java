package test;
//***************************
//파일명: UsedCar.java 
//작성자: 윤주애
//작성일: 2022.11.04
//내용: UsedCar 클래스  
//***************************
class UsedCar extends Car{
	private int year;
	
	public UsedCar(String color, int price, int year) {
		super(color, price);
		this.year = year;
}
	public int getYear() {
		return year;
	}
}