package J04_DongulerVeKararMekanizmalari;

import java.util.Scanner;

public class Pratik03_GirilenSayidanKucukOlanIkininKuvvetleri {
    public static void main(String[] args) {
        //ava döngüler ile girilen sayıya kadar olan
        // 2'nin kuvvetlerini ekrana yazdıran
        // programı yazıyoruz.
        int n;
            Scanner scan = new Scanner(System.in);
            System.out.print("Please enter an Integer ; ");
            n = scan.nextInt();
            for(int i=1 ;i<=n ;i*=2){
                System.out.print(i+ ", ");
            }







    }
}
