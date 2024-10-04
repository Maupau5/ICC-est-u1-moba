import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        MetodoOrdenamiento mo = new MetodoOrdenamiento();
        Scanner sc = new Scanner(System.in);
        int tamanio = leerEnteroValido(sc, "Ingrese el tamanio del arreglo", false);

        do {
            System.out.println("Ingrese el tamaño del arreglo:");
            while (!sc.hasNextInt()) {
                System.out.println("Ingrese correctamente un número entero:");
                sc.next();
            }
            tamanio = sc.nextInt();
            if (tamanio <= 0) {
                System.out.println("El tamaño debe ser un entero positivo.");
            }
        } while (tamanio <= 0);

        int[] arreglo = new int[tamanio];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < tamanio; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            while (!sc.hasNextInt()) {
                System.out.println("Ingrese correctamente un número entero:");
                sc.next();
            }
            arreglo[i] = sc.nextInt();
        }

        arreglo = mo.BurbujaAjuste(arreglo);

        System.out.println("Arreglo ordenado:");
        mo.printArreglo(arreglo);

        sc.close();
    }
    

    public static int leerEnteroValido(Scanner sc, String mensaje, boolean permitirNegativos) {
        int numero;
        do {
            System.out.println(mensaje);
            while (!sc.hasNextInt()) {
                System.out.println("Ingrese correctamente un número entero:");
                sc.next();
            }
            numero = sc.nextInt();

            if (!permitirNegativos && numero < 0) {
                System.out.println("No se permiten numeros negativos. Ingrese un numero entero positivo");
            }
        } while (permitirNegativos && numero < 0);

        return numero;

    }
}