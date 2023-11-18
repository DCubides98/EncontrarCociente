import java.util.Scanner;

public class EncontrarCociente {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el valor A: ");
        double A = scanner.nextDouble();
        System.out.println("Ingresa el valor B: ");
        double B = scanner.nextDouble();

        if (B != 0){
            double cociente = (A/B);
            System.out.println("El cociente entre la variable A y la variable B es: " + cociente);
        } else
            System.out.println("La division por 0 no es posible");

        scanner.close();
    }

}

