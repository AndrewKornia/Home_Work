package  HomeWorkAndrew.HomeWork1;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner age =new Scanner(System.in);
        {
            System.out.println("Введите год");
        }
        int age1 = age.nextInt();
        String b ="Год високосный";
        boolean x =(age1%4==0)||(age1/100==0);
        boolean a =(age1/100==0)||(age1/400==0);
        if(x)
        {
            System.out.print(age1+":");
            System.out.println(b);
        }else if (a)
        {
            System.out.print(age1+":");
            System.out.println(b);
        }else
        {
            System.out.print(age1+":");
            System.out.println("Год обычный");
        }

    }
}
