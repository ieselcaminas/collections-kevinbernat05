package Flujos;

import java.util.Arrays;

public class Ej4 {
    public static void main(String[] args) {
        int[] nums = {1,25,3,5,-5};

        Arrays.stream(nums)
                .filter(value -> value <= 5 && value >= 1)
                .forEach(value -> System.out.println(value));
    }
}
