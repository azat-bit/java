import java.util.Scanner;

public class alfabe {




        public static void  main(String args[]){

            Scanner tryci = new Scanner(System.in);
            System.out.println("bir harf girin");
            char harf = tryci.next().charAt(0);

            if((harf>='a'&& harf<='z')||(harf>='A'&& harf<='Z')){

                System.out.println("harftır");
            }

            else {
                System.out.println("harf degil");
            }


        }

    }



