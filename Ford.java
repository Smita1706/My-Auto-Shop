package com.bridgelabz.autoshop;

public class Ford extends Car{
	int year;
	int manufacturerDiscount;
	
	public Ford(int speed, double regularPrice, String color, int year, int discount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = discount;
	}
	
	double getSalePrice() {
		return regularPrice - regularPrice * (manufacturerDiscount / 100.0);
	};
}
