package Ejercicio789;

public class EjercicioDivide0 {
    public static void main(String[] args) {
       try{
           dividepor0(5, 0);
       } catch (ArithmeticException e){
           System.out.println("Esto no puede hacerse");
       }


        System.out.println("Demo de codigo");
    }
        public static int dividepor0(int A, int B) throws ArithmeticException {
            int resultado = 0;
            try {
                resultado = A / B;
            }catch (ArithmeticException e){
                throw new ArithmeticException();
            }
            return resultado;
        }

}
