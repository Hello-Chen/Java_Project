package Exercise_while.work;

import java.util.Random;
import java.util.Scanner;

public class random_number_do_while {
    public static void main(String[] args) {
        int i = 1 + new Random().nextInt(1000);
        int d=0;

        System.out.println("随机数已经产生");
        do{
            d = new Scanner(System.in).nextInt();
            if(d > i){
                System.out.println("大于i");
            }else if(d < i){
                System.out.println("小于i");
            }else if(d == i){
                System.out.println("猜对了！");
                break;
            }
        }while(d!=i);
    }
}
