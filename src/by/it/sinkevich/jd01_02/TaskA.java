package by.it.sinkevich.jd01_02;

import java.util.ArrayList;
import java.util.List;

class TaskA {

    int getMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }

    int getMin(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }

    int[] getShortestNumbers(int[] numbers) {
        int minLength = Util.getNumberLength(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            if (minLength > Util.getNumberLength(numbers[i])) {
                minLength = Util.getNumberLength(numbers[i]);
            }
        }
        List<Integer> shortestNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (minLength == Util.getNumberLength(num)) {
                shortestNumbers.add(num);
            }
        }
        int[] result = new int[shortestNumbers.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = shortestNumbers.get(i);
        }
        return result;
    }

    int[] getLongestNumbers(int[] numbers) {
        int maxLength = Util.getNumberLength(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            if (maxLength < Util.getNumberLength(numbers[i])) {
                maxLength = Util.getNumberLength(numbers[i]);
            }
        }
        List<Integer> longestNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (maxLength == Util.getNumberLength(num)) {
                longestNumbers.add(num);
            }
        }
        int[] result = new int[longestNumbers.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = longestNumbers.get(i);
        }
        return result;
    }

    double getAverage(int[] numbers) {
        double res = 0;
        for (int num : numbers) {
            res += num;
        }
        res = res / numbers.length;
        return res;
    }

    boolean hasUniqueDigits(int number) {
        char[] digits = Integer.toString(number).toCharArray();
        for (int i = 0; i < digits.length - 1; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[i] == digits[j]) return false;
            }
        }
        return true;
    }
}
