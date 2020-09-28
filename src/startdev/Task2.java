/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author user
 */
public class Task2 {
    public void run(){
        System.out.println("----- Задача 2 ------");
        System.out.println("Загадано число от 5 до 10: ");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int attempt = 0;
        int max = 10;
        int min = 5;
        
        System.out.println("Отгадай: ");
        
        System.out.println("Введите число");
        
        do {
            int myNumber = random.nextInt(max-min+1)+min;
            
            int GamerNumber = scanner.nextInt();
            if(myNumber == GamerNumber) {
                System.out.println("Ты выиграл");
                break;
            } else {
                if (attempt >=3 ){
                    System.out.println("Ты проиграл!Число было "+ myNumber);
                    break;
                } else {
                    System.out.println("Попробуй ещё раз");
                }
                attempt++;
            }
        }while(true);
        System.out.println("----- конец задачи 2 ------");
    }
   
}

