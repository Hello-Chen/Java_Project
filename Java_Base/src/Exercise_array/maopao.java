package Exercise_array;

import java.util.Random;

public class maopao {
    public static void main(String[] args) {
        double[] credit = new double[5];
        sui_ji(credit);
        System.out.println("该同学学分情况如下: ");
        pai_xu(credit);
    }

    private static void sui_ji(double[] credit) {
        Random ran = new Random();
        for (int i = 0; i < 5; i++) {
            credit[i] = ran.nextDouble() * 100;
        }
        for (int i = 0; i < credit.length; i++) {
            System.out.println(String.format("%.2f", credit[i]));
        }
    }

    private static void pai_xu(double[] credit) {
        for (int i = 0; i < credit.length - 1; i++) {
            for (int j = 0; j < credit.length - 1 - i; j++) {
                if (credit[j] > credit[j + 1]) {
                    double temp = credit[j];
                    credit[j] = credit[j + 1];
                    credit[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < credit.length; i++) {
            System.out.println(String.format("%.2f", credit[i]));
        }
    }
}
