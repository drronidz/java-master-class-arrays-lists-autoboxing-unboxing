import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int integerValue = 10;
        int anotherIntegerValue = integerValue;

        System.out.println("Integer Value :" + integerValue);
        System.out.println("Another Integer Value :"+anotherIntegerValue);

        anotherIntegerValue++;

        System.out.println("Integer Value = " + integerValue);
        System.out.println("Another Integer Value = " +anotherIntegerValue);

        int[] integerArray = new int [5];
        int[] anotherArray = integerArray;

        System.out.println("Integer Array = " + Arrays.toString(integerArray));
        System.out.println("Another Array = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("After Change Integer Array = " + Arrays.toString(integerArray));
        System.out.println("After Change Another Array = " + Arrays.toString(anotherArray));

        anotherArray = new int [] {4, 5, 6, 7, 8};
        modifyArray(integerArray);

        System.out.println("After Modify Integer Array = " + Arrays.toString(integerArray));
        System.out.println("After Modify Another Array = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int [] array){
        array[0] = 2;
        array = new int [] {1, 2, 3, 4, 5};
    }
}
