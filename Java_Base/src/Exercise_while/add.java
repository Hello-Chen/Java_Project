//编程实现：计算100以内（包括100）的偶数之和
package Exercise_while;

public class add {
    public static void main(String[] args) {
        int count=0;
        int sum=0;
        while (count<=100){
            if(count%2==0)
                sum+=count;
            count++;
        }
        System.out.println(sum);
    }
}
