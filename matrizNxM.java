public class matrizNxM {

    public static void main(String[] args) {

        System.out.print("Introduce el valor de N: ");
        int valorN=Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el valor de M: ");
        int valorM=Integer.parseInt(System.console().readLine());

        int tablero[][]= new int [valorN][valorM];
        
        
    for (int i = 0; i < tablero.length; i++) {
        for (int j = 0; j < tablero.length; j++) {
            tablero[i][j]= valorM;
        }
    }


    for (int i = 0; i < tablero.length; i++) {
        for (int j = 0; j < tablero.length; j++) {
            System.out.print( " [" + tablero[i][j]+ "] ");
        }
        System.out.println();
    }
    }
}