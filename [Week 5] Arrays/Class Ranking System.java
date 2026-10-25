/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author Ely Estolloso
 */
public class Ranking_System {
    static class Student {
        String name;
        int[] quizzes;
        double average;

        Student(String name, int[] quizzes) {
            this.name = name;
            this.quizzes = quizzes;

            int sum = 0;
            for (int score : quizzes) {
                sum += score;
            }

            average = (double) sum / quizzes.length;
        }
    }
    
    public static void main(String[] args) {
        
        String[] names = {"Lalina", "Natsha", "Ginny", "Jayna", "Ellijah"};

        int[][] quizData = {
            {95, 97, 95, 99},
            {90, 95, 95, 97},
            {97, 94, 90, 87},
            {90, 85, 90, 95},
            {94, 92, 93, 95}
        };

        System.out.println("=================================================");
        System.out.println("           CLASS STATISTICS CALCULATOR");
        System.out.println("=================================================");
        
        Student[] students = new Student[names.length];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[i], quizData[i]);
        }

        // Manual sorting: highest average first
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].average < students[j + 1].average) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        System.out.println("-------------- CLASS LEADERBOARD ----------------");
        System.out.printf("%-8s %-12s %-10s%n", "Rank", "Name", "Average");
        System.out.println("-------------------------------------------------");

        int rank = 1;

        for (int i = 0; i < students.length; i++) {

            if (i > 0 && students[i].average != students[i - 1].average) {
                rank = i + 1;
            }

            System.out.printf("%-8d %-12s %.2f%n",
                    rank, students[i].name, students[i].average);
        }

        // Linear search: find a student's rank by name
        String searchName = "Ellijah";
        int foundRank = -1;

        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equalsIgnoreCase(searchName)) {
                foundRank = i + 1;

                // Linear search that returns the student's rank
                if (i > 0 &&
                    students[i].average == students[i - 1].average) {
                    foundRank = i;
                    while (foundRank > 1 &&
                           students[foundRank - 1].average ==
                           students[i].average) {
                        foundRank--;
                    }
                }

                break;
            }
        }

        if (foundRank != -1) {
            System.out.println("\n" + searchName + "'s Rank: " + foundRank);
        } else {
            System.out.println("\nStudent not found.");
        }
    }
    
}
