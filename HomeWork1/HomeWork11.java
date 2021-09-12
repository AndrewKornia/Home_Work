package  HomeWorkAndrew.HomeWork1;


import java.util.Objects;
import java.util.Scanner;

public class HomeWork11 {

    public static void main(String[] args) {
        Scanner chet = new Scanner(System.in);
        System.out.println("Как тебя зовут?");
        String name = chet.nextLine();

        switch (name) {
            case "Вася":
                System.out.println("Привет");
                System.out.println(" Я так долго тебя ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так длолго ждала");
                break;
            default:
                System.out.println("Добрый день а вы кто?");
        }

    }
}

