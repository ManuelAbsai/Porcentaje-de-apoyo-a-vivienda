/* La gerencia de PeruDev decide otorgar un Subsidio por Alquiler de Vivienda (SAV) a sus empleados. Los criterios para 
calcular el importe de SAC son:

 Si el salario básico de un empleado es mayor que 10,000 Nuevos Soles, la suma por concepto de SAV otorgado al 
empleado será del 30% del salario básico.

 Si el salario básico de un empleado es igual ó menor que 10,000 Nuevos Soles, la suma por concepto de SAV otorgado 
al empleado será del 20% del salario básico.

Desarrolle el pseudocódigo que represente el algoritmo para este problema.
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String [] ajnsdajasdn) {

        System.out.println("Escriba su ingreso");
        Scanner sc = new Scanner (System.in);
        String ingresoMonto = sc.nextLine();
        int ingresoMontoInt = 0;

        try{
            ingresoMontoInt = Integer.parseInt(ingresoMonto);   
        }
        catch(Exception e){
            System.out.println("Escribe un numero perro .l.");
            System.exit(0);
        }

        if (ingresoMontoInt <= 10000){
            System.out.println("Tu SAV es del 20%");
        }
        else {
            System.out.println("Tu SAV es del 30%");
        }
    }
}