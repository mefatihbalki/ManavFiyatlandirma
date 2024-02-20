import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Manav Ürün Fiyatları
        double armut, elma, domates, muz, patlican;
        double armutf = 2.14, elmaf = 3.67, domatesf = 1.11, muzf =0.95, patlicanf =5.00;


        //Armut Kilosu
        Scanner inp = new Scanner(System.in);
        System.out.print("Armut'un Kilosunu Girin: ");
        armut = inp.nextDouble();

        //elma Kilosu
        System.out.print("Elma'nın Kilosunu Girin: ");
        elma = inp.nextDouble();

        //Domates Kilosu
        System.out.print("Domates'in Kilosunu Girin: ");
        domates = inp.nextDouble();

        //Muz Kilosu
        System.out.print("Muz'un Kilosunu Girin: ");
        muz = inp.nextDouble();

        //Patlıcan Kilosu
        System.out.print("Patlıcan'ın Kilosunu Girin: ");
        patlican = inp.nextDouble();
//Toplam Tutar
double tutar =(armut * armutf) + (elma * elmaf) + (domates * domatesf) + (muz * muzf) + (patlican * patlicanf);
        System.out.print("Toplam Tutar : " + tutar);

    }
}