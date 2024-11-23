import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Student Grade Calculator!");

        // Input: Number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Initialize variables
        int[] marks = new int[numSubjects];
        int totalMarks = 0;  // Total marks obtained
        int maxTotalMarks = numSubjects * 100; // Maximum possible marks

        // Input: Marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();

            // Validation: Ensure marks are between 0 and 100
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
                marks[i] = scanner.nextInt();
            }

            // Add marks to total
            totalMarks += marks[i];
        }

        // Calculate average marks
        double averageMarks = (double) totalMarks / numSubjects;

        // Determine grade based on average marks
        String grade;
        if (averageMarks >= 90) {
            grade = "A";
        } else if (averageMarks >= 80) {
            grade = "B";
        } else if (averageMarks >= 70) {
            grade = "C";
        } else if (averageMarks >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display results
        System.out.println("\n--- Student Report ---");
        System.out.println("Number of Subjects: " + numSubjects);
        System.out.println("Total Marks Obtained: " + totalMarks + " out of " + maxTotalMarks);
        System.out.printf("Average Marks: %.2f%n", averageMarks);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
