package HomeWorkAndrew.HomeWork1;


import java.util.Scanner;

public class HomeWork3 {
    public HomeWork3() {
    }

    public static void main(String[] args) {
        Scanner del = new Scanner(System.in);
        System.out.println("введите число");
        int x = del.nextInt();
        System.out.println("Введите число");
        int c = del.nextInt();
        int v = x / c;
        int m = x % c;
        System.out.print("Делить можно ,");
        System.out.print("Остаток от деления " + m + ",");
        System.out.print("Частное от деления " + v);
    }
}
