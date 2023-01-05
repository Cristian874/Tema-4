/*


Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

Crea un bucle While, este bucle tendrá que tener como condición que la variable 
numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
Incrementar el valor de la variable en uno cada vez que se ejecute.
Mostrarlo por pantalla cada vez que se ejecute.


Para el bucle Do While, deberás crear la misma estructura que en el While, 
pero solo se debe ejecutar una vez.

Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 
0 y su condición será que la variable sea igual o menor que 3, se irá 
incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse 
por pantalla.

Por último, para el Switch, deberás crear la variable estacion, y distintos
case para las cuatro estaciones del año. Dependiendo del valor de la variable
estacion se deberá mandar un mensaje por consola informando de la estación en
la que está. También habrá que poner un default para cuando el valor de la 
variable no sea una estación.
 */
package project15;

import java.util.Scanner;

public class Project15 {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        int valorCaso = 0;

        System.out.println("Dame un de las Siguiente opciones");
        System.out.println();
        System.out.println("Opción 1: Saber si un número es positivo o negativo");
        System.out.println("Opción 2: Incrementar un numero usando while");
        System.out.println("Opción 3: Incrementar un numero usando do while");
        System.out.println("Opción 4: Incrementar un numero usando For");
        System.out.println("Opción 5: Estaciones del año");
        valorCaso = dato.nextInt();

        switch (valorCaso) {

            case 1: {

                int num;

                System.out.println("Dame un número");
                num = dato.nextInt();

                if (num > 0) {

                    System.out.println("Tu número es positivo : " + num);
                } else if (num == 0) {
                    System.out.println("Tu número es  : " + num + " No existen ceros positivos o negativos");

                } else {
                    System.out.println("el número es negativo : " + num);
                }

                break;

            }//case 1

            case 2: {

                int numeroWhile = 0;

                while (numeroWhile < 3) {
                    System.out.println("El Número se incrementa en 1 : " + numeroWhile);

                    numeroWhile++;

                }

                break;

            }//case 2

            case 3: {
                int numero = 0;
                do {
                    System.out.println("El Número Inicial es : " + numero);

                    numero++;

                    System.out.println("El nuevo Número es : " + numero);

                } while (numero < 1);

                break;

            }//case 3

            case 4: {

                int numeroFor = 0;

                for (int i = 0; i < 3; i++) {

                    System.out.println("El número es : " + i);

                }
                break;

            }//case 4

            case 5: {

                int estacion = 0;
                System.out.println("Dame en mes en Numero");
                estacion = dato.nextInt();

                switch (estacion) {
                    case 12:
                    case 1:
                    case 2:

                        System.out.println("Invierno");
                        break;

                    case 3:
                    case 4:
                    case 5:

                        System.out.println("Primavera");
                        break;

                    case 6:
                    case 7:
                    case 8:

                        System.out.println("Verano");
                        break;

                    case 9:
                    case 10:
                    case 11:

                        System.out.println("Otoño");
                        break;

                    default:
                        System.out.println("Mes incorrecto");
                     

                }
                break;

            }//case 5
            
            default:
                System.out.println("Ingresa un opción valida");
            
            

        }
    }

}
