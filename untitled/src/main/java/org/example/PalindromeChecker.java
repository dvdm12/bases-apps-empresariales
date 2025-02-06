public class PalindromeChecker {
    public static boolean esPalindromo(String palabra) {
        palabra = palabra.toLowerCase().replaceAll("\\s+", ""); // Ignorar mayúsculas y espacios
        String invertida = new StringBuilder(palabra).reverse().toString();
        return palabra.equals(invertida);
    }
}
