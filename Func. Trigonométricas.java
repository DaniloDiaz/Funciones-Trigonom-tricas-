package Trabajo_Extraclase5_Metodos;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Ejercicio1_funciones_trigonometricas {

    
    private static double valor;
    
       
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String continuar;
        int opcion;
        
        System.out.println("Algoritmo para calcular funciones trigonometricas");
        do{
            System.out.println("Elige tu opcion"
                                + "\n1.Tangente"
                                + "\n2.Cotangente"
                                + "\n3.Secante"
                                + "\n4.Cosecante");
            opcion=lector.nextInt();
            
            switch (opcion){
                case 1:
                    calcularTangente();
                    break;
                case 2:
                    calcularCotangente();
                    break;
                case 3:
                    calcularSecante();
                    break;
                case 4:
                    calcularCosecante();
                    break;
                default:
                    System.out.println(opcion+" no es una opcion valida");              
            }
            System.out.println("Desea continuar S/N");
            continuar = lector.next();
            continuar = continuar.toLowerCase();
        }while(continuar.equals("s"));        
    }
    
    public static void Ingresar_Valores() {
        Scanner lector = new Scanner (System.in);
        System.out.println("Ingrese el valor");
        valor =lector.nextDouble();
       
    }
    private static void calcularTangente(){
        double tangente;
         
        Ingresar_Valores();
        tangente=Math.sin(valor)/Math.cos(valor);
         
        System.out.println("Tangente de "+valor+" = "+tangente);
    }
    
    private static void calcularCotangente(){
        double cotangente;
         
        Ingresar_Valores();
        cotangente=Math.cos(valor)/Math.sin(valor);
         
        System.out.println("Cotangente de "+valor+" = "+cotangente);
    }
    
    private static void calcularSecante() {
        double secante;
        
        Ingresar_Valores();
        secante=1/Math.cos(valor);
        
        System.out.println("Secante de "+valor+" = "+secante);
    }

    private static void calcularCosecante() {
        double cosecante;
        
        Ingresar_Valores();
        cosecante=1/Math.cos(valor);
        System.out.println("Cosecante de "+valor+" = "+cosecante);
    }
     
}
