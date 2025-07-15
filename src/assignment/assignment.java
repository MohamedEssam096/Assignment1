package assignment;

import java.util.Scanner;

public class assignment {
    public static double calcAverage(double s1, double s2, double s3) {
        return (s1 + s2 + s3) / 3.0;
    }
    public static char getGrade(double avg) {
        if (avg >= 85)
            return 'A';
        else if (avg >= 70)
            return 'B';
        else if (avg >= 50)
            return 'C';
        else
            return 'F';
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = in.nextInt();
        in.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nStudent #" + i);

            System.out.print("Student name: ");
            String name = in.nextLine();

            System.out.print("Exam 1 score: ");
            double e1 = in.nextDouble();

            System.out.print("Exam 2 score: ");
            double e2 = in.nextDouble();

            System.out.print("Exam 3 score: ");
            double e3 = in.nextDouble();
            in.nextLine();

            double avg   = calcAverage(e1, e2, e3);
            char   grade = getGrade(avg);

            System.out.printf("Name: %s | Average: %.2f | Grade: %c%n",
                    name, avg, grade);
        }
    }
}
