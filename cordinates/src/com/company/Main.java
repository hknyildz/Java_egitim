package com.company;

public class Main {

    public static void main(String[] args) {
	point point1=new point();
	point1.setX(3);
	point1.setY(2);

	point point2=new point();
	point2.setX(7);
	point2.setY(8);

	point1.getDistanceToOrigin();
	point1.getDistanceToPoint(point2.x, point2.y);
	point2.getDistanceToPoint(point1.x,point1.y);

	point1.getX();
	point1.getY();

		point1.move(2,6);
    }
}
