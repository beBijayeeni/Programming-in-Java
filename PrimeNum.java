import java.util.Scanner;
class Number {
    protected int[] arr;
    public Number(int n) {
        arr = new int[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public void display() {
        System.out.print("All numbers: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
class OddNum extends Number {
    protected int[] oddArr;
    public OddNum(int n) {
        super(n);                  
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) count++;
        }
        oddArr = new int[count];
        copyOdd();
    }
    private void copyOdd() {
        int idx = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                oddArr[idx++] = num;
            }
        }
    }
    public void displayOdd() {
        System.out.print("Odd numbers: ");
        for (int num : oddArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
public class PrimeNum extends OddNum {
    private int[] primeArr;

    public PrimeNum(int n) {
        super(n);                                               
        int count = 0;
        for (int num : oddArr) {
            if (isPrime(num)) count++;
        }
        primeArr = new int[count];
        copyPrime();
    }
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    private void copyPrime() {
        int idx = 0;
        for (int num : oddArr) {
            if (isPrime(num)) {
                primeArr[idx++] = num;
            }
        }
    }
    public void displayPrime() {
        System.out.print("Prime numbers: ");
        for (int num : primeArr) {
            System.out.print(num + " ");
		}
    System.out.println();
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        PrimeNum pn = new PrimeNum(n);
        pn.display();
        pn.displayOdd();
        pn.displayPrime();
    }
}