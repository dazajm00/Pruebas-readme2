import java.util.Scanner;

public class ContadorMejorado {
    
    // Método para verificar si un carácter es vocal
    public static boolean esVocal(char letra) {
        // Estructura switch para verificar vocales
        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
    
    // Método para validar que la palabra solo tenga letras minúsculas
    public static boolean esValida(String palabra) {
        // Estructura if para verificar longitud
        if (palabra.length() == 0) {
            return false;
        }
        
        // Estructura for para revisar cada carácter
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (letra < 'a' || letra > 'z') {
                return false;
            }
        }
        return true;
    }
    
    // Método para contar vocales
    public static int contarVocales(String palabra) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (esVocal(palabra.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }
    
    // Método para contar consonantes
    public static int contarConsonantes(String palabra) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (!esVocal(palabra.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }
    
    // Método para mostrar análisis detallado
    public static void mostrarDetalle(String palabra) {
        System.out.println("\n--- ANÁLISIS DETALLADO ---");
        int posicion = 1;
        
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            String tipo = esVocal(letra) ? "VOCAL" : "CONSONANTE";
            System.out.println("Posición " + posicion + ": '" + letra + "' -> " + tipo);
            posicion++;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║  CONTADOR DE VOCALES Y CONSONANTES        ║");
        System.out.println("╚════════════════════════════════════════════╝");
        
        while (continuar) {
            System.out.print("\nIngrese una palabra (solo letras minúsculas): ");
            String palabra = scanner.nextLine().trim();
            
            // Estructura if-else para validación
            if (esValida(palabra)) {
                int vocales = contarVocales(palabra);
                int consonantes = contarConsonantes(palabra);
                int total = palabra.length();
                
                // Mostrar resultados
                System.out.println("\n┌─────────────────────────────────────┐");
                System.out.println("│         RESULTADOS                  │");
                System.out.println("├─────────────────────────────────────┤");
                System.out.println("│ Palabra:      " + String.format("%-20s", palabra) + "│");
                System.out.println("│ Total letras: " + String.format("%-20d", total) + "│");
                System.out.println("│ Vocales:      " + String.format("%-20d", vocales) + "│");
                System.out.println("│ Consonantes:  " + String.format("%-20d", consonantes) + "│");
                System.out.println("└─────────────────────────────────────┘");
                
                // Calcular porcentajes
                double porcentajeVocales = (vocales * 100.0) / total;
                double porcentajeConsonantes = (consonantes * 100.0) / total;
                
                System.out.println("\n📊 Porcentajes:");
                System.out.printf("   Vocales: %.1f%%\n", porcentajeVocales);
                System.out.printf("   Consonantes: %.1f%%\n", porcentajeConsonantes);
                
                // Preguntar si desea ver detalle
                System.out.print("\n¿Desea ver el análisis detallado? (s/n): ");
                String verDetalle = scanner.nextLine();
                
                if (verDetalle.equalsIgnoreCase("s")) {
                    mostrarDetalle(palabra);
                }
                
            } else if (palabra.length() == 0) {
                System.out.println("\n❌ Error: Debe ingresar al menos una letra.");
            } else {
                System.out.println("\n❌ Error: La palabra contiene caracteres no válidos.");
                System.out.println("   Recuerde: solo letras minúsculas (a-z)");
                System.out.println("   No use: números, símbolos, acentos o mayúsculas");
            }
            
            // Preguntar si desea continuar
            System.out.print("\n¿Desea analizar otra palabra? (s/n): ");
            String respuesta = scanner.nextLine();
            
            // Estructura if-else para controlar el bucle
            if (respuesta.equalsIgnoreCase("s")) {
                continuar = true;
                System.out.println(); // Línea en blanco
            } else {
                continuar = false;
                System.out.println("\n✓ ¡Gracias por usar el contador!");
                System.out.println("════════════════════════════════════════════");
            }
        }
        
        scanner.close();
    }
}