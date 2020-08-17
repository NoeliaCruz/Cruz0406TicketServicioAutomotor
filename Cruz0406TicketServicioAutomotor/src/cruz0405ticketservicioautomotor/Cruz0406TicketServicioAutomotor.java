
package cruz0405ticketservicioautomotor;

import java.util.Scanner;

public class Cruz0405TicketServicioAutomotor {

    public static void main(String[] args) {
        // TODO code application logic here
        // Declaracion de variables 
        int servicio;
        int marca = 0;
        int cantidad = 0;
        String cliente = "";
        String dominio = "";
        String nmarca;
        

        Scanner entrada = new Scanner(System.in);
        int dni = 0;
        
        // informacion del cliente
        System.out.println("================================");
        System.out.println("========Bienvenido==============");
        System.out.println("Centro Servicios CFP N°36=?=====");
        System.out.println("==ingrese el nombre: ");
        cliente = entrada.next();
        System.out.println("==Ingrese el DNI: ");
        dni = entrada.nextInt();
        do {
            System.out.println("Ingrese la marca: ");
            System.out.println("== 1- ford");
            System.out.println("== 2- Chevrolet");
            System.out.println("== 3- Renault");
            System.out.println("== 4- Fiat");
            System.out.println("== 5- Citroen");
            marca = entrada.nextInt();
            switch (marca) {
                case 1:
                    nmarca = "Ford";
                    break;
                case 2:
                    nmarca = "Chevrolet";
                    break;
                case 3:
                    nmarca = "Renault";
                    break;
                case 4:
                    nmarca = "Fiat";
                    break;
                case 5:
                    nmarca = "Citroen";
                    break;
                default:
                    nmarca = null;
            }
        } while (nmarca == null);

        System.out.println("Ingrese el dominio de su vehiculo: ");
        dominio = entrada.next();
       
        int cant1=0;
        int cant2=0;
        int cant3=0;
        int cant4=0;
        int cant5=0;
        

        do {
            System.out.println("===Ingrese el servicio: ");
            System.out.println("== 1- Cambio de Neumaticos");
            System.out.println("== 2- Cambio de Aceite");
            System.out.println("== 3- Pastillas de Frenos");
            System.out.println("== 4- Alineacion");
            System.out.println("== 5- Balanceo");
            System.out.println("== 0- Para salir");
            System.out.println("=============================");
            servicio = entrada.nextInt();
            if(servicio!=0){
            if(servicio>=1 && servicio<=5){
            
                switch (servicio){
                    case 1:
                        cant1++;
                        break;
                    case 2:
                        cant2++;
                        break;
                    case 3:
                        cant3++;
                        break;
                    case 4:
                        cant4++;
                        break;
                    case 5:
                        cant5++;
                        break;
                    
                }
                cantidad++;
            }

        } 
        }while (cantidad < 3 && servicio!=0);
        
       
      
                
       
     

        System.out.println("===============================");
        System.out.println("=======Bienvenido==============");
        System.out.println("Centro de Servicios CFP N° 36");
        System.out.println("Av. Caseros 1200, CABA");
        System.out.println("===============================");
        System.out.println("Nombre del Cliente: " + cliente);
        System.out.println("DNI del cliente: " + dni);
        System.out.println("Marca del vehiculo: " + nmarca);
        System.out.println("Dominio del vehiculo: " + dominio);
        System.out.println("===============================");
        System.out.println("Servicios: ");
        System.out.println("Cambio de neumaticos: "+cant1);
        System.out.println("Cambio de aceite: "+ cant2);
        System.out.println("Pastillas de frenos: "+ cant3);
        System.out.println("Alineacion: "+ cant4);
        System.out.println("Balanceo: "+ cant5);
        
        

    
    
}
        }

