import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        System.out.println("=== CALCULADORA BÁSICA ===");
        
        while (continuar) {
            try {
                // Solicitar el primer número
                System.out.print("\nIngrese el primer número: ");
                double numero1 = scanner.nextDouble();
                
                // Solicitar el segundo número
                System.out.print("Ingrese el segundo número: ");
                double numero2 = scanner.nextDouble();
                
                // Mostrar menú de operaciones
                System.out.println("\n--- Operaciones disponibles ---");
                System.out.println("1. Suma (+)");
                System.out.println("2. Resta (-)");
                System.out.println("3. Multiplicación (*)");
                System.out.println("4. División (/)");
                System.out.print("Seleccione una operación (1-4): ");
                
                int opcion = scanner.nextInt();
                double resultado = 0;
                boolean operacionValida = true;
                
                // Estructura de control switch para seleccionar la operación
                switch (opcion) {
                    case 1:
                        resultado = numero1 + numero2;
                        System.out.println("\nResultado: " + numero1 + " + " + numero2 + " = " + resultado);
                        break;
                    
                    case 2:
                        resultado = numero1 - numero2;
                        System.out.println("\nResultado: " + numero1 + " - " + numero2 + " = " + resultado);
                        break;
                    
                    case 3:
                        resultado = numero1 * numero2;
                        System.out.println("\nResultado: " + numero1 + " * " + numero2 + " = " + resultado);
                        break;
                    
                    case 4:
                        // Estructura de control if para validar división por cero
                        if (numero2 == 0) {
                            System.out.println("\n¡Error! No se puede dividir por cero.");
                            operacionValida = false;
                        } else {
                            resultado = numero1 / numero2;
                            System.out.println("\nResultado: " + numero1 + " / " + numero2 + " = " + resultado);
                        }
                        break;
                    
                    default:
                        System.out.println("\n¡Opción inválida! Por favor seleccione un número del 1 al 4.");
                        operacionValida = false;
                }
                
                // Preguntar si desea continuar
                System.out.print("\n¿Desea realizar otra operación? (s/n): ");
                String respuesta = scanner.next();
                
                // Estructura de control if-else para continuar o salir
                if (respuesta.equalsIgnoreCase("s")) {
                    continuar = true;
                } else {
                    continuar = false;
                    System.out.println("\n¡Gracias por usar la calculadora!");
                }
                
            } catch (Exception e) {
                System.out.println("\n¡Error! Por favor ingrese valores numéricos válidos.");
                scanner.nextLine(); // Limpiar el buffer
                continuar = true;
            }
        }
        
        scanner.close();
    }
}