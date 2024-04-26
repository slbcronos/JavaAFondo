import com.slcomputacion.fechas.Fecha;

import java.util.Scanner;

public class TestFecha3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa la fecha 1 (dia,mes,anio): ");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt();
        //crear el objeto fecha1
        Fecha f1 = new Fecha(dia,mes,anio);

        System.out.println("Ingresa la fecha 2 (dia,mes,anio): ");
         dia = leer.nextInt();
         mes = leer.nextInt();
         anio = leer.nextInt();
        //crear el objeto fecha1
        Fecha f2 = new Fecha(dia,mes,anio);

        System.out.println("Fecha 1: "+f1);
        System.out.println("Fecha 2: "+f2);

        if (f1.toString().equals(f2.toString())){
            System.out.println("Las fechas son iguales mai");

        }else {
            System.out.println("Las fechas son diferentes mai");
        }

    }
}
