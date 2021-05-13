package com.practice;

public class ConstructorTest {

	private int x;
	private int y;
	private int width;
	private int height;
//12 , 15 16 19 
	public ConstructorTest() {

		this(1, 2,100,200);
	}

	public ConstructorTest(int a, int b) {
		this(1, 2, a, b);
	}

	public ConstructorTest(int x, int y, int width, int height) {

		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public static void main(String[] args) {
		
		ConstructorTest c = new ConstructorTest();
		System.out.println(c.getX());
		System.out.println(c.getY());
		System.out.println(c.getWidth());
		System.out.println(c.getHeight());
		
		System.out.println("//////////");

		
		ConstructorTest c2 = new ConstructorTest(6,9);
		System.out.println(c2.getX());
		System.out.println(c2.getY());
		System.out.println(c2.getWidth());
		System.out.println(c2.getHeight());
		
		

	}

}
