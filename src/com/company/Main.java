package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Задача 1:");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача 2:");
        int clientDeviceYear = 2016;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android");
        } else {
            System.out.println("Установите обычную версию приложения для Android");
        }

        System.out.println("Задача 3:");
        int year = 1904;
        if ((year >= 1584) && ((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0))) {
                System.out.println("Год является високосным");
        } else if (year >= 1584) {
                System.out.println("Год не является високосным");
        } else {
            System.out.println("Год не может быть меньше 1584!");
        }

        System.out.println("Задача 4:");
        int deliveryDistance = 18;
        int deliveryDays;
        if (deliveryDistance <= 20) {
           deliveryDays = 1;
        }
        else if (deliveryDistance > 20 && deliveryDistance < 60) {
            deliveryDays = 2;
        }
        else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
          deliveryDays = 3;
         }
        else {
            deliveryDays = 0;
        }
        if (deliveryDays != 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        }else {
            System.out.println("Свыше 100 км доставки нет");
        }

        System.out.println("Задача 5:");
        byte monthNumber = 8;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("это месяц зимы");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("это месяц весны");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("это месяц лета");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("это месяц осени");
                break;
            default:
                System.out.println("в календаре нет такого месяца");

        }
    }
}