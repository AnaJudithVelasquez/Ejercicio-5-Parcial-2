import java.util.Scanner;

public class MainD {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = d.nextInt();

    Divisores prueba = new Divisores(numero);
    prueba.calcularSuma();
    d.close();

    }
    
}
