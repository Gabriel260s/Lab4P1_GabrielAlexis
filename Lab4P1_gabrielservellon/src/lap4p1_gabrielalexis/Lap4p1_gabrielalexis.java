package lap4p1_gabrielalexis;

import java.util.Scanner;

public class Lap4p1_gabrielalexis {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner leer;
        leer = new Scanner(System.in);
        System.out.println("1. Inversion especial");
        System.out.println("2. Balanza de cadenas");
        System.out.println("3. Cifrado de mensajes");
        System.out.println("4. Para salir");
        System.out.println("Elige una opcion.");
        int opc = input.nextInt();
        while (opc != 4) {
            switch (opc) {
                case 1:
                    String cadena_nuev = "",palabra="";
                    
                    System.out.println("Ingrese la cadena: ");
                    String caden1 = leer.nextLine();
                    System.out.println();

                    if (caden1.length() > 5) {
                        for (int m = caden1.length() - 1; m >= 0; m--) {
                            cadena_nuev += caden1.charAt(m);
                            if(caden1.charAt(m) ==  ' '||m==0){
                                if(m==0){
                                    palabra = cadena_nuev+palabra;
                                }else{
                                    palabra = " "+cadena_nuev+palabra;
                                }
                               cadena_nuev="";
                            }
                                 
                            
                        }
                        System.out.print("Cadena invertida: "+palabra);
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                    } else {
                        System.out.println("La cadena tiene que ser mayor a 5");
                    }

                    break;

                case 2:
                    int acumulador1 = 0,
                     acumulador2 = 0,
                     acumulador3 = 0;
                    System.out.println("Ingrese la cadena 1");
                    input.nextLine();
                    String cadena1 = input.nextLine();
                    System.out.println("Ingrese la cadena 2");

                    String cadena2 = input.nextLine();
                    System.out.println("Ingrese la cadena 3");

                    String cadena3 = input.nextLine();
                    int numero1,
                     numero2,
                     numero3;

                    for (int i = 0; i < cadena1.length(); i++) {
                        char caracter = cadena1.charAt(i);
                        numero1 = caracter;
                        acumulador1 += caracter;

                    }
                    for (int j = 0; j < cadena2.length(); j++) {
                        char caracter = cadena2.charAt(j);
                        numero2 = caracter;
                        acumulador2 += caracter;

                    }
                    for (int k = 0; k < cadena3.length(); k++) {
                        char caracter = cadena3.charAt(k);
                        numero3 = caracter;
                        acumulador3 += caracter;

                    }
                    System.out.println("El peso de la cadena 1 es de: " + acumulador1);
                    System.out.println("El peso de la cadena 2 es de: " + acumulador2);
                    System.out.println("El peso de la cadena 3 es de: " + acumulador3);

                    if (acumulador1 == acumulador2 && acumulador2 == acumulador3) {
                        System.out.println("Todas las cadenas son iguales");
                    } else if (acumulador1 > acumulador2 && acumulador1 > acumulador3) {
                        System.out.println("La cadena con mayor peso es la primera");
                    } else if ((acumulador2 > acumulador1 && acumulador2 > acumulador3)) {
                        System.out.println("La cadena con mayor peso es la segunda");

                    } else {
                        System.out.println("La cadena con mayor peso es la tercera.");
                    }

                    break;
                case 3:
                    char cadena_nueva;

                    System.out.println("Ingrese el mensaje que quiere codificar");
                    String mensaje = leer.nextLine();
                    System.out.println("");
                    if (mensaje.length() >= 0) {
                        for (int i = 0; i < mensaje.length(); i++) {
                            int acum = 0;
                            char caracter = mensaje.charAt(i);
                            acum += caracter + 2;

                            cadena_nueva = (char) acum;

                            System.out.print(cadena_nueva);

                        }
                    } else {
                        System.out.println("La cadena no puede ser nula");
                    }
                    System.out.println("");

                    break;
                case 4:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
                   

            }
            System.out.println("1. Inversion especial");
        System.out.println("2. Balanza de cadenas");
        System.out.println("3. Cifrado de mensajes");
        System.out.println("4. Para salir");
        System.out.println("Elige una opcion.");
         opc = input.nextInt();
        }

    }

}
