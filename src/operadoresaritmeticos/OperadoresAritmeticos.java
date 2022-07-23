/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;
import java.util.Scanner;
/**
 *
 * @author Edgardoidk
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1;
        int num2;
        int res;
        int opcion;
        
        System.out.println("Ingrese el primer numero");
        num1=sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2=sc.nextInt();
        
        do{
            System.out.println("    Menu    ");
            System.out.println("1 Suma");
            System.out.println("2 Resta");
            System.out.println("3 multiplicacion");
            System.out.println("4 division");
            System.out.println("5 Ingresar numeros de nuevo");
            System.out.println("6 Salir");
            opcion=sc.nextInt();
            
            switch(opcion){
                case 1:
                    res=num1+num2;
                    System.out.println("\nLa respuesta es "+ res);
                    break;
                case 2:
                    res=num1-num2;
                    System.out.println("\nLa resta es "+ res);
                    break;
                case 3:
                    res=num1*num2;
                    System.out.println("\nLa respuesta es "+ res);
                    break;
                case 4:
                    res=num1/num2;
                    System.out.println("\nLa respuesta es "+ res);
                case 5:
                    
                    System.out.println("\nIngrese el primer numero");
                    num1=sc.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    num2=sc.nextInt();
                    break;
            }
        }while (opcion!=6);
    }
}

