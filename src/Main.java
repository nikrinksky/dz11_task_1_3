import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1:");
        int year = getRandomIntegerBetweenRange(2000, 2028);
        checkYear(year);
    }

    public static int checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + " год не является высокосный");
        }
        return year;
    }

    public static void task2() {
        System.out.println("Задача 2:");
        int clientOS = getRandomIntegerBetweenRange(-1, 2);
        int clientDeviseYear = getRandomIntegerBetweenRange(2020, 2023);
        System.out.println(checkPhone(clientOS, clientDeviseYear));
    }

    public static String checkPhone(int clientOS, int clientDeviseYear) {
        String str = "";
        int iOs = 0;
        int android = 1;
        int currentYear = LocalDate.now().getYear();
        if (clientOS == iOs) {
            if (clientDeviseYear < currentYear) {
                str = "Установите облегченную версию приложения для iOS по ссылке";
            } else {
                str = "Установите версию  приложения для iOS по ссылке";
            }
        } else if (clientOS == android) {
            if (clientDeviseYear < currentYear) {
                str = "Установите облегчённую версию приложения для Android по ссылке";
            } else {
                str = "Установите версию  приложения для Android по ссылке";
            }
        } else {
            str = "Эта ОС не поддерживается";
        }
        return str;
    }

    public static void task3() {
        System.out.println("Задача 3:");
        int deliveryDistance = getRandomIntegerBetweenRange(20, 120);
        System.out.println(checkDistance(deliveryDistance));
    }

    public static String checkDistance(int deliveryDistance) {
        String str = "";
        int day = 1;
        if (deliveryDistance < 20) {
            str = "Потребуется дней: " + day;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            day += 1;
            str = "Потребуется дней: " + day;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            day += 2;
            str = "Потребуется дней: " + day;
        } else if (deliveryDistance >= 100) {
            str = "Доставки нет";
        }
        return str;
    }
    public static int getRandomIntegerBetweenRange(int min, int max) {
        int x = (int) (Math.random() * (max - min) + 1) + min;
        return x;
    }
}