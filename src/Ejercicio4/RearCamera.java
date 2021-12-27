package Ejercicio4;

public class RearCamera {

    int mainCam;
    int uWcam;
    int macro;

    public RearCamera(){

    }


    public RearCamera(int mainCam, int uWcam, int macro) {
        this.mainCam = mainCam;
        this.uWcam = uWcam;
        this.macro = macro;

    }

    @Override
    public String toString() {
        return "RearCamera{" +
                "mainCam=" + mainCam + "Mpx" +
                ", uWcam=" + uWcam + "Mpx" +
                ", macro=" + macro + "Mpx" +
                '}';
    }
}