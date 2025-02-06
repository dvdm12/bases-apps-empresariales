package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class excercise3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList( "Amanda","Ana", "Andrés", "Amanda", "Beatriz", "Alberto", "Beatriz", "Ana", "Carlos", "Amanda", "David");

        List<String> namesStartingWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Nombres que comienzan con 'A': " + namesStartingWithA);

        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Nombres en mayúsculas: " + upperCaseNames);

    }
}
