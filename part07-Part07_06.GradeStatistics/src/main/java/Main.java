import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Register register = new Register();
        System.out.println("Enter point totals, -1 stops:");
        Scanner scan = new Scanner(System.in);
        while (true) {
            String input = scan.nextLine();
            int grade = Integer.parseInt(input);

            if (grade == -1) {
                break;
            }

            if (grade >= 0 && grade <= 100) {
                register.addGrade(grade);
            }

        }
        System.out.println("Point average (all): " + register.calcAverage());
        if (register.passingGrade() >= 50) {
            System.out.println("Point average (passing): " + register.passingGrade());
        } else {
            System.out.println("Point average (passing): -");
        }
        if (register.passPercentage() >= 40) {
            System.out.println("Pass percentage: " + register.passPercentage());
        } else {
            System.out.println("Pass percentage: 0.0");
        }
        System.out.println("Grade distribution:");
        register.printer(register.convertGradeScaleToPointScale());
    }
}