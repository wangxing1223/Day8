package wangxing;

/**
 * Created by Administrator on 13-7-30.
 */

//一球从100米高度自由落下，每次落地后反跳回原高度的一半
//再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？


public class Test10 {

    public double height(int n){
        double height = 0;
        if(n == 1){
            height = 100;

        }else {
            height = 0.5*height(n - 1);
        }
        return height;
    }

    public double sum(int n){
        double sum = 0;
        if (n == 1){
            sum = 100;

        }else {
            sum = sum(n-1)+height(n-1);
        }
        return sum;
    }

    public static void main(String[] args) {
        Test10 test10 = new Test10();
        System.out.println("第10次反弹的高度是 ：" + test10.height(10) + "米");
        System.out.println("第10次落地时共经过 " + test10.sum(10) + "米");
    }
}
