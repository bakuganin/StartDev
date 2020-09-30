
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Random;


/**
 *
 * @author Jegor Bakunin
 */
public class Task3 {
    public void run(){
        System.out.println("\u001B[31m----- Задача 3 ------\u001B[0m");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int,\nзаполняем его случайными числами и выводим его значения в цикле");
        int myArr[] = new int[10];
        int sum = 0;
        Random random = new Random();
        for(int i = 0; i < myArr.length; i++){
            myArr[i] = (random.nextInt(2000 - 1000) + 1000);
            sum = sum + myArr[i];
            
        }
        System.out.println("\u001B[35mСумма всех чисел массива: ");
        System.out.println(sum);
        System.out.println("\u001B[35mmin = " + min(myArr));
        System.out.println("\u001B[35mmax = ");
        System.out.println("\u001B[31m----- конец задачи 3 ------\u001B[0m");
    }
}