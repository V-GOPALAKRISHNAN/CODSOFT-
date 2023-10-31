package karthickjava;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

       
        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+,EXCELLENT";
        } else if (averagePercentage >= 80) {
            grade = "A,GREAT";
        } else if (averagePercentage >= 70) {
            grade = "B,GOOD";
        } else if (averagePercentage >= 60) {
            grade = "C,NOT BAD";
        } else if (averagePercentage >= 50) {
            grade = "D,IMPROVE YOURSELF";
        } else {
            grade = "E,BETTER LUCK NEXT TIME";
        }

        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "R%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
