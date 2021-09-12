package  HomeWorkAndrew.HomeWork1;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner chet = new Scanner(System.in);
        {
            System.out.println("ВВедите цифру");
        }
        int x = chet.nextInt();
        if ((x % 2) == 0) {
            System.out.println();
        } else {
            System.out.println(x);
        }
    }
}
