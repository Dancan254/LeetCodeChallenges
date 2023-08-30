package Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] arr = {
                {2, 9, 6},
                {9, 7, 89},
                {7}
        };
        for (int[] ints : arr) {
            Arrays.sort(ints);
        }
        for (int[] nums: arr){
            System.out.println(Arrays.toString(nums));
        }

        boolean element = findElement(arr, 8);
        System.out.println("Found: " + element);

        System.out.println(Arrays.toString(search(arr, 9)));
    }

    //method to find target
    public static boolean findElement(int[][] arr, int target){
        //iterate through the array
        for (int[] ints : arr) {
            for (int element : ints){
                if (element == target){
                    return true;
                }
            }

        }
        return false;
    }

    public static int[] search(int[][] numbers, int target){
        int row = 0;
        int column = numbers.length - 1;
        while(row < numbers.length && column > 0){
            if (numbers[row][column] == target){
                return new int[]{row, column};
            } else if (numbers[row][column] < target) {
                row++;
            }
            else{
                column--;
            }
        }
        return new int[]{};
    }
}
