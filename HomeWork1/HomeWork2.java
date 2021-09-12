package HomeWorkAndrew.HomeWork1;


import java.util.Scanner;

public class HomeWork2 {
    public HomeWork2() {
    }

    public static void main(String[] args) {
        Scanner chislo = new Scanner(System.in);
        System.out.println("ВВедите любое число ");
        int x = chislo.nextInt();
        System.out.println("ВВедите любое  число  ");
        int b = chislo.nextInt();
        System.out.println("ВВедите любое число  ");
        int l = chislo.nextInt();
        System.out.print("Среднее число : ");
        if (x != b && x != l && b != l) {
            if ((b >= x || x >= l) && (x >= b || x <= l)) {
                if ((b <= x || b >= l) && (b >= x || b <= l)) {
                    System.out.println(l);
                } else {
                    System.out.println(b);
                }
            } else {
                System.out.println(x);
            }
        } else {
            System.out.println("Введите 3 разных целых числа ");
        }

    }
}
