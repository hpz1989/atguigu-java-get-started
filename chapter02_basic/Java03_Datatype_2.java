/*
  TODO 015 基础语法 数据类型 数据类型之间的转换
 */

package chapter02_basic;

public class Java03_Datatype_2 {
    public static void main(String[] args) {

        // TODO 数据类型的转换

        String name = "zhangsan";
        int age = 30;

        name = "lisi";
        // 类型直接指向另一数据类型不被允许
        //name = age;

        // byte -> short -> int -> long -> float -> double
        // 浮点类型要比整数类型大，可以直接转换
        byte b = 10;

        short s = b;

        int i = s;

        long lon = i;

        float f = lon;

        double d = f;
        // Java中范围小的数据可以直接转换位范围大的数据，但是范围大的数据无法直接转换位范围小的数据
        // 如果想要将范围大的数据转换位范围小的数据，那么需要使用小括号进行强制转换。
        int i1 = (int)d;



    }
}
