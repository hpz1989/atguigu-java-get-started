package chapter04;

public class Java14_Object_3 {
    public static void main(String[] args) {

        // TODO 面向对象
        //AAA aaa = new AAA();
        //BBB aaa = new BBB();
        BBB aaa = new BBB();
        test(aaa);

        // 多态其实就是约束了对象的使用场景
        // 方法的重载：方法名相同，参数列表不同(个数，顺序，类型)
        // AAA -> Object
        // BBB -> AAA -> Object

    }
    static void test( Object aaa ) {
        System.out.println("aaa");
    }
//    static void test( BBB bbb ) {
//        System.out.println("bbb");
//    }
}
class AAA {

}
class BBB extends AAA {

}
