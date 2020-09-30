/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
class App {

    void run() {
        boolean work = true;
        int answer;
        while (work) {
            Scanner input = new Scanner(System.in);
            System.out.println("\u001B[35mЗадачи:");
            System.out.println("\u001B[36m(\u001B[35m0\u001B[36m) - Выход из программы.");
            System.out.println("\u001B[36m(\u001B[35m1\u001B[36m) - Конвентор градусов.");
            System.out.println("\u001B[36m(\u001B[35m2\u001B[36m) - Угадай число.");
            System.out.println("\u001B[36m(\u001B[35m3\u001B[36m) - 3 задача одномерный массив");
            System.out.println("\u001B[36m(\u001B[35m4\u001B[36m) - 4 задача");
            System.out.println("\u001B[36m(\u001B[35m5\u001B[36m) - 5 задача");
            System.out.println("\u001B[36m(\u001B[35m6\u001B[36m) - 6 задача");
            System.out.println("\u001B[36m(\u001B[35m7\u001B[36m) - 7 задача");
            System.out.println(" ");
            System.out.println("\u001B[35mВыберите задачу: " + "\u001B[32m");
            String choose = input.nextLine();
            System.out.println(" ");
            switch(choose){
                case"0":
                    System.out.println("Вы желаете выйти из программы?\n(1) - Да\n(2) - Нет");
                    answer = input.nextInt();
                    if (answer == 1){
                        work = false;
                    } else if (answer == 2){
                        break;
                    } 
                    break;

                case"1":
                    Weather();
                    System.out.println("Вы желаете выйти из программы?\n(1) - Да\n(2) - Нет");
                    answer = input.nextInt();
                    if (answer == 1){
                        work = false;
                    } else if (answer == 2){
                        break;
                    } 
                    break;

                case"2":
                    RandomGame();
                    System.out.println("Вы желаете выйти из программы?\n(1) - Да\n(2) - Нет");
                    answer = input.nextInt();
                    if (answer == 1){
                        work = false;
                    } else if (answer == 2){
                        break;
                    } 
                    break;

                case"3":
                    Task3();
                    System.out.println("Вы желаете выйти из программы?\n(1) - Да\n(2) - Нет");
                    answer = input.nextInt();
                    if (answer == 1){
                        work = false;
                    } else if (answer == 2){
                        break;
                    } 
                    break;

                case"4":
                    Task4();
                    System.out.println("Вы желаете выйти из программы?\n(1) - Да\n(2) - Нет");
                    answer = input.nextInt();
                    if (answer == 1){
                        work = false;
                    } else if (answer == 2){
                        break;
                    } 
                    break;

                case"5":
                    Task5();
                    System.out.println("Вы желаете выйти из программы?\n(1) - Да\n(2) - Нет");
                    answer = input.nextInt();
                    if (answer == 1){
                        work = false;
                    } else if (answer == 2){
                        break;
                    } 
                    break;

                case"6":
                    Task6();
                    System.out.println("Вы желаете выйти из программы?\n(1) - Да\n(2) - Нет");
                    answer = input.nextInt();
                    if (answer == 1){
                        work = false;
                    } else if (answer == 2){
                        break;
                    } 
                    break;

                case"7":
                    Task7();
                    System.out.println("Вы желаете выйти из программы?\n(1) - Да\n(2) - Нет");
                    answer = input.nextInt();
                    if (answer == 1){
                        work = false;
                    } else if (answer == 2){
                        break;
                    } 
                    break;
            }
        }
    }
    private void Weather(){
        Scanner input = new Scanner(System.in);
        double f;
        double c;
        int d = 32;
        double k = 273.15;
        double b = 1.8;
        double z = 0;
        double p = 459.67;
        System.out.println("Конвентер градусов Цельсия в градусы по Фаренгейту или наоборот.");
        input.nextLine();
        System.out.println("Выберите: (1)-Цельсия в фаренгейт (2) - Цельсия в фаренгейт (3) - Цельсия в кельвин (4) - Кельвин в Цельсия (5) - Кельвин в фаренгейт: ");
        int znak = input.nextInt();
        switch (znak) {
            case 1:
                System.out.println("Введите градусы по Цельсию: ");
                double gradC1 = input.nextDouble();
                z = gradC1 * b + d;
                System.out.println("По фаренгейту: " + z);
                break;
            case 2:
                System.out.println("Введите градусы по Фаренгейту: ");
                double gradF1 = input.nextDouble();
                z = (gradF1 - d) / b;
                System.out.println("По цельсию: " + z);
                break;
            case 3:
                System.out.println("Введите градусы по Цельсию: ");
                double gradC2 = input.nextDouble();
                z = gradC2 + k;
                System.out.println("По кельвина: " + z);
                break;
            case 4:
                System.out.println("Введите градусы по Кельвина: ");
                double gradK1 = input.nextDouble();
                z = gradK1 - k;
                System.out.println("По цельсия: " + z);
                break;
            case 5:
                System.out.println("Введите градусы по Кельвина: ");
                double gradK2 = input.nextDouble();
                z = gradK2 * b - p;
                System.out.println("По фаренгейту:" + z);
                break;
                
    
    }
}
    private void RandomGame(){
        System.out.println("\u001B[31m----- Задача 2 ------\u001B[0m");
        System.out.println("Загадано число от 5 до 10: ");
        Random random = new Random();
        System.out.println("Отгадай: ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        int p = 4;
        for(int i = 4; i > -1; i--){
            int amount = (random.nextInt(10 - 5) + 5);
            if(p == 0){
                System.out.println("Ты  проиграл!");
                System.out.println("\u001B[31m----- конец задачи 2 ------\u001B[0m");
                break;
            }else if (answer == amount){
                System.out.println("Ты выиграл!");
                System.out.println("\u001B[31m----- конец задачи 2 ------\u001B[0m");
                break;
            } else if (answer != amount){
                System.out.printf("%nНе верно%nЕще %d попыток.%n", i);
                System.out.println("Отгадай: ");
                p = p - 1;
                answer = input.nextInt();
            }
        }
    }
    private void Task3(){
        System.out.println("----- Задача 3 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле:");
        int myArr[] = new int[10];
        int sum = 0;
        int ran;
        Random random = new Random();
        for(int i = 0; i < myArr.length; i++){
            ran = random.nextInt(100);
            sum = sum + ran;
            myArr[i] = ran;
            System.out.printf("%5d%n", myArr[i]);
        }
        System.out.println("Сумма всех чисел массива: " + sum);
        int min = myArr[1];
        for (int i = 1; i > myArr.length; i++){
            if (myArr[i] < min){
                min = myArr[i];
            }
        }
        System.out.println("min = " + min);
        int max = myArr[1];
        for (int i = 1; i < myArr.length; i++) {
            if (myArr[i] > max)
                max = myArr[i];
        }
        System.out.println("max = " + max);
        System.out.println("----- конец задачи 3 ------");
}
    private void Task4(){
        System.out.println("----- Задача 4 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными ЧЕТНЫМИ числами и выводим \nего значения в цикле:");
        int myArr[] = new int[10];
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            boolean a = true;
            while (a){
            int ran = random.nextInt(1000);
            if (ran % 2 == 0){
                myArr[i] = ran;
                System.out.println(myArr[i]);
                a = false;
            }
            else {
                ran = random.nextInt(1000);
            }
            }
        }
        System.out.println("----- конец задачи 4 ------");
    }
    public void Task5(){
        System.out.println("----- Задача 5 ------");
        System.out.println("Создаем ДВУХМЕРНЫЙ массив  из 10х5 ячеек типа int, \\nзаполняем его случайными числами и выводим \\nего значения в цикле"); 

        int[][] a = new int[10][5];
        int max, min;
        Random ran = new Random();
        
        for (int i=0;i < a.length;i++) {
            for (int j = 0 ; j < a[i].length; j++) {
                a[i][j]=ran.nextInt(10) + 1;
            }
        }
        
        for (int i=0;i < a.length;i++,System.out.println()) {
            for (int j=0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
    }

    private void Task6(){
        System.out.println("Создаем ДВУХМЕРНЫЙ ЗУБЧАТЫЙ массив  из 10х(5,6,7,8,9) ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        int myArr[][] = new int[10][];
        int n = 1;
        int x;
        Random random = new Random();
        x = random.nextInt((600 - 500) + 500);
        boolean cycle = false;
        for (int i = 0; i < myArr.length; i++) {
            if (i == 5 | cycle) {
                cycle = true;
                n++;
            } else {
                n = i;
            }
            int num = n + 5;
            myArr[i] = new int[num];
            for (int j = 0; j < myArr[i].length; j++) {
                int randomNum = random.nextInt(x + 1);
                randomNum += x;
                myArr[i][j] = randomNum;
            }
        }
        for (int i = 0; i < myArr.length; i++) {
            for (int nu : myArr[i]) {
                System.out.printf("%4d", nu);
            }
            System.out.println("");

        }
    }
    private void Task7(){
        System.out.println("Введите строку");
        Scanner input = new Scanner(System.in);
        String words = input.nextLine();
        // посчитайте сколько раз в строке встречается введенная вами буква
        System.out.println("Введите букву: ");
        String letter = input.next();
        char[] chr = letter.toCharArray();
        int n = 0;
        char[] ch = words.toCharArray();
        for (char i : ch){
            if (i == chr[0]){
                n+=1;
            }
        }
        System.out.printf("Буква \"%s\" встречается в тексте %d раз\n", letter, n);
    }
}
