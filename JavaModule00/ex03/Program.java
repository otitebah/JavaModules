import java.util.Scanner;

public class Program{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Read the first part (e.g., "Week")
        String weekLabel = scanner.next();

        // Read the second part (e.g., 3)
        int weekNumber = scanner.nextInt();

        // Validate input
        if (!weekLabel.equals("Week") || weekNumber < 1 || weekNumber > 18) {
            System.out.println("IllegalArgument");
            System.exit(-1);
        }

        System.out.println("Week part: " + weekLabel);
        System.out.println("Week number: " + weekNumber);
    }
}

