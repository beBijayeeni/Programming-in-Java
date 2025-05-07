
import java.util.Scanner;
import mathop.MathsOperations;
import statop.StatsOperations;

public class MainApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
		MathsOperations maths = new MathsOperations();
        int maximum = maths.max(arr);
        int minimum = maths.min(arr);
        StatsOperations stats = new StatsOperations();
        double avg = stats.average(arr);
        double med = stats.median(arr);
        System.out.println("\nResults:");
        System.out.println("Maximum : " + maximum);
        System.out.println("Minimum : " + minimum);
        System.out.printf("Average : %.2f%n", avg);
        System.out.printf("Median  : %.2f%n", med);
    }
}
