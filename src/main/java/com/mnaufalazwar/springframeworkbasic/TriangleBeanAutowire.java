package com.mnaufalazwar.springframeworkbasic;

import java.util.StringJoiner;

public class TriangleBeanAutowire {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	
	
	public Point getPointA() {
		return pointA;
	}



	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}



	public Point getPointB() {
		return pointB;
	}



	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}



	public Point getPointC() {
		return pointC;
	}



	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}



	public void draw() {
		
		StringJoiner stringA = new StringJoiner(" ");
		stringA.add("Point A = (");
		stringA.add("" + getPointA().getX() + ",");
		stringA.add("" + getPointA().getY() + ")");
		System.out.println(stringA.toString());
		
		StringJoiner stringB = new StringJoiner(" ");
		stringB.add("Point B = (");
		stringB.add("" + getPointB().getX() + ",");
		stringB.add("" + getPointB().getY() + ")");
		System.out.println(stringB.toString());
		
		StringJoiner stringC = new StringJoiner(" ");
		stringC.add("Point C = (");
		stringC.add("" + getPointC().getX() + ",");
		stringC.add("" + getPointC().getY() + ")");
		System.out.println(stringC.toString());
	}
}
