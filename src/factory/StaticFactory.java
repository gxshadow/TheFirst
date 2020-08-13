package factory;

/**
 * 静态工厂方法
 */
public class StaticFactory {
    private  StaticFactory(){

    }
    public static StaticFactory getInstance(){
        return new StaticFactory();
    }
}