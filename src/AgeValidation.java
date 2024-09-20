import java.util.Scanner; //Importamos la libreria scanner

public class AgeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Creamos el objeto llamado sc, el cual utilizaremos para escanear la edad.

        final int limit_age = 18; //Establecemos la constante del limite de edad

        System.out.println("Inserte la edad del usuario"); //Le pedimos al usuario la edad a evaluar
        int age = sc.nextInt();
        
        if (age >= 18) { //Definimos si el usuario es mayor de edad o no, para luego definir si accedera al sistema o no
            System.out.println("Access granted");
        }else{
            System.out.println("Access denied");
        }
    }
}
