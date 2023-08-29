package Strings;

public class RomanToIntegers {

    public static void main(String[] args) {

        int number = romanToInt("i");
        System.out.println(number);
    }

    //method to convert
    public static int romanToInt(String s){

        if (s.equalsIgnoreCase("I")){
            return 1;
        }
        return 0;
    }
}
