import java.util.Scanner;

public class InversorSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== INVERSOR DE CADENAS ===\n");
        
        // Solicitar texto
        System.out.print("Ingrese un texto: ");
        String texto = scanner.nextLine();
        
        // Invertir usando un bucle for
        String invertido = "";
        
        // Estructura de control for: recorre desde el final hacia el inicio
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido = invertido + texto.charAt(i);
        }
        
        // Mostrar resultados
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Original:  " + texto);
        System.out.println("Invertido: " + invertido);
        
        // Verificar si es palíndromo usando if
        if (texto.equalsIgnoreCase(invertido)) {
            System.out.println("\n¡Es un palíndromo!");
        } else {
            System.out.println("\nNo es un palíndromo");
        }
        
        scanner.close();
    }
}
