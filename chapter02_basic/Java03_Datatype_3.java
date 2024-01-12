/*
  TODO 016 基础语法 数据类型 引用数据类型
 */

package chapter02_basic;

public class Java03_Datatype_3 {
    public static void main(String[] args) {

        // TODO 引用数据类型
        // 所谓的引用数据类型，其实就是可以被引用的数据类型
        String info = "abc";

        int i = 10;

        // TODO byte和char的关系

        // char(16 bit) -> byte(8 bit)

        // asc码
        // gb2112 gbk
        // shift_jis

        // Java : Unicode
        //  asc码字符 ： 一个字节就是一个字符
        //  其他编码字符 ： 3个字节是一个字符
        String s = "中国a";
        String 姓名 = "中国a";

        // 获取字节的数量
        System.out.println(s.getBytes().length);
        // 获取字符的数量
        System.out.println(s.toCharArray().length);


    }
}
