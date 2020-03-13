/*输入一个正整数判断是否为质数
* 分析: 质数判断条件1：大于1的自然数，2：除了1和它本身以外不再有其他因数的自然数。
* 变量: 质数个数：int a, 输入正整数：int num
*/
package Exercise_while.work;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        int a = 0;  // 质数的个数
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个正整数：");
        int num = input.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                a++;       // 质数个数加1
            }
        }

        if (a == 0) {
            System.out.println(num + "是质数");
        } else {
            System.out.println(num + "不是质数");
        }
    }
}
