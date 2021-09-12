package  HomeWorkAndrew.HomeWork1;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner byt = new Scanner(System.in);
        {
            System.out.print("Введите число");
        }
        int x = byt.nextInt();


        System.out.println("Выберите b-байты или k-Килобайты ?");
        String a = byt.next();
        switch (a) {
            case "b":
                double v = x * 1024;
                System.out.println(v + "Байт");
            case "k":
                double v1 = x / 1024.0;
                System.out.println(v1 + "кБайт");
                break;
            default:
                System.out.println("Неправильное имя ввода ");

        }


    }
}


