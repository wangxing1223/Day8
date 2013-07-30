package wangxing;

/**
 * Created by Administrator on 13-7-30.
// */
//题目：一个数如果恰好等于它的因子之和，这个数就称为 "完数 "
// 。例如6=1＋2＋3.编程     找出1000以内的所有完数。


public class Test9 {

   public int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
             if(n%i == 0){
                 sum = sum+i;
             }
        }
        return sum;
   }

    public static void main(String[] args) {

        Test9 test9 = new Test9();
        for (int i = 1; i < 1000 ; i++) {
            if ( test9.sum(i) == i){
            System.out.print(i + "\t");

            }
        }
    }
}
