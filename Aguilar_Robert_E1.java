/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aguilar_robert_e1;

import java.util.Scanner;

/**
 *
 * @author Selvin Aguilar
 */
public class Aguilar_Robert_E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea=new Scanner(System.in);
        
        while(true){
            System.out.println("Bienvenido al Examen del Lab Progra1 | I Parcial"+
                    "\n1- Piramide"+
                    "\n2- El Mayor"+
                    "\n3- Cajas Digitales"+
                    "\n4- Caracteres Vocales"+
                    "\n5- Salir"+
                    "\nIngresa una opcion: ");
            int menu=lea.nextInt();

            if (menu==1){
                System.out.println("Ingresar cantidad de filas: ");
                int cant=lea.nextInt();

                System.out.println("Cantidad de filas: "+cant);

                int num=1;

                for (int i=1;i<=cant;i++){
                    int suma=0;

                    for (int j=1;j<=2*i-1;j++){
                        System.out.print(num+" ");
                        suma+=num;
                        num+=2;
                    }
                    System.out.println("= "+suma);
                    System.out.println("                                  ");
                }
            
            } else if(menu==2){
                int suma=0,contador=0,mayor=0;
                boolean primerNumero=true;
                
                System.out.println("Ingrese un numero entero o escriba NO para detener la opcion: ");
                String entrada=lea.next().toUpperCase();
                
                while(!"NO".equals(entrada)){
                    int num=Integer.parseInt(entrada);
                    
                    if (primerNumero){
                        mayor=num;
                        primerNumero=false;
                    } else {
                        if (num>mayor){
                            mayor=num;
                        }
                    }
                    
                    suma+=num;
                    contador++;
                    
                    System.out.println("Ingrese un numero entero o escriba NO para detener la opcion: ");
                    entrada=lea.next();
                }
                
                if (contador>0){
                    double promedio=(double)suma/contador;
                    
                    System.out.println("                                                  ");
                    System.out.println("El numero mayor ingresado es: "+mayor);
                    System.out.println("El promedio de los numeros ingresados es: "+promedio);
                    System.out.println("                                              ");
                    
                }else{
                    System.out.println("No ingresaste ningun numero valido");
                            }
                
            } else if(menu==3){
                System.out.println("Ingresar nombre del Cliente: ");
                String cliente=lea.next();
                
                double conta_hd=0,conta_normal=0,suma=0,subtotal=0, impuesto=1.15,total=0;
                int cn_normal=20,cn_hd=30, LIGHTBOX=50,HDBOX=100,DVRBOX=150;
                
                while (true){
                    System.out.println("Ingresa un tipo de canal (HD o NORMAL): ");
                    String tipo=lea.next();
                    
                    if (tipo=="HD"){
                        subtotal+=cn_hd;
                        conta_hd++;    
                    }
                    
                        
                    
                }
                
                
            } else if(menu==4){
                System.out.println("Ingrese un texto: ");
                String texto=lea.next();
                int contador=0;
                
                for (int i=0;i<texto.length();i++){
                    char c=texto.charAt(i);
                    
                    switch (c){
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                            contador++;
                            break;
                        default:
                            break;
                    }
                }
                
                System.out.println("El texto tiene "+contador+" vocales minusculas");
                System.out.println("                                  ");
            } else{
                System.out.println("HASTA LUEGO...");
                break;
            }
                    
        
        
    }
    } 
}
