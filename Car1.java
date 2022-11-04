package test;
//***************************
//파일명: UsedCarTest.java 
//작성자: 윤주애
//작성일: 2022.11.04
//내용: Car 클래스  
//***************************
class Car{
	public String color;// 색상
	public int price;// 가격
	public Car(String color, int price) {
			this.color = color;
			this.price = price;
			
			}
	public String getColor() {
		      return color;
		   }
	public int getPrice() {
		      return price;
		   }
}

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