public class Car {
    String model;
    String license;
    String color;
    int year;

    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

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

    public String To_String() {
        return model + "/  " + license + "/  " + color + "/  " + year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAge() {
        final int CURRENT_YEAR = 2026;
        return CURRENT_YEAR - year;
    }
}