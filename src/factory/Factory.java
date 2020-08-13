package factory;

/**
 * 实例工厂方法
 */
public class Factory {
    public Car getCar(){
        return new Car(null);
    }
}
class Car{
    public Car(Object object) {
        super();
    }
}