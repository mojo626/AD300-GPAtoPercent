import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input GPA: ");
        String gpa = input.next();

        switch (gpa) {
            case "4.0":
                System.out.println("95% to 100%");
                break;
            case "0.0":
                System.out.println("0% to 65%");
                break;
            default:
                double gpaParsed = Double.parseDouble(gpa);

                if (gpaParsed < 1.0 || gpaParsed > 4.0) {
                    System.out.println("Please input a valid GPA");
                    break;
                }

                double upperPercent = 10 * gpaParsed + 56;

                System.out.println(String.valueOf(upperPercent - 1.0) + "% to " + String.valueOf(upperPercent) + "%");
                break;
        }

        input.close();
    }
}