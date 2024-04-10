package Array_Unidimensionales;

import java.util.*;


public class E7_Baraja_Siete_y_Media {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Arrays para almacenar las cartas de usuario y ordenador
        double[] manoUsuario = new double[10];
        double[] manoOrdenador = new double[10];

        System.out.println("¡Bienvenido al juego de siete y media!");

        // Índices para rastrear las posiciones actuales en los arrays
        int indiceUsuario = 0;
        int indiceOrdenador = 0;

        // Turno del usuario
        while (true) {
            System.out.println("\n¿Quieres destapar una carta? (0 - NO, 1 - SI): ");
            int opcion = sc.nextInt();

            if (opcion == 1) {
                // Obtener carta aleatoria y agregarla a la mano del usuario
                double cartaUsuario = obtenerCarta(random);
                manoUsuario[indiceUsuario++] = cartaUsuario;

                // Mostrar las cartas del usuario y la suma de sus valores
                mostrarMano("Tus cartas", manoUsuario, indiceUsuario);

                // Verificar si el usuario se ha pasado de 7.5
                if (sumarValores(manoUsuario, indiceUsuario) > 7.5) {
                    System.out.println("¡Te has pasado de 7.5! Has perdido.");
                    break;
                }
            } else if (opcion == 0) {
                break;
                
            } else {
                System.out.println("Opción no válida. Introduce 0 o 1.");
            }
        }

        // Turno del ordenador
        while (sumarValores(manoOrdenador, indiceOrdenador) < sumarValores(manoUsuario, indiceUsuario) &&
               sumarValores(manoOrdenador, indiceOrdenador) <= 7.5) {
            // Obtener carta aleatoria y agregarla a la mano del ordenador
            double cartaOrdenador = obtenerCarta(random);
            manoOrdenador[indiceOrdenador++] = cartaOrdenador;
        }

        // Mostrar las cartas del ordenador y la suma de sus valores
        System.out.println("Turno del ordenador:");
        mostrarMano("Cartas del ordenador", manoOrdenador, indiceOrdenador);

        // Determinar el ganador
        if (sumarValores(manoOrdenador, indiceOrdenador) > 7.5) {
            System.out.println("¡El ordenador se ha pasado de 7.5! ¡Has Ganado!");
        } else {
            System.out.println("Fin del juego.");

            if (sumarValores(manoUsuario, indiceUsuario) > sumarValores(manoOrdenador, indiceOrdenador)) {
                System.out.println("¡Has ganado!");
            } else if (sumarValores(manoUsuario, indiceUsuario) == sumarValores(manoOrdenador, indiceOrdenador)) {
                System.out.println("Empate.");
            } else {
                System.out.println("¡Has perdido!");
            }
        }
        sc.close();
    }

    // Función para obtener una carta aleatoria
    private static double obtenerCarta(Random random) {
        double[] cartas = {1, 2, 3, 4, 5, 6, 7, 0.5, 0.5, 0.5};
        return cartas[random.nextInt(cartas.length)];
    }

    // Función para sumar los valores de las cartas en una mano
    private static double sumarValores(double[] mano, int longitud) {
        double suma = 0;
        for (int i = 0; i < longitud; i++) {
            suma += mano[i];
        }
        return suma;
    }

    // Función para mostrar las cartas de una mano y la suma de sus valores
    private static void mostrarMano(String mensaje, double[] mano, int longitud) {
        System.out.print(mensaje + ": ");
        for (int i = 0; i < longitud; i++) {
            System.out.print(mano[i] + " ");
        }
        System.out.println("Suma de valores: " + sumarValores(mano, longitud));
    }
}
