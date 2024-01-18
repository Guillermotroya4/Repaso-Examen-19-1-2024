/***
 * Este es un repaso apara el examen de mañana, en el que será muy parecido
 * @author Guillemo troya Albarrán
 */
public class repaso1 {
    static String nombres[] = {"Alberto", "Bárbara", "Carlos", "Diana"};
    static double[] promedio = new double[nombres.length];
    static int notas[][] = {{5, 6, 7, 8, 9}, {7, 7, 8, 9, 10}, {1, 2, 3, 4, 5}, {6, 6, 8, 8, 9}};

    public static void main(String[] args) {
        System.out.print("Por favor, introduce un nombre: ");
        String busqueda = System.console().readLine();

        boolean encontrado = false; 

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(busqueda)) {
                promedio(notas, i); 
                encontrado = true; 
                break; 
            }
        }

        if (!encontrado) {
            System.out.println("Introduce un nombre correcto");
        }
    }

    public static void promedio(int notas[][], int indice) {
        double suma = 0;

        // Display the array of notes
        System.out.print("Notas: ");
        for (int j = 0; j < notas[indice].length; j++) {
            System.out.print(notas[indice][j] + " ");
            suma += notas[indice][j];
        }

        // Calculate and display the average
        promedio[indice] = suma / notas[indice].length;
        System.out.println("\nEl promedio " + indice + " es: " + promedio[indice]);
    }
}
