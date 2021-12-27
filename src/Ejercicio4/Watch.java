package Ejercicio4;

public class Watch extends Device{

    String bezel;
    boolean eCG;
    boolean sPo2;

    public Watch() {

    }

    public Watch(String bezel) {
        this.bezel = bezel;

    }

    public Watch(String brand, String model, int year, Display display, String processor, int ram, int storage, int battery, int price, String bezel) {
        super(brand, model, year, display, processor, ram, storage, battery, price);
        this.bezel = bezel;

    }
    public String ekg(boolean eCG){
        this.eCG = eCG;
        if(eCG == true){
            return "Electrocardiograma completo: Estás bien";
        }
        return "Electrocardiograma apagado";
    }
    public String Oxigen(boolean sPo2){
        this.sPo2 = sPo2;
        if(sPo2 == true){
            return "Midiendo el oxigeno en sangre";
        }
        return "He terminado de medir el oxigeno en sangre";
    }

    @Override
    public String toString() {
        return "Watch{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", display=" + display +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", battery=" + battery +
                ", bezel='" + bezel + '\'' +
                ", price=" + price +
                '}';
    }
}