package Exercise_array;

import java.util.Arrays;
import java.util.Random;

public class Two_color_ball {
    public static void main(String[] args) {
        //创建红蓝球数组
        int[] red_ball = create(33);
        int[] blue_ball = create(16);
        System.out.print(Arrays.toString(red_ball) + "\n");
        System.out.print(Arrays.toString(blue_ball) + "\n");

        int[] Red_box = getRedBall(red_ball);
        System.out.print(Arrays.toString(Red_box) + "\n");
        int[] Blue_box = getBlueBall(blue_ball);
        System.out.print(Arrays.toString(Blue_box) + "\n");

    }

    //取红球的方法
    private static int[] getRedBall(int[] red_ball) {
        int[] get_red = new int[6];
        boolean[] flag = new boolean[red_ball.length]; //给一个标志标记取出来的球，判断标记有无去除重复选球
        for (int i = 0; i < 6; i++) {
            int j = 0;
            do {
                j = new Random().nextInt(red_ball.length);
            } while (flag[j]);
            flag[j] = true;
            get_red[i] = red_ball[j];
        }
        return get_red;
    }

    //取蓝球的方法
    private static int[] getBlueBall(int[] blue_ball) {
        int[] get_blue = new int[1];
        int j = new Random().nextInt(blue_ball.length);
        get_blue[0] = blue_ball[j];
        return get_blue;
    }

    //对数组随机赋值
    private static int[] create(int len) {
        int[] ball = new int[len];
        for (int i = 0; i < len; i++) {
            ball[i] = i + 1;
        }
        return ball;
    }
}
