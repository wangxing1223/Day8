package wangxing;

import java.util.Scanner;

/**
 * Created by Administrator on 13-7-30.
 */

//企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利润高于10万元，
//低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；20万到40
//万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；
//60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%
//提成，从键盘输入当月利润，求应发放奖金总数？

public class Test12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double i;
        double n;
        System.out.println("请输入当月利润：");
        i = scanner.nextDouble();
        if (i <= 10){
            n = 0.1*i;
        }else if ((i > 10)&&(i < 20)){
            n = 10 * 0.1 + 0.075 * (i-10);
        }else if ((i >= 20)&&(i < 40)){
            n = 10 * 0.1 + 10 * 0.075 + (i-20) * 0.05;
        }else if ((i >= 40)&&(i < 60)){
            n = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + (i-40) * 0.03;
        }else if ((i >= 60)&&(i < 100)){
            n = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + (i-60) * 0.015;
        }else {
            n = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + 40 * 0.03 +( i-100) * 0.01;
        }
        System.out.println("应发放奖金总数" + n + "万元");
    }
}
