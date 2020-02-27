package q1_3;

import java.util.Collections;
import java.util.LinkedList;

public class DataAnalyzer {

    private LinkedList<Integer> numberList;

    /**
     * Constructs A DataAnalyzer object that is number list provided by the user.
     * The list provided is sorted and stored on the global numberList.
     *
     * @param numList List of numbers provided by the user input.
     */
    public DataAnalyzer(LinkedList<Integer> numList) {
        Collections.sort(numList);
        numberList = numList;
    }

    /**
     * Function to return the first number of the sorter list which would be the smallest.
     *
     * @return smallest number of the list.
     */
    public int min() {
        return numberList.getFirst();
    }

    /**
     * Function to return the last number of the sorter list which would be the largest.
     *
     * @return largest number in the list.
     */
    public int max() {
        return numberList.getLast();
    }

    /**
     * Calculates the average of the number list and returns it.
     *
     * @return integer with the value of the average of the number list.
     */
    public int average() {
        int sum = 0;
        for (Integer number : numberList) {
            sum = sum + number;
        }
        return sum / numberList.size();
    }

}
