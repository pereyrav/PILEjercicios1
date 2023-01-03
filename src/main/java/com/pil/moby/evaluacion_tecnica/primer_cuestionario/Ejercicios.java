package main.java.com.pil.moby.evaluacion_tecnica.primer_cuestionario;

public class Ejercicios {
    public static void main(String[] args) {

        int num1 = 27;
        int num2 = 42;
        boolean es27 = true;

        int sumarDosNum = num1 + num2, multiplicarDosNum = num1 * num2;

        if(sumarDosNum >= 50){
            System.out.println("El resultado de SumarDosNum es = " + sumarDosNum);
            System.out.println("El resultado de MultiplicarDosNum es = " + multiplicarDosNum);
        }else{
            System.out.println(" Error, la condicion es incorrecta");
        }

        if(sumarDosNum < 50){
            System.out.println("El resultado de SumarDosNum es = " + sumarDosNum);
            System.out.println("El resultado de MultiplicarDosNum es = " + multiplicarDosNum);
        }else{
            System.out.println(" Error, la condicion es incorrecta");
        }

        int num3 = 10, num4 = num3 *2;
        System.out.println("El valor inicial de num3 es = " + num3);
        while(num3 < num4){
            System.out.println("Ahora num3 vale = " + num3);
            num3++;
        }

        System.out.println("El valor final de num3 = " + num3);

        float num5 = (float) (num3 * 0.33);
        for(int i = 0; i <= 10; i++) {
            System.out.println("El valor de num5 es = " + num5);
        }
    }

}
