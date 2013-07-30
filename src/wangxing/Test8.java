package wangxing;

import java.util.Scanner;

/**
 * Created by Administrator on 13-7-30.
 */

//求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
//例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。


public class Test8 {

    private static long sum = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input n:");
        int n = scanner.nextInt();
        System.out.println("请输入有几个数相加: ");
        int m = scanner.nextInt();

        for (int i = 1; i <=m ; i++) {
            sum += (long)(n*i*Math.pow(10,m-i));
        }
        System.out.println(sum);
    }
}
