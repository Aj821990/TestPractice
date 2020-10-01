import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindBiggestSmallestNumber {

    public static void getSmallestBiggestNumber(Object[] a) {
        Arrays.sort(a);
        System.out.println("smallest number is = " + a[0]);
        System.out.println("biggest number is = " + a[a.length-1]);
    }

    public static void getNumbers()
    {
        List<Integer> numbersList = new ArrayList<>();
        int total, numbers;

        Scanner input = new Scanner(System.in);
        System.out.println("Total numbers you want to enter : ");
        total = input.nextInt();

        for (int i=1; i<=total; i++)
        {
            System.out.println("Enter your " + i + " number : ");
            numbers = input.nextInt();
            numbersList.add(numbers);
        }

        getSmallestBiggestNumber(numbersList.toArray());
    }

    public static void main(String args[]) {
        getNumbers();
    }
}
