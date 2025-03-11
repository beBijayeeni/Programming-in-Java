import java.util.Scanner;

class MyArray 
{
    private int[] arr;
    private int size;

    public MyArray(int size) 
	{
        this.size = size;
        arr = new int[size];
        for (int i = 0; i < size; i++) 
		{
            arr[i] = 0;
        }
    }

    public void inputElements() 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) 
		{
            arr[i] = scanner.nextInt();
        }
    }

    public void displayArray() 
	{
        System.out.println("Array elements are: ");
        for (int i = 0; i < size; i++) 
		{
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void calculateSumAndAverage() 
	{
        int sum = 0;
        for (int i = 0; i < size; i++) 
		{
            sum += arr[i];
        }
        double average = (double) sum / size;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

    public void swapMaxMin() 
	{
        int maxIndex = 0, minIndex = 0;
        for (int i = 1; i < size; i++) 
		{
            if (arr[i] > arr[maxIndex]) 
			{
                maxIndex = i;
            }
            if (arr[i] < arr[minIndex]) 
			{
                minIndex = i;
            }
        }
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = temp;
        System.out.println("Max and Min elements swapped.");
    }

    public void findUniqueOccurrences() 
	{
        for (int i = 0; i < size; i++) 
		{
            boolean isUnique = true;
            for (int j = 0; j < size; j++) 
			{
                if (i != j && arr[i] == arr[j]) 
				{
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) 
			{
                int count = 0;
                for (int k = 0; k < size; k++) 
				{
                    if (arr[i] == arr[k]) 
					{
                        count++;
                    }
                }
                System.out.println("Element " + arr[i] + " occurs " + count + " time(s).");
            }
        }
    }

    public void makeThreeDigitNumbers() 
	{
        int greatestNum = 0;
        for (int i = 0; i < size - 2; i++) 
		{
            int num = createThreeDigitNumber(i);
            if (num > greatestNum) 
			{
                greatestNum = num;
            }
        }
        System.out.println("The greatest number formed from three consecutive digits: " + greatestNum);
    }

    private int createThreeDigitNumber(int index) 
	{
        int digit1 = reduceToSingleDigit(arr[index]);
        int digit2 = reduceToSingleDigit(arr[index + 1]);
        int digit3 = reduceToSingleDigit(arr[index + 2]);

        return digit1 * 100 + digit2 * 10 + digit3;
    }

    private int reduceToSingleDigit(int number) 
	{
        while (number >= 10) 
		{
            number = sumOfDigits(number);
        }
        return number;
    }

    private int sumOfDigits(int number) 
	{
        int sum = 0;
        while (number > 0) 
		{
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
class Q37{
	 public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        MyArray myArray = new MyArray(size);

        myArray.inputElements();
        myArray.displayArray();
        myArray.calculateSumAndAverage();
        myArray.swapMaxMin();
        myArray.displayArray();
        myArray.findUniqueOccurrences();
        myArray.makeThreeDigitNumbers();
    }
}