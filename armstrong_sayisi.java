import java.util.Scanner;

public class armstrong_sayisi {


    static  public void main(String argc[]){
        System.out.println("hangi sayının armstrong sayı olduğunu kontrol etmek istiyorsunuz");
        Scanner sayi = new Scanner(System.in);
        int sayi1=sayi.nextInt();
        int birler,onlar,yuzler,onlar2,armstrong=0;
        if (sayi1>99&&sayi1<999){//armstrong 3 basamaklı olmak zorunda
            yuzler=sayi1/100;
            onlar=sayi1%100;
            onlar2=onlar/10;
            birler=onlar%10;

            armstrong=yuzler*yuzler*yuzler+onlar2*onlar2*onlar2+birler*birler*birler;
           if (sayi1==armstrong)
               System.out.println("armstrondtur");

        }
    }
}
