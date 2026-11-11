package ed3s6_pila;
import java.util.Scanner; 

public class ED3S6_PILA {

    Scanner sc = new Scanner(System.in);
    int tam = 10;
    int[] pila = new int[tam];
    int indice = 0;

    public ED3S6_PILA() {
        int opcion;
        do {
            System.out.println("\n1. Insertar");
            System.out.println("2. Eliminar");
            System.out.println("3. Listar");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    inserta();
                    break;
                case 2:
                    elimina();
                    break;
                case 3:
                    listar();
                    break;
                case 4:
                    System.out.println("Programa terminado.");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 4);
    }

    private boolean verificaLleno() {
        if (indice > tam - 1) {
            System.out.println("Pila llena");
            return true;
        }
        return false;
    }

    private boolean verificaVacio() {
        if (indice <= 0) {
            System.out.println("Pila vacia");
            return true;
        }
        return false;
    }

    private void inserta() {
        if (verificaLleno()) {
        } else {
            System.out.print("Ingresa el valor: ");
            int valor = sc.nextInt();
            pila[indice] = valor;
            indice = indice + 1;
        }
    }

    private void elimina() {
        if (verificaVacio()) {
        } else {
            indice = indice - 1;
        }
    }

    private void listar() {
        System.out.println("Contenido de la pila:");
        for (int i = indice - 1; i >= 0; i--) {
            System.out.println("Pila[" + i + "] = " + pila[i]);
        }
    }

    public static void main(String[] args) {
        new ED3S6_PILA();
    }
}