import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
// через цикл if определяем какой год был введен с консоли (високосный или нет)
        if (isLeapYear(year)) {
            System.out.println ("12.09." + year);
        }
        else {
            System.out.println("13.09." + year);
        }
    }

    public static boolean isLeapYear(int year) {
// год считается високосным, если последние 2 цифры года делятся без остатка на 4
// в виду условий задания, вводтся 4-значное значение года
// Для такого значение необходимо соблюдение следующих условий:
        if (year % 400 == 0) { // при выполнении условия год високосный
            return true;
        }
        else if (year % 100 ==0){ // при выполнении условия год не високосный
            return false;
        }
        else if (year % 4 == 0) { // при выполнении условия год високосный
            return true;
        }
        else {
            return false; // иные варианты всегда будут не високосным годом
        }
    }
    }