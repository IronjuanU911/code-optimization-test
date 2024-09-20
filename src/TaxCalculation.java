import java.util.Scanner; //Importamos la libreria scanner

public class TaxCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Creamos el objeto llamado sc

        final double porcentaje_impuesto_1 = 0.15;
        final double porcentaje_impuesto_2 = 0.10;
        final double Umbral_de_impuestos = 50;
        
        System.out.println("Cual es el valor de el primer producto?");
        double productPrice1 = sc.nextDouble();

        System.out.println("Cual es el valor de el segundo producto?");
        double productPrice2 = sc.nextDouble();

        double impuesto_1 = productPrice1 * porcentaje_impuesto_1;
        double impuesto_2 = productPrice2 * porcentaje_impuesto_2;

        double total_impuestos = impuesto_1 + impuesto_2;
        
        if (total_impuestos > Umbral_de_impuestos) {
            System.out.println("Una gran cantidad de impuestos: " + total_impuestos);
        } else {
            System.out.println("Una baja cantidad de impuestos: " + total_impuestos);
        }
    }
}
