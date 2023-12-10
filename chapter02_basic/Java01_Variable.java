/*
  TODO 011 基础语法 变量 基本操作
 */

package chapter02_basic;

public class Java01_Variable {
    public static void main(String[] args) {

        // TODO 变量
        // 所谓得变量，其实就是可以改变的向量存储
        // TODO 1. 声明变量
        // 数据类型 变量名称
        String name;
        // TODO 2. 变量赋值
        // 变量名称 = 数据
        name = "lisi";
        // TODO 3. 变量使用
        // 直接访问变量的名称即可
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);

        // 实际开发时，可以将第一步和第二步合并在一起，将变量声明和赋值在一行代码中完成
        String username = "wangwu";
        System.out.println(username);

        // 在使用变量之前，必须要给变量赋值，将这个操作称之为变量的"初始化"
        String email;
        email = "xxxxx";
        System.out.println(email);
    }
}
