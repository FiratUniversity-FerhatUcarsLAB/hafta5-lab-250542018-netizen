/*
 * Ad Soyad: [Akın Ağaçbacak]
 * Ogrenci No: [250542018]
 * Tarih: [07/11/2025]
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

public class GeometrikHesap {

    // 1. Kare alanı
    public static double calculateSquareArea(double side){
        return Math.pow(side, 2);
    }

    // 2. Kare çevresi
    public static double calculateSquarePerimeter(double side) {
        return side*4;
    }

    // 3. Dikdörtgen alanı
    public static double calculateRectangleArea(double width, double height) {
        return width*height;
    }

    // 4. Dikdörtgen çevresi
    public static double calculateRectanglePerimeter(double width, double height) {
        return (width+height)*2;
    }

    // 5. Daire alanı
    public static double calculateCircleArea(double radius) {
        return Math.PI*Math.pow(radius, 2);
    }

    // 6. Daire çevresi
    public static double calculateCircleCircumference(double radius) {
        return 2*Math.PI*radius ;
    }

    // 7. Üçgen alanı (taban ve yükseklik ile)
    public static double calculateTriangleArea(double base, double height) {
        return (base*height)/2;
    }

    // 8. Üçgen çevresi
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        return a+b+c;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Değişkenler

        //Kare değişkeni
        double side;

        //Dikdortgen Değişkenleri
        double width, height;

        //Daire Değişkenleri
        double radius;
        //Ucgen Değişkenleri
        double side1,side2,side3;

        //Kullanıcıdan Alınacak Değerler
        System.out.println("=== GEOMETRIK SEKIL HESAPLAYICI ===\n");
        //kare
        System.out.print("KARE:\nkenar uzunlugu (cm):");
        side = input.nextDouble();
        System.out.println("");

        //Dikdortgen
        System.out.print("Dikdortgen: \nYükseklik uzunlugu (cm):");
        height = input.nextDouble();
        System.out.print("Genişlik uzunluğu (cm):");
        width = input.nextDouble();
        System.out.println("");

        //Daire
        System.out.print("Daire:\nYarıcap (cm):");
        radius = input.nextDouble();
        System.out.println("");

        //Ucgen
        System.out.print("Ucgen:\nYükseklik (cm):");
        side1 = input.nextDouble();
        System.out.print("Taban (cm):");
        side2 = input.nextDouble();
        System.out.print("3.Kenar (cm):");
        side3 = input.nextDouble();
        System.out.println("");


        //CIKTI Kısmı
        System.out.println("========================================");
        System.out.println("        HESAPLAMA SONUCLARI");
        System.out.println("========================================\n");

        //kare Çıktısı
        System.out.printf("KARE (kenar: %.2f cm):\n", side);
        System.out.printf("  Alan     : %.2f cm\n",calculateSquareArea(side));
        System.out.printf("  Cevre    : %.2f cm\n\n",calculateSquarePerimeter(side));

        //Dikdortgen Çıktısı
        System.out.printf("DIKDORTGEN (%.2f x %.2f cm):\n", width,height);
        System.out.printf("  Alan      : %.2f cm²\n",calculateRectangleArea(width,height));
        System.out.printf("  Cevre     : %.2f cm\n\n",calculateRectanglePerimeter(width,height));

        //Daire Çıktısı
        System.out.printf("DAIRE (yaricap: %.2f):\n", radius);
        System.out.printf("  Alan      : %.2f cm²\n",calculateCircleArea(radius));
        System.out.printf("  Cevre     : %.2f cm\n\n",calculateCircleCircumference(radius));

        //Ucgenin Alanı
        System.out.printf("UCGEN (taban: %.2f, yukseklik: %.2f cm):\n", side1,side2);
        System.out.printf("  Alan      : %.2f cm²\n",calculateTriangleArea(side1,side2));
        System.out.printf("  Cevre     : %.2f cm\n",calculateTrianglePerimeter(side1,side2,side3));



    }
}

}
