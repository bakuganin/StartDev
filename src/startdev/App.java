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
                System.out.println("Выход из программы...");
                break;
                
            case"1":
                Weather();
                break;
                
            case"2":
                RandomGame();
                break;
            
            case"3":
                Task3();
                break;
            
            case"4":
                Task4();
                break;
            
            case"5":
                break;
            
            case"6":
                Task6();
                break;
            
            case"7":
                break;
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
                System.out.println("По кельвина:" + z);
                break;
            case 4:
                System.out.println("Введите градусы по Кельвина: ");
                double gradK1 = input.nextDouble();
                z = gradK1 - k;
                System.out.println("По цельсия:" + z);
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
    private void Task5(){
        
    }
    private void Task6(){
        System.out.println("----- Задача 6 ------");
        System.out.println("Создаем ДВУХМЕРНЫЙ ЗУБЧАТЫЙ массив  из 10х(5,6,7,8,9) ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        int[][] myArr = new int[10][];
        myArr[0] = new int[5];
        myArr[1] = new int[6];
        myArr[2] = new int[7];
        myArr[3] = new int[8];
        myArr[4] = new int[9];
        Random random = new Random();
        for(int x = 0; x < myArr.length; x++){
            for(int y = 5; y < myArr[x].length; y++){
                myArr[x][y] = random.nextInt(10);
                System.out.println(myArr[x][y] + "\t");
            }
            System.out.println("");
        }
        System.out.println("----- конец задачи 6 ------");
    }
}