/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Random;

/**
 *
 * @author user
 */
public class Task4 {
    public void run(){
        System.out.println("----- Задача 4 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными ЧЕТНЫМИ числами и выводим \nего значения в цикле");
        int myArr[] = new int[10];
        int number = 0;
        Random random = new Random();
        for(int i=0;i<myArr.length;i++){
            number = random.nextInt(49-0+1)-0;
            if ((number%2)!= 0){
                number = number*2;
            }
            myArr[i]=number;
            System.out.printf("%4d",myArr[i]);
            System.out.println();
        }
            
        System.out.println("----- конец задачи 4 ------");
    }
}
