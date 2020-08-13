package singleton;

/**
 * 饿汉式单列=====null
 */
public class Singleton1 {
    private static Singleton1 singleton1 = new Singleton1();

    private Singleton1(){

    }
    public static Singleton1 getSingleton(){
        return singleton1;
    }
}