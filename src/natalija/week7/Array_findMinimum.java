package natalija.week7;

public class Array_findMinimum {

    /*
    Question1: Array - Find Minimum
    Write a method that can find the maximum number from an int Array
     */

    public static void main(String[] args) {
        System.out.println(minNum(2,13,-7,0,7));
    }

    public static int minNum(int... arr){
        int min = arr[0];

        for(int each : arr){
            if(each < min){
                min = each;
            }
        }
        return min;
    }

}
