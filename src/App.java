import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        MetodoOrdenamiento mo = new MetodoOrdenamiento();
        Scanner scanner = new Scanner(System.in);
        int tamanio = 0;

        do { 
            System.out.println("Ingrese el tamaño del arreglo:");
            while (!scanner.hasNextInt()) {
                System.out.println("Ingrese correctamente un número entero:");
                scanner.next();  
            }
            tamanio = scanner.nextInt();
            if (tamanio <= 0) {
                System.out.println("El tamaño debe ser un entero positivo.");
            }
        } while (tamanio <= 0);

        int[] arreglo = new int[tamanio];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < tamanio; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ingrese correctamente un número entero:");
                scanner.next();  
            }
            arreglo[i] = scanner.nextInt();
        }

        arreglo = mo.BurbujaAjuste(arreglo);

        System.out.println("Arreglo ordenado:");
        mo.printArreglo(arreglo);

        scanner.close();
    }
}