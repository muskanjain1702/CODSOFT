import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // 2. Declare variables for marks, total, and percentage
        int[] marks = new int[numSubjects];
        int totalMarks = 0;
        double averagePercentage;

        // 3. Get marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " out of 100: ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i]; // Add marks to total
        }

        // 4. Calculate average percentage
        averagePercentage = (double) totalMarks / (numSubjects * 100) * 100; // Multiply by 100 to get percentage

        // 5. Calculate grade
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // 6. Display results
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}
