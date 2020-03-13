package Exercise_pi;

import java.util.Scanner;

public class pi {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("please data");
        String s = scanner.nextLine();
        System.out.println(s);

        double sum=0;
        for (int a=1,b=1,i=1;i<=1000000000;a=-a,b=b+2,i++){
            sum=sum+a/(double)b;
        }
        double pi =sum*4;
        System.out.println("π="+pi);
    }
}
