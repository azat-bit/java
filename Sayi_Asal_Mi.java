import java.util.Scanner;

public class Sayi_Asal_Mi {

    public static  void main(String args[]){

        Scanner sayi= new Scanner(System.in);
        System.out.println("kontrol etmek istediğiniz sayıyı girin");

        int sayi1=sayi.nextInt();
        for (int i=1;i<=sayi1;i++){
            if ((sayi1%i==0)){

                System.out.println("sayi asal değildir");
            }
            else {

                System.out.println("asal ");
            }

        }



    }
}
