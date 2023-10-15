package HWSeminar2;

public class Motorcycle extends Vehicle {
    private String company;
    private String model;
    private int yearRelease;
    private int numWheels;
    private int speed;

    public Motorcycle (String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.yearRelease = year;
        if (year < 0) {
            throw new IllegalArgumentException("Год выпуска мотоцикла должен быть положительным числом");
        }
        this.numWheels = 2;
        this.speed = 0;
    }
    public void testDrive() { this.speed = 75; }
    public void park() { this.speed = 0; }
    public String getCompany() { return company; }
    public String getModel() { return model; }
    public int getYearRelease() { return yearRelease; }
    public int getNumWheels() { return numWheels; }
    public int getSpeed() { return speed; }
    public String toString() { return "Этот  мотоцикл “ + year + “ “ + make + “ “ + model + “;"; }
}