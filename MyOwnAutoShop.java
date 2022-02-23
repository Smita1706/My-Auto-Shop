package com.bridgelabz.autoshop;

public class MyOwnAutoShop {
	public static void main(String[] args) {

		Sedan sedan = new Sedan(40, 60000, "black", 30);
		System.out.println(" Sedan Price: " + sedan.getSalePrice());

		Ford ford = new Ford(50, 20000, "red", 2000, 10);
		System.out.println(" Ford Price: " + ford.getSalePrice());
		
		Truck truck = new Truck(20, 30000, "white", 2000);
		System.out.println(" Truck Price: " + truck.getSalePrice());

		Car car = new Car(30, 50000, "gray");
		System.out.println(" Car Price: " + car.getSalePrice());
	}
}
