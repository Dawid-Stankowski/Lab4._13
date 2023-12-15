public class Car {
    // Pola klasy Car
    private String brand;
    private String model;
    private int year;
    private int numberOfDoors;
    private double engineCapacity;
    private double price;

    public Car(String brand, String model, int year, int numberOfDoors, double engineCapacity, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.numberOfDoors = numberOfDoors;
        this.engineCapacity = engineCapacity;
        this.price = price;
    }
    // Metoda wyświetlająca informacje o samochodzie
    public void displayCarInfo() {
        System.out.println("Marka: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + year);
        System.out.println("Liczba drzwi: " + numberOfDoors);
        System.out.println("Pojemność silnika: " + engineCapacity);
        System.out.println("Cena: " + price);
        System.out.println("-------------");
    }
}
