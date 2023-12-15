public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("Suzuki", "Grand Vitara", 2012, 5, 1.9, 25000);
        Car car2 = new Car("Ford", "Focus", 2021, 5, 2.0, 28000);
        Car car3 = new Car("Toyota", "Rav4", 2015, 5, 1.5, 22000);

        Car[] cars = {car1, car2, car3};
        for (Car car : cars) {
            car.displayCarInfo();
        }
    }
}
