package  HomeWorkAndrew.HomeWork1;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner sim = new Scanner(System.in);
        {
            System.out.println("Введите целое число");
        }
        int a = sim.nextInt();
        boolean simvol = (65 <= a) && (a <= 90);
        boolean simvol1 = (97 <= a) && (a <= 122);
        if (simvol) {
            System.out.println("Код буквы");
        } else if (simvol1) {
            System.out.println("Код буквы");
        } else {
            System.out.println("Небуквенный символ");
        }
    }
}


