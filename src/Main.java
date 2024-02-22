import java.util.Scanner;
//Kullanıcıdan verileri alabilmek için Scanner sınıfını projeye dahil diyoruz


public class Main {
    public static void main(String[] args) {

        //kullanicidan alinacak girdi için degişkenleri tanimladik
        double toplamFiyat, elma, armut, muz, domates, patlican;

        Scanner input = new Scanner(System.in);


        /*Kullanıcıdan verileri alarak kilogram * fiyat formülünü yazdık ve
        tutarı yine ürün değişkenine yazıyoruz*/
        System.out.print("Elma'nın Kg'sini giriniz: ");
        elma = input.nextDouble();
        elma *= 3.67;

        System.out.print("Armut'un Kg'sini Giriniz: ");
        armut = input.nextDouble();
        armut *= 2.14;

        System.out.print("Muz'un Kg'sini Giriniz: ");
        muz= input.nextDouble();
        muz *= 0.95;


        System.out.print("Domates'in Kg'sini Giriniz: ");
        domates = input.nextDouble();
        domates *=1.11;


        System.out.print("Patlıcan'ın Kg'sini Giriniz: ");
        patlican =input.nextDouble();
        patlican *= 5.00;

        /*Miktar * ürün ile tekrar değer atadığımız değişkenlerin son değerlerinin
         toplamını yine bir değişkene atayarak ekrana yazdırıyporuz*/
        toplamFiyat= armut+ elma +muz +domates +patlican;
        System.out.print(toplamFiyat);

    }
}