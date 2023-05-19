
package examen1p1_ayleenescobar;
import java.util.Scanner;
public class Examen1P1_AyleenEscobar {
    
    public static void main(String[] args) {
        boolean respuesta =true;
        
        Scanner sc = new Scanner(System.in);
        
        while (respuesta){
            System.out.println("Menu");
            System.out.println("1.Ejercicio 1");
            System.out.println("2.Ejercicio 2");
            System.out.println("3.Salir");
            
            int option = 0;
            option= sc.nextInt();
            
            switch(option){
                case 1:{
                    System.out.print("Ingrese el primer número:");
                    String numero1= sc.nextLine();
                    System.out.print("Ingrese el segundo número:");
                    String numero2= sc.nextLine();
                    char n1= '0';
                    char n2= '1';
                    while (n1==n2){
                        
                    }
                    while(numero1!= numero2){
                        System.out.print("Los números deben de tener el mismo número de bits.");
                        System.out.print("Ingrese el primer número:");
                        numero1= sc.nextLine();
                        System.out.print("Ingrese el segundo número:");
                        numero2= sc.nextLine();
                    }
                    
                } break;
                
                case 2: {
                    System.out.print("Ingrese un tamaño:");
                    int tamano= 0;
                    tamano = sc.nextInt();
                   while (tamano<9){
                        System.out.println("¡ERROR! SOLO NUMEROS IMPARES Y MAYORES QUE 9");
                    }
                    for (int j=1; j<=(tamano/2)+1; j++){
                        for(int i=1;i<=tamano;i++){
                            for(int k=1; k<=tamano;k++){
                                System.out.print("");
                            }    
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    /*for(int k=tamano;k<=1;k--){
                        for(int i=tamano-1;i<=1;i++){
                            System.out.print(" ");
                        }
                        System.out.print("*");
                    }
                    */System.out.println();
                    }break;
                    
                case 3: {
                    respuesta = false;
                }
                
                default:
                    
            }
        
        }
        
        
        
    }
    
}
