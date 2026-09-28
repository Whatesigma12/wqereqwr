public class Task3 {
    public static class Car {
        String model;
        String license;
        String color;
        int year;

        public String toString() {
            return model + "/  " + license + "/  " + color + "/  " + year;
        }

        public Car(String model, String license, String color, int year) {
            this.model = model;
            this.license = license;
            this.color = color;
            this.year = year;
        };

        public Car() {
            this.model = "";
            this.license = "";
            this.color = "";
            this.year = 0;
        }

        public Car(String model, String color, int year) {
            this.model = model;
            this.license = "";
            this.color = color;
            this.year = year;
        }

    }

    public static void main(String[] args) {
        Car car1 = new Car("KIA CEE`D", "XWENDDJSDNSKN124", "Dark blue", 2017);
        Car car2 = new Car();
        Car car3 = new Car("Honda Civic", "", "White", 2011);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
