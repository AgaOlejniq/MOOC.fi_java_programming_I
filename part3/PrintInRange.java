
import java.util.ArrayList;

public class PrintInRange {
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for (int number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(-1);
        list.add(7);
        list.add(12);
        list.add(-3);
        list.add(6);
        list.add(5);
        
        printNumbersInRange(list, -3, 5);
    }

}
