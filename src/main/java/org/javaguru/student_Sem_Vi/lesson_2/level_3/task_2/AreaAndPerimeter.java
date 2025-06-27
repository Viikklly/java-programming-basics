package org.javaguru.student_Sem_Vi.lesson_2.level_3.task_2;

import java.util.Scanner;

public class AreaAndPerimeter {


    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println( "Введите радиус круга (вещественное число): ");

            Double r = scanner.nextDouble();
            
            System.out.println("Perimeter is = " + 2 * Math.PI * r );
            System.out.println("Area is = " + Math.PI * Math.pow(r, 2));
        }
        
    }
    
}
