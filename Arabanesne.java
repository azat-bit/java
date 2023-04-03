public class Arabanesne {

    public  static  void main(String argc[]){

        Araba bmw = new Araba();
        bmw.hız=65;
        bmw.renk="mavi";
        bmw.yas=2;
        bmw.durum=false;
        System.out.println(bmw.durum);
        bmw.calistir();
        System.out.println("çalışmaya başladı:"+bmw.durum);
        bmw.durdu();
        System.out.println("durdu:"+bmw.durum);
    }
}
