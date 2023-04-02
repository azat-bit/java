import java.util.Scanner;

public class switch_case {


    public static  void main(String argc[]){

        System.out.println("yılın kaçıncı ayını bulmak istiyorsunuz");
        Scanner sayi = new Scanner(System.in);
        int ay = sayi.nextInt();
        switch (ay){


            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("şubat");
                break;
                case 3:
                System.out.println("mart");
                break; case 4:
                System.out.println("nisan");
                break; case 5:
                System.out.println("mayıs");
                break; case 6:
                System.out.println("haziran");
                break; case 7:
                System.out.println("temmuz");
                break;
        }

    }
}
