package  HomeWorkAndrew.HomeWork1;


import java.util.Objects;
import java.util.Scanner;

public class HomeWork10 {

    public static void main(String[] args) {
        Scanner chet = new Scanner(System.in);
        System.out.println("Как тебя зовут?");
        String name = chet.nextLine();

        if (Objects.equals (name,"Вася")) {
            System.out.println("Привет");
            System.out.println("Я тебя так долго ждал");
        }

         else if (Objects.equals(name,"Анастасия")) {
            System.out.println("Я тебя так долго ждала");}
        else
            System.out.println("Добрый день , а вы кто ");

    }
}


