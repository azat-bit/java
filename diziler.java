package com.example.myapplication;

import java.util.Scanner;

public class diziler {
    public static  void main(String argc[]){
       String dersler [] = new String[3];
       int notlar [] = new int[3];
        Scanner ders = new Scanner(System.in);
    int not;
    String ders1;
       for(int i=0;i<= dersler.length;i++){
           System.out.println((i+1)+"dersi girin");
            ders1=ders.next();
            dersler[i]=ders1;
           System.out.println((i+1)+"notu girin");
            not = ders.nextInt();

           notlar[i]=not;

           System.out.println(dersler[i]+notlar[i]+"/n");

       }


    }
   ;

}
