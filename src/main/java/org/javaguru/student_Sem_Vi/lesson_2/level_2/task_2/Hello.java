package org.javaguru.student_Sem_Vi.lesson_2.level_2.task_2;

import java.util.Scanner;

public class Hello {
    
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println( "Введите ваше имя: ");

            String name = scanner.nextLine();

            System.out.println("Hello, " + name );
        }
        
    }
}
