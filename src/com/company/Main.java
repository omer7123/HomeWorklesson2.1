package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Здравствуйте, как Вас зовут? ");
        String name = in.nextLine();

        System.out.print("Введите температуру окружающей среды: ");
        int temp = in.nextInt();

        System.out.print("Укажите Ваш возраст: ");
        int age = in.nextInt();

        if (age >= 20 && age <= 45 && temp > -20 && temp < 30) {
            System.out.println(name + " Вы можете идти гулять");
        } else if (age < 20 && temp > 0 && temp < 28) {
            System.out.println(name + ", Вы можете идти гулять");
        } else if (age > 45 && temp > -10 && temp < 25) {
            System.out.println(name + ", Вы можете идти гулять");
        } else {
            System.out.println(name + ", Вам лучше остаться сегодня дома");
        }

    }
}
