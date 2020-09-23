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
public class Task2 {
    public void run(){
        System.out.println("----- Задача 2 ------");
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
                System.out.println("----- конец задачи 2 ------");
                break;
            }else if (answer == amount){
                System.out.println("Ты выиграл!");
                System.out.println("----- конец задачи 2 ------");
                break;
            } else if (answer != amount){
                System.out.printf("%nНе верно%nЕще %d попыток.%n", i);
                System.out.println("Отгадай: ");
                p = p - 1;
                answer = input.nextInt();
            }

        
        }
        
    }
   
}