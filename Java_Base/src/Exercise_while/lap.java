//跑十圈，在第五圈时暂停5秒继续
package Exercise_while;

public class lap {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 10) {
            System.out.println("第"+count+"圈");
            count++;
            if (count==6) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("等5秒钟");
                }
            }
        }
    }
}
