// Le indicamos la ruta package
package main;

// Importamos los paquetes necesarios
import java.util.Scanner;
import java.util.InputMismatchException;

// Inicio del programa
public class calculadora {
    // Clase principal
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, resultado;
        boolean exit = false;
        // Bienvenida de la cualculadora
        System.out.println("============ CALCULADORA :: GESTIÓN DE AGUAS, SL ============");
        System.out.println(
                "\nIntroduzca una opción del menú:\n1. Sumar (+)\n2. Restar (-)\n3. Multiplicar (*)\n4. Dividir (/)\n5. Resto (%)\n 0. Salir (S o s)\n- Introduzca una opción:");

        // Creamos un bucle principal para las operaciones
        while (!exit) {
            // Le diremos que la opcion Scanner es un string
            String myOpcion = input.nextLine();
            // Empezamos las condiciones y los casos de posibles errores de la calculadora
            switch (myOpcion) {
                // Caso de suma
                case "1":
                case "+":
                    System.out.println("Introduzca los valores que desea sumar:");
                    try {
                        num1 = input.nextDouble();
                        num2 = input.nextDouble();
                        resultado = num1 + num2;
                        System.out.println("===================================\nLa suma de " + num1 + " y " + num2 + " es " + resultado + "\n===================================");
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Debe ingresar un número.");
                        input.nextLine(); // Limpia el búfer de entrada para evitar un bucle infinito
                    }
                    break;
                // Caso de Resta
                case "2":
                case "-":
                    System.out.println("Introduzca los valores que desea restar:");
                    try {
                        num1 = input.nextDouble();
                        num2 = input.nextDouble();
                        resultado = num1 - num2;
                        System.out.println("===================================\nLa resta de " + num1 + " y " + num2 + " es " + resultado + "\n===================================");
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Debe ingresar un número.");
                        input.nextLine(); // Limpia el búfer de entrada para evitar un bucle infinito
                    }
                    break;
                // Caso de Multiplicacion
                case "3":
                case "*":
                    System.out.println("Introduzca los valores que deseas multiplicar:");
                    try {
                        num1 = input.nextDouble();
                        num2 = input.nextDouble();
                        resultado = num1 * num2;
                        System.out.println("===================================\nLa multiplicación de " + num1 + " y " + num2 + " es " + resultado + "\n===================================");
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Debe ingresar un número.");
                        input.nextLine(); // Limpia el búfer de entrada para evitar un bucle infinito
                    }
                    break;
                // caso de Division
                case "4":
                case "/":
                    System.out.println("Introduzca los valores que deseas dividir:");
                    try {
                        num1 = input.nextDouble();
                        num2 = input.nextDouble();
                        if (num2 == 0) {
                            System.out.println("No se puede dividir entre cero.");
                        } else {
                            resultado = num1 / num2;
                            System.out.println("===================================\nLa divison de " + num1 + " y " + num2 + " es " + resultado + "\n===================================");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Debe ingresar un número.");
                        input.nextLine(); // Limpia el búfer de entrada para evitar un bucle infinito
                    }
                    break;
                // Caso de Resto
                case "5":
                case "%":
                    System.out.println("Introduzca los valores para obtener el resto:");
                    try {
                        num1 = input.nextDouble();
                        num2 = input.nextDouble();
                        resultado = num1 % num2;
                        System.out.println("===================================\nDel resto de " + num1 + " y " + num2 + " es " + resultado + "\n===================================");

                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Debe ingresar un número.");
                        input.nextLine(); // Limpia el búfer de entrada para evitar un bucle infinito
                    }
                    break;
                // Caso de salida
                case "0":
                case "S":
                case "s":
                    exit = true;
                    System.out.println("El programa ha finalizado");
                    break;

                default:
                    System.out.println("Elige la siguiente operacion o una opcion correcta:");
                    break;
            }
        }

        input.close();
    }
}
/*
 * @author Izhan Lara Garcia
 */