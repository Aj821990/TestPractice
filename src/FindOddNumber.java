import java.util.ArrayList;
import java.util.List;

public class FindOddNumber {
    public static void main(String args[]) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                oddNumbers.add(i);
            }
        }
        System.out.println("oddNumbers are = " +oddNumbers);
    }
}

