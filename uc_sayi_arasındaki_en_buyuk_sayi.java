import java.util.Scanner;

public class uc_sayi_arasındaki_en_buyuk_sayi {



    public static void  main(String args[]){
        int [] diziler = new int[4];
        Scanner sayi = new Scanner(System.in);
        for (int i=0;i<3;i++){
            System.out.println("sayiyi girin");
            diziler[i] = sayi.nextInt();
        }
        if ((diziler[0]>diziler[1]) && diziler[0]>diziler[2]){

            System.out.println("en buyuk sayi"+diziler[0]);
        } else if((diziler[1]>diziler[0]) && (diziler[1]>diziler[2])) {
            System.out.println("en buyuk sayi"+diziler[1]);
        }
        else if((diziler[2]>diziler[0]) && (diziler[2]>diziler[1])) {
            System.out.println("en buyuk sayi"+diziler[2]);
        }
        else{
            System.out.println("aralarında eşit sayılar var");
        }


    }

}
