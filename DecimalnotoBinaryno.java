//This program converts a Decimal number to a Binary number in Java

import java.util.Scanner;
public class DecimalnotoBinaryno {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal Number = ");
        int n = sc.nextInt();
        sc.close();
        String str = "";
        while(n>0)
        {
            str = (n%2) + str;
            n = n/2;
        }
        System.out.println("Binary Number = "+str); 
    }
}