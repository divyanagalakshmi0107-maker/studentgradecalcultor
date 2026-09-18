import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("       STUDENT GRADE CALCULATOR");
        System.out.println("====================================");

        // Student details
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();

        // Enter marks
        System.out.print("Enter marks in Subject 1: ");
        double sub1 = sc.nextDouble();

        System.out.print("Enter marks in Subject 2: ");
        double sub2 = sc.nextDouble();

        System.out.print("Enter marks in Subject 3: ");
        double sub3 = sc.nextDouble();

        System.out.print("Enter marks in Subject 4: ");
        double sub4 = sc.nextDouble();

        System.out.print("Enter marks in Subject 5: ");
        double sub5 = sc.nextDouble();

        // Calculate total
        double total = sub1 + sub2 + sub3 + sub4 + sub5;

        // Calculate average
        double average = total / 5;

        // Calculate percentage
        double percentage = (total / 500) * 100;

        // Determine grade
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Display result
        System.out.println("\n====================================");
        System.out.println("           STUDENT RESULT");
        System.out.println("====================================");

        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("------------------------------------");

        System.out.println("Subject 1    : " + sub1);
        System.out.println("Subject 2    : " + sub2);
        System.out.println("Subject 3    : " + sub3);
        System.out.println("Subject 4    : " + sub4);
        System.out.println("Subject 5    : " + sub5);

        System.out.println("------------------------------------");
        System.out.printf("Total Marks  : %.2f / 500%n", total);
        System.out.printf("Average      : %.2f%n", average);
        System.out.printf("Percentage   : %.2f%%%n", percentage);
        System.out.println("Grade        : " + grade);
        System.out.println("====================================");

        sc.close();
    }
}