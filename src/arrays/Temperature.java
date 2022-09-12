// Take input temperatures
// Calculate no of days input temp is greator than avg temp

package arrays;

import java.util.*;

public class Temperature {

    public static void main(String[] args) {
        Temperature temp = new Temperature();
        temp.getDays();
    }

    public void getDays() {

        try (Scanner console = new Scanner(System.in)) {
            System.out.print("Enter no. of days:");
            int numOfDays = console.nextInt();

            int tempArr[] = new int[numOfDays];
            double totalTemp = 0;
            for (int i = 1; i <= numOfDays; i++) {
                System.out.print("Enter day " + i + " temp:");
                tempArr[i - 1] = console.nextInt();
                totalTemp += tempArr[i - 1];
            }
            int days = 0;
            for (int i = 0; i < numOfDays; i++) {
                if (totalTemp / numOfDays < tempArr[i]) {
                    days++;
                }

            }
            System.out.println("Avg temp:" + totalTemp / numOfDays);
            System.out.println("Days having temp greator thn avg:" + days);
        }

    }

}
