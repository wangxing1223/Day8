package wangxing;

import java.util.Scanner;

/**
 * Created by Administrator on 13-7-30.
 */

//题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数

public class Test7 {

    public static void main(String[] args) {
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        String string = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：；");
        string = scanner.next();
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i]>47)&&(chars[i]<58)){
                counter1++;
            }else if ((chars[i]>64)&&(chars[i]<91)||((chars[i]>96)&&(chars[i]<123))){
                counter2++;
            }else if (chars[i] == 32){
                counter3++;
            }else {
                counter4++;
            }
        }
        System.out.println("数字的个数是： " + counter1);
        System.out.println("英文字母的个数是： " + counter2);
        System.out.println("空格的个数是： " + counter3);
        System.out.println("其他字符的个数是： " + counter4);
    }
}
