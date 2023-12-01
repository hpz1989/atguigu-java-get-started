package chapter06_exception;

public class Java06_Exception {
    public static void main(String[] args) {

        // TODO 异常
        //IOException
        //SocketException
        //SQLException
        //FileNotFoundException
        //ClassNotFoundException
    }

}
class User6 {
    public void test() {
        // clone方法时Object类中的方法。可以复制当前对象。会发生异常
        try {
            this.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
