package Ejercicio4;

public class Phone extends Device{


    int frontCamera;
    RearCamera rearcamera;
    boolean shoot;

    public Phone() {
    }

    public Phone(String brand, String model, int year, Display display, String processor, int ram, int storage,
                 int battery, int price, int frontCamera, RearCamera rearcamera) {
        super(brand, model, year, display, processor, ram, storage, battery, price);
        this.frontCamera = frontCamera;
        this.rearcamera = rearcamera;
    }
    public String pic(boolean shoot){
        this.shoot = shoot;
        if(shoot == true){
            return "Haz hecho una foto";
        }
        return "Camara en StandBy";
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", display=" + display +
                ", processor='" + processor + '\'' +
                ", ram=" + ram + "GB" +
                ", storage=" + storage + "GB" +
                ", battery=" + battery + "mAh" +
                ", price=" + price + "€" +
                ", frontCamera=" + frontCamera + "Mpx" +
                ", rearcamera=" + rearcamera +
                '}';
    }
}