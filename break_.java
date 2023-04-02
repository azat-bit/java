package com.example.myapplication;

import java.util.Scanner;

public class break_ {

    public static  void main(String argc[]){

     System.out.println("bir sayı girin");

        Scanner tryci = new Scanner(System.in);

        int sayi = tryci.nextInt();
        int sayi1;
        while(sayi>0){

            if(sayi%2==0){
                System.out.println("çifttir");


            }
            else{
                System.out.println("tektir");

            }
            System.out.println("cıkış için 0 basın");
            sayi = tryci.nextInt();
            if (sayi==0){
                break;
            }
        }
    }
}
