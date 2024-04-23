// 1.1 Создать класс Car, Engine и Driver.
//....................................................
// 1.2 Класс Driver содержит поля - ФИО, стаж вождения.
// 1.3 Класс Engine содержит поля - мощность, производитель.
// 1.4 Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
//..................................................................
// 1.5 Вывести водителей со стажем более 5 лет.
// 1.6 Вывести автомобили советского производства
import java.util.*;

class Driver
{
    private String fullName;
    private int seniority;

    public Driver(String fullName, int seniority)
    {
        this.fullName = fullName;
        this.seniority = seniority;
    }

    public String getFullName()
    {
        return fullName;
    }
    public int getSeniority()
    {
        return seniority;
    }
}

class Engine
{
    private int power;
    private int productivity;

    public Engine(int power, int productivity)
    {
        this.power = power;
        this.productivity = productivity;
    }

    public int getPower()
    {
        return power;
    }
    public int getProductivity()
    {
        return productivity;
    }       
}

class Car
{
    private String brand;
    private String klass;
    private int mass;
    private Driver driver;
    private Engine engine;

    public Car(String brand, String klass, int mass, Driver driver, Engine engine)
    {
        this.brand = brand;
        this.klass = klass;
        this.mass = mass;
        this.driver = driver;
        this.engine = engine;
    }

    public String getBrand()
    {
        return brand;
    }
    public String getKlass()
    {
        return klass;
    }
    public int getMass()
    {
        return mass;
    }
    public Driver getDriver()
    {
        return driver;
    }
    public Engine getEngine()
    {
        return engine;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        List<Car> cars = new ArrayList<>();
        
        Driver driver1 = new Driver("Прошко Д.А.", 0);
        Driver driver2 = new Driver("Грищенко А.В.", 5);

        Engine engine1 = new Engine(120, 20);
        Engine engine2 = new Engine(130, 10);

        Car car1 = new Car("BMW", "эскорт", 100, driver1, engine1);
        Car car2 = new Car("ласточка", "премиум", 70, driver2, engine2);

        cars.add(car1);
        cars.add(car2);

        System.out.println("Водитель со сьажом не менее 5-и лет:");
        for(Car car : cars){
            if(car.getDriver().getSeniority() >= 5){
                System.out.println(car.getDriver().getFullName());
            }
        }
        
        System.out.println("Советский автмобиль: ");
        for(Car car : cars){
            if(car.getBrand() == "ласточка"){
                System.out.println(car.getBrand());
            }
        }
    }
}
