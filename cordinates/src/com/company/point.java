package com.company;

public class point {
    public double x;
    public double y;

    public void setX(double x)
    {
        this.x=x;
    }

    public void setY(double y)
    {
        this.y=y;
    }

    public void getX() {
        System.out.println(x);
    }
    public void getY()
    {
        System.out.println(y);
    }

    public void move(double x,double y)
    {
        this.x=this.x+x;
        this.y=this.y+y;

        System.out.println("new cordinates are x: "+this.x+" y: "+this.y);
    }



    public void getDistanceToOrigin()
    {
        double distance=Math.pow(x,2)+Math.pow(y,2);
        distance=Math.sqrt(distance);
        System.out.println("distonce to origin is: "+distance);
    }

    public void getDistanceToPoint(double x,double y)
    {
        double distance;
        double distancesqrt = Math.pow(this.x-x,2)+Math.pow(this.y-y,2);
        distance=Math.sqrt(distancesqrt);
        System.out.println("Distance to this com.company.point is: "+distance);
    }
}
