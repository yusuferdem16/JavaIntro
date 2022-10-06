/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intro;

/**
 *
 * @author Yusuf
 */
public class PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
         int number  = 2;
         boolean isPrime = true;
         
         if(number==1){
         System.out.println("Sayi Asal Degildir");
         return;
         }
         
         if (number<1){
         System.out.println("Gecersiz Sayi");
         return;
         }
         
         for (int i = 2; i < number; i++) {
             if(number %i == 0 ){
             isPrime = false; 
             }
            
        }
              if(isPrime){
                  System.out.println("Sayi Asaldir");
              }   
              else {
                 System.out.println("Sayi Asal Degildir");
              }
    }
    
}
