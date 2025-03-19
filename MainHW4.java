public class MainHW4 {
    public static void main(String[] args) {
        // Использование
Car car = new Car.CarBuilder()
.setBrand("Tesla")
.setModel("Model S")
.setYear(2024)
.setColor("Black")
.build();

System.out.println(car.getBrand()); // Tesla
    }
    
}
