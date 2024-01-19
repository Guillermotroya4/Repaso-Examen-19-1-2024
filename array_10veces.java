import java.util.Arrays;

public class array_10veces {
    public static void main(String[] args) {
        // Definir el tamaño del array
        int tamano = 10;

        // Crear el array
        int[] array = new int[tamano * (tamano + 1) / 2];

        // Rellenar el array con la secuencia deseada
        int valor = 1;
        for (int i = 0; i < tamano; i++) {
            Arrays.fill(array, i * (i + 1) / 2, (i + 1) * (i + 2) / 2, valor);
            valor++;
        }

        // Mostrar el array por pantalla
        System.out.println("Array resultante:");
        System.out.println(Arrays.toString(array));
    }
}
