package com.company;

public class Main {

    public static void main(String[] args) {
	point point1=new point(3,5);
	point1.setY(2);

	point point2=new point(9,8);
	point2.setX(7);

	point1.getDistanceToOrigin();
	point1.getDistanceToPoint(point2.getX(), point2.getY());
	point2.getDistanceToPoint(point1.getY(),point1.getY());

		System.out.println(point1.getX());;
		System.out.println(point1.getY());;

		point1.move(2,6);
    }
}
