package org.javaguru.student_Sem_Vi.lesson_2.level_3.task_1;

import java.util.Scanner;

public class MultyTable {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println( "Введите число: ");

            Integer num = scanner.nextInt();

            for (int i = 1; i <=10; i++) {
                System.out.println( num + " х " + i + " = " + num * i);
            }
        }
        
    }

}
