package wangxing;

import com.sun.corba.se.impl.presentation.rmi.StubFactoryProxyImpl;
import com.sun.org.apache.xerces.internal.impl.msg.XMLMessageFormatter_it;

/**
 * Created by Administrator on 13-7-30.
 */

//有1、2、3、4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
public class Test11 {

    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k < 5; k++) {
                    if ((i!=j)&&(j!=k)&&(i!=k)){
                        counter++;
                        System.out.print(100 * i + 10 * j + 1 * k + "\t");
                    }

                }

            }

        }
        System.out.println();
        System.out.println(counter);
    }
}
