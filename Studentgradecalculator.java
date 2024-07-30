import java.util.Scanner;

public class Studentgradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tell me your marks in each subject");

        System.out.println("Enter your Maths marks out of 100");
        int Maths = sc.nextInt();
        if (Maths > 100 || Maths < 0) {
            System.out.println("Invalid Marks");
            return;
        }

        System.out.println("Enter your Physics marks out of 100");
        int Physics = sc.nextInt();
        if (Physics > 100 || Physics < 0) {
            System.out.println("Invalid Marks");
            return;
        }

        System.out.println("Enter your Chemistry marks out of 100");
        int Chemistry = sc.nextInt();
        if (Chemistry > 100 || Chemistry < 0) {
            System.out.println("Invalid Marks");
            return;
        }

        System.out.println("Enter your English marks out of 100");
        int English = sc.nextInt();
        if (English > 100 || English < 0) {
            System.out.println("Invalid Marks");
            return;
        }

        System.out.println(
                "Enter your 5th Subject marks either Hindi / Physical Education / Computer Science / Information Technology");
        int Subject = sc.nextInt();
        if (Subject > 100 || Subject < 0) {
            System.out.println("Invalid Marks");
            return;
        }

        int TotalMarks = Maths + Physics + Chemistry + English + Subject;
        System.out.println("Total Marks = " + TotalMarks);

        double per = (double) TotalMarks / 5;

        String grade;
        if (per >= 90) {
            grade = "A";
        } else if (per >= 80) {
            grade = "B";
        } else if (per >= 70) {
            grade = "C";
        } else if (per >= 60) {
            grade = "D";
        } else if (per >= 33) {
            grade = "E";
        } else {
            grade = "F";
        }

        if (Maths >= 33 && Physics >= 33 && Chemistry >= 33 && English >= 33 && Subject >= 33 && per >= 40) {
            System.out.println("Congratulations!! you have scored " + per + "% and your grade is " + grade);
        } else {
            System.out.println("You have scored " + per + "% You are Failed in the examination");
        }
    }
}
