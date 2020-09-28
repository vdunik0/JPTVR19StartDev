/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
class App {

    public void run(){
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();
        Task5 task5 = new Task5();
        Task6 task6 = new Task6();
        Task7 task7 = new Task7();

        Scanner scanner = new Scanner(System.in);
        boolean Loop = true;
        while(Loop){
            System.out.println("Выьерите программу(1-7) или наберите 0, чтобы выйти");
            int value = scanner.nextInt();
            switch (value){
                case 0:
                    Loop = false;
                    break;
                case 1:
                    task1.run();
                    break;
                case 2:
                    task2.run();
                    break;
                case 3:
                    task3.run();
                    break;
                case 4:
                    task4.run();
                    break;
                case 5:
                    task5.run();
                    break;
                case 6:
                    task6.run();
                    break;
                case 7:
                    task7.run();
                    break;
                default:
                    break;
            }
        }
        }
    }