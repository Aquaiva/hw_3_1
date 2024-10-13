package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Задача 1:");
        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
                    } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        System.out.println("Задача 2:");
        int clientDeviceYear = 2014;
        if (clientOS == 0) {
            System.out.println("Установите приложение для IOS по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Пройдите по ссылке для установки облегченной версии приложения для IOS");
            }
        } else {
            System.out.println("Установите приложение для Android по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Пройдите по ссылке для установки облегченной версии приложения для Android");
            }
        }


        System.out.println("Задача 3:");
        int year = 2100;
        if (year >= 1584) {
            if (year % 4 == 0) {
                System.out.println("Год является високосным");
            } else {
                System.out.println("Год не является високосным");
            }
        } else {
            System.out.println("Год не может быть меньше 1584!");
        }


        System.out.println("Задача 4:");
        int deliveryDistance = 100;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        }
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }
        if (deliveryDistance > 100) {
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