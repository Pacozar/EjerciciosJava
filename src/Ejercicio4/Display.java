package Ejercicio4;

public class Display {

    String type;
    double inch;
    String resolution;

    public Display(){

    }

    public Display(String type, double inch, String resolution) {
        this.type = type;
        this.inch = inch;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Display{" +
                "type='" + type + '\'' +
                ", inches=" + inch + "''" +
                ", resolution='" + resolution + '\'' +
                '}';
    }


}