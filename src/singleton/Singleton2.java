package singleton;

/**
 * 懒汉式单列
 */
public class Singleton2 {
    private static volatile Singleton2 singleton2;

    private Singleton2(){

    }

    public static Singleton2 getSingleton2(){
        //判断有没有必要"锁"住代码
        if (singleton2 == null){
            synchronized ("java"){
                //判断有没有必要创建对象
                if(singleton2 == null){
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }
}