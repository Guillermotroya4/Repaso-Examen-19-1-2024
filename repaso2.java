public class repaso2 {
    static String nombres[]= {"Alberto","Bárbara" ,"Carlos", "Diana"};
    static double[] promedio= new double[nombres.length];
    static int notas[][]= {{5,6,7,8,9},{7,7,8,9,10},{1,2,3,4,5},{6,6,8,8,9}};
    


    public static void main(String[] args) {
        

        System.out.print("Por favor, introduce un nombre: ");
        String busqueda= System.console().readLine();
        for (int i = 0; i < nombres.length; i++) {
             for (int j = 0; j < args.length; j++) {
                
                if (nombres[i]==busqueda) {
                    promedio(notas, args);
                    
                    
                }else{
                    System.out.println("Introduce un nombre correcto");
                }
             }  
             
                
            }
            System.out.print(busqueda);
            promedio(notas, args);

            


        }
    
        
        
    
        public static void promedio( int notas[][] ,  String nombres[]){
            double media=0;
            double total=0;
            double suma=0;

            

            for( int i=0; i<notas.length; i++){
                for (int j = 0; j < notas[0].length; j++) {
                    
                    total+=notas[i][0];
                    promedio[0] = total / 5;
                    
                }

            }
            System.out.println("El promedio 0 es: " + promedio[0]);


            for( int i=0; i<notas.length; i++){
                for (int j = 0; j < notas[1].length; j++) {
                    suma= suma+notas[i][1];
                    promedio[1] = (suma) / 5;
                    
                }

            }
            System.out.println("El promedio 1 es:"+  promedio[1]);

            
            
        
        }
        


    }