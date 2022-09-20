import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentsAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[35];
        int length = scores.length;
        int sum = 0, lowest, highest, count = 0;
        double  average = 0.0;

        for (int i = 0; i < length; i++) {
            System.out.printf("Enter score %d out of %d%n", i + 1, length);
            int score = input.nextInt();
            scores[i] = score;
        }

        lowest = scores[0];
        highest = scores[0];

        for (int i = 0; i < length; i++) {
            sum = sum + scores[i];

            if (lowest > scores[i]) {
                lowest = scores[i];
            }

            if (highest < scores[i]) {
                highest = scores[i];
            }

            if (scores[i] >= 40) {
                count++;
            }

        }
        average = (double) sum / length;

        System.out.println("Average =: "+average);
        System.out.println("Count of Students passed test =: "+count);
        System.out.println("Highest Score =: "+highest);
        System.out.println("Lowest Score =: "+lowest);

    }
}
