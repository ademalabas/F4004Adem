package J04_DongulerVeKararMekanizmalari;

import java.util.Scanner;


public class Pratik06_ArmstrongSayilariBulanProgram {
    public static void main(String[] args) {
/*
Armstrong Sayı Nedir ?
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.

1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634

54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748
 */

        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        number= input.nextInt();
        int basNumber=0,tenpNumber=number;
        int basValue;
        int result=0;
        int basPow;
        while (tenpNumber!=0){
            tenpNumber/=10;
            basNumber++;
        }
        tenpNumber=number;
        while (tenpNumber!=0){
            basValue=tenpNumber%10;
            basPow=1;
            for (int i=1; i<=basNumber; i++)
            {
                basPow*=basValue;
            }
            result+=basPow;
            tenpNumber/=10;
        }
        if (result==number){
            System.out.print(number+" sayısı bir Armstrong sayıdır.");
        }
        else {
            System.out.println(number+" sayısı bir Armstrong sayı değildir.");
        }
        /*
        int a = 2451, basamakSayisi = 0, numberCounter = 0;

        // Basamak Sayısı Bulma İşlemi
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0
        // 0 / 10 = 0

        while (a != 0) {
            a /= 10;
            numberCounter++;
        }

        // Bir sayının son basamağını bulma
        // 2451 % 10 = 1
        int b = 2451;
        int c = b % 10;

        int sub = 2, sup = 3;
        int result = 1;
        for (int i = 1; i <= sup; i++ ){
            result *= sub;
        }
        System.out.println(result);

         */








    }
}
