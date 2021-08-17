package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        SieveOfEratosthenes soe = new SieveOfEratosthenes();
        System.out.println("Bir pozitif tam sayı giriniz");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        soe.asalSayilariHesapla(n);
    }

    void asalSayilariHesapla(int n) {
        boolean[] list=new boolean[n];
        Arrays.fill(list,true);

        for (int i=2;i<n;i++) {
            if (list[i] == true)
                for (int j = 2; i * j < n; j++)
                    list[i * j] = false;
        }
        list[0]=false;
        list[1]=false;

        int primeCounter=0;
        for (boolean b:list) {
            if (b)
            primeCounter++;
        }
        System.out.println(n+" sayısına kadar "+ primeCounter+" tane asal sayı vardır");
    }
}

