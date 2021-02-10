package com.mnaufalazwar.springframeworkbasic;

import java.util.StringJoiner;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements Shape{
	
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
		
		System.out.println("Drawing Triangle");
		
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

	public void myInit() {
		System.out.println("myInitt method called for Triangle");
	}
	
	public void cleanUp() {
		System.out.println("cleanUp method called for Triangle");
	}

//	implements InitializingBean, DisposableBean

//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("InitializingBean init method called for Triangle");
//	}
//
//	@Override
//	public void destroy() throws Exception {
//		System.out.println("DisposableBean destroy method called for Triangle");
//	}

}
