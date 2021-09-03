package com.company;

public class Object {
    public String var1;
    public int var2;

    public static int counter=0;

    public Object(String var1,int var2)
    {
        this.var1=var1;
        this.var2=var2;
        counter++;
        System.out.println(counter+" current objects");
    }
}
