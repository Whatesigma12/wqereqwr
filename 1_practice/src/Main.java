public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("KIA CEE`D", "XWENDDJSDNSKN124", "Dark blue", 2017);
        Car car2 = new Car();
        Car car3 = new Car("Honda Civic", "White", 2011);

        System.out.println(car1.To_String());
        System.out.println(car2.To_String());
        System.out.println(car3.To_String());

        car1.setModel("KIA Sportage");
        car1.setColor("Black");
        car1.setYear(2022);

        System.out.println("После изменений:");
        System.out.println(car1.To_String());
        System.out.println("Модель: " + car1.getModel());
        System.out.println("Цвет: " + car1.getColor());
        System.out.println("Год: " + car1.getYear());

        System.out.println("Возраст car1: " + car1.getAge() + " лет");
        System.out.println("Возраст car3: " + car3.getAge() + " лет");
    }
}