package Activities;

import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args){
        int[] input={9, 5, 1, 4, 3 };
        int[]result=sortArrayOfInputs(input);
        System.out.println(Arrays.toString(result));

    }

    public static int[] sortArrayOfInputs(int[] inputArray){
        int firstValue=0;
        for (int i = 1; i < inputArray.length; i++) {
            firstValue= inputArray[i];
            int j = i - 1;
            while (j >= 0 && firstValue < inputArray[j]) {
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = firstValue;
        }
        return inputArray;
    }

}
