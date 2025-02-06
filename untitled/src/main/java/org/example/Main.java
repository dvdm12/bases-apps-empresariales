package org.example;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Verificar número primo
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();
        System.out.println(num + " es primo? " + PrimoChecker.esPrimo(num));

        // Encontrar el número más grande y el más pequeño en una lista
        List<Integer> listaNumeros = Arrays.asList(3, 5, 7, 2, 8, 1, 9, 4);
        int[] minMax = MinMaxFinder.encontrarMinMax(listaNumeros);
        System.out.println("El número más pequeño es " + minMax[0] + " y el más grande es " + minMax[1]);

         // Verificar si una palabra es un palíndromo
        System.out.print("Ingrese una palabra: ");
        scanner.nextLine(); // Limpiar el buffer del scanner
        String palabra = scanner.nextLine();
        System.out.println("'" + palabra + "' es un palíndromo? " + PalindromeChecker.esPalindromo(palabra));

        scanner.close();
    }
}