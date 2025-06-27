package org.javaguru.student_Sem_Vi.lesson_2.level_3.task_3;

import java.util.Scanner;

public class Arifm {

    public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {
            System.out.println( "Введите 3 числа: ");

            double n1 = scanner.nextDouble();
            double n2 = scanner.nextDouble();
            double n3 = scanner.nextDouble();

            double arif = (double) ((n1 + n2 + n3) / 3);

            System.out.println("Среднее арифметическое ваших 3 введенных чисел " + arif);
        }
    }
}
