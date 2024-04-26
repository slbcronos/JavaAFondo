import com.slcomputacion.fechas.Fecha;

public class TestFecha {
    public static void main(String[] args) {
        Fecha f = new Fecha();

        f.setDia(2);
        f.setMes(3);
        f.setAnio(1983);

        System.out.println(f.toString());

        Fecha f2 = new Fecha();
        f2.setDia(2);
        f2.setMes(3);
        f2.setAnio(1983);

        System.out.println(f2.toString());

        if (f.toString().equals(f2.toString())){
            System.out.println("Las fechas son iguales mai");
        }else {
            System.out.println("Las fechas son diferenes perro");
        }



    }
}
