/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intro;

import java.util.Scanner;

/**
 *
 * @author Yusuf
 */
public class NewbyProjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Asal Sayi Icin Lutfen Bir Deger Giriniz");

        boolean isPrime = true;
        boolean evenNumber = false;
        double number = input.nextDouble();
        
        //PRIME NUMBERS
        if (number == 1) {
            System.out.println("Sayi Asal Degildir");
            return;
        }

        if (number < 1) {
            System.out.println("Gecersiz Sayi");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }

        }
        if (isPrime) {
            System.out.println("Sayi Asaldir");
        } else {
            System.out.println("Sayi Asal Degildir");
        }
        //EVEN/ODD NUMBERS
        System.out.println("Cift Sayi Icin Lutfen Bir Deger Giriniz");
        double number1 = input.nextDouble();
        if (number1 % 2 == 0) {
            evenNumber = true;
        }
        if (evenNumber) {
            System.out.println("Sayi Cift Sayidir");
        } else {
            System.out.println("Sayi Tek Sayidir");
        }

        System.out.println("Incelik veya Kalınlık Ozelligi Icin Bir Sesli Harf Giriniz");
        var harf = input.next();
        switch (harf) {
            case "A":
            case "I":
            case "O":
            case "U":
                System.out.println("Kalın Sesli Harf");
                break;
            case "E":
            case "İ":
            case "Ö":
            case "Ü":
                System.out.println("İnce Sesli Harf");
            default:
                System.out.println("Lütfen Sesli Harf Giriniz");
        }
        //PERFECT NUMBERS
        System.out.println("Mükemmel Sayi Icin Lütfen Bir Değer Giriniz");
        int numberPerfect = input.nextInt();
        int totalOfDividers = 0;
        for (int i = 1; i < numberPerfect; i++) {
            if (numberPerfect %i == 0) {
                totalOfDividers = totalOfDividers +i;                            
            }
            
            }
        if(numberPerfect == totalOfDividers){
                System.out.println("sayı mükemmel sayidir");
            }
        else{
            System.out.println("Sayi mükemmel sayi degildir.");
        }
        
        //FRIEND SAYILAR
        System.out.println("Lütfen Arkadaş Sayı Dogrulamasi Icin Ilk Sayiyi Giriniz.");
        int numberFriends1 = input.nextInt();
        System.out.println("Lütfen Arkadaş Sayı Dogrulamasi Icin Ikinci Sayiyi Giriniz.");
        int numberFriends2 = input.nextInt();
        int totalOfDividers1 = 0;
        int totalOfDividers2 = 0;
        
        for (int l = 1; l < numberFriends1; l++) {
            if (numberFriends1 %l == 0) {
                totalOfDividers1 = totalOfDividers1 +l;
            }
        }
                
        for (int k = 1; k < numberFriends2; k++) {
            if (numberFriends2 %k == 0) {
                totalOfDividers2 = totalOfDividers2 +k;
            }
        }
        if(totalOfDividers1==totalOfDividers1){
            System.out.println("Girilen Sayılar Arkadaş Sayıdır");
        }
        
    }

}
