package day.two;

import java.util.Arrays;

public class ProgramAlarm {

    public static int alarmCode(int noun, int verb) {

        int[] codes = {
                1, noun, verb, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1,
                5, 0, 3, 2, 6, 1, 19, 1, 19, 5, 23, 2, 10, 23, 27, 2, 27, 13, 31, 1, 10, 31, 35, 1, 35, 9, 39, 2,
                39, 13, 43, 1, 43, 5, 47, 1, 47, 6, 51, 2, 6, 51, 55, 1, 5, 55, 59, 2, 9, 59, 63, 2, 6, 63, 67, 1, 13, 67, 71, 1, 9, 71, 75, 2, 13, 75, 79, 1,
                79, 10, 83, 2, 83, 9, 87, 1, 5, 87, 91, 2, 91, 6, 95, 2, 13, 95, 99, 1, 99, 5, 103, 1, 103, 2, 107, 1, 107, 10, 0, 99, 2, 0, 14, 0
        };

        for (int i = 0; i < codes.length; i+=4) {

            System.out.println("i = " + i);
            int first = i + 1;
            int firstPosition = codes[first];
            int firstNum = codes[firstPosition];
            System.out.println("first num: " + firstNum);
            int second = i + 2;
            int secondPosition = codes[second];
            int secondNum = codes[secondPosition];
            System.out.println("second num: " + secondNum);
            int third = i +3;
            int thirdPosition = codes[third];
            int thirdNum = codes[thirdPosition];
            System.out.println("number to be replaced: " + thirdNum);

            if (codes[i] == 1) {
                int add = firstNum + secondNum;
                System.out.println("replace with: " + add);
                codes[thirdPosition] = add;
                System.out.println("new number in replaced location: " + thirdNum);
            }
            else if (codes[i] == 2) {
                int multi = firstNum * secondNum;
                System.out.println("replace with: " + multi);
                codes[thirdPosition] = multi;
                System.out.println("new number in replaced location: " + thirdNum);
            }
            else if (codes[i] == 99) {
                System.out.println("number to return is: " + codes[0]);
                System.out.println("codes: " + Arrays.toString(codes));

                return codes[0];
            }
        }

        System.out.println(codes[0]);
        System.out.println("codes: " + Arrays.toString(codes));
        return codes[0];
    }

    public static void task2() {

        for (int noun = 0; noun < 100; noun++) {
            for (int verb = 0; verb < 100; verb++) {
                if (alarmCode(noun, verb) == 19690720) {
                    System.out.println("noun: " + noun + "verb: " + verb);
                    return;
                }
            }
        }
    }
}


