import java.util.Scanner;
public class PuntoUno {

    public static void main(String[] args) {
    	
    	Scanner capa = new Scanner(System.in);
    	
        long a;
        
        System.out.println("Ingresa un año: ");
        a = capa.nextLong();
        
        boolean result = esBisiesto(a);
        
        if(result){
            System.out.println("El año ingresado SI es bisiesto");
        }else{
            System.out.println("El año ingresado NO es bisiesto");
        }
        
        for(a = 2000; a < 2022; a++){
            if(esBisiesto(a)){
                System.out.printf("%d,", a);
            }
        }
    }

    public static boolean esBisiesto(long a) {
        return a % 4 == 0 && (a % 100 != 0 || a % 400 == 0);
    }
}