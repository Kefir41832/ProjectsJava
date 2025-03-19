class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final String color;

    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public String getColor() { return color; }

    public static class CarBuilder {
        private String brand = "Unknown";
        private String model = "Unknown";
        private int year = 2000;
        private String color = "White";

        public CarBuilder setBrand(String brand) { this.brand = brand; return this; }
        public CarBuilder setModel(String model) { this.model = model; return this; }
        public CarBuilder setYear(int year) { this.year = year; return this; }
        public CarBuilder setColor(String color) { this.color = color; return this; }

        public Car build() { return new Car(this); }
    }
}



// 🔴 Ошибка! car.setBrand("BMW"); Нельзя изменить объект!
