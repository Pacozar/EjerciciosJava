package Ejercicio4;

public class Device {


        String brand;
        String model;
        int year;
        Display display;
        String processor;
        int ram;
        int storage;
        int battery;
        int price;
        boolean on;

        public Device(){

        }

        public Device(String brand, String model, int year, Display display, String processor, int ram, int storage, int battery, int price) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.display = display;
            this.processor = processor;
            this.ram = ram;
            this.storage = storage;
            this.battery = battery;
            this.price = price;

        }

        public String setOn(boolean on){
            this.on = on;
            if(on == true){
                return "Encendido";
            }
            return "Apagado";
        }

        @Override
        public String toString() {
            return "Device{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", year=" + year +
                    ", display=" + display +
                    ", processor='" + processor + '\'' +
                    ", ram=" + ram + "GB" +
                    ", storage=" + storage + "GB" +
                    ", battery=" + battery + "mAh" +
                    ", price=" + price + "€" +
                    '}';

    }
}
