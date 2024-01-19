public class array_random {


    static final String ROJO = "\u001B[31m";  //Color rojo para el índice de los números
    static final String AZUL = "\u001B[34m"; // color azul para el agua
    static final String AMARILLO = "\u001B[33m"; // color amarillo para los barcos
    static final String RESET = "\033[0m";      //Esto hara que se reinicie el color anteri8or y lo ponga de nuevo en su color original

    public static void main(String[] args) {
        int tablero[][]= new int[3][3];

        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j]=0;
            }
        }


        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j]=(int)(Math.random()*10);    
                 int contados7=0;


                if (tablero[i][j]==7) {
                    ++contados7;               
                    System.out.println("Hay un total de: " +contados7 + " numeros sietes contados " );
                    break;

                }        

            }
        }

 
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + " \t");
            }
            System.out.println();
            
        }

    }
}