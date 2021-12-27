package Ejercicio4;

public class Main {

    public static void main(String[] args) {

        Display dM11 = new Display("Amoled", 6.81, "WQHD+");
        RearCamera rC11 = new RearCamera(108, 8,5);
        Phone mi11 = new Phone("Xiaomi", "Mi 11", 2021, dM11, "Snapdragon 888", 8, 256, 5000, 890, 16, rC11);
        System.out.println(mi11);
        System.out.println(mi11.setOn(true));
        System.out.println(mi11.pic(true));
        System.out.println(mi11.pic(false));
        System.out.println(mi11.setOn(false));

        Display sA4 = new Display("SuperAmoled", 1.4, "HD");
        Watch active4 = new Watch("Samsung", "Active 4", 2021, sA4, "Exynos 920", 1, 16, 361, 369, "Rotational");
        System.out.println(active4.setOn(true));
        System.out.println(active4);
        System.out.println(active4.ekg(true));
        System.out.println(active4.Oxigen(true));
        System.out.println(active4.ekg(false));
        System.out.println(active4.Oxigen(false));
        System.out.println(active4.setOn(false));

    }


}