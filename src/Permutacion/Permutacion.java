package Permutacion;

import java.util.ArrayList;
import java.util.List;

public class Permutacion {
    public static void main(String[] args) {
        final String inputStr = "abcd";
        List<String> resultado = getPermutaciones(inputStr);

        System.out.println(resultado);
    }

    public static List<String> getPermutaciones(String str) {
        List<String> resultado = new ArrayList<>();

        if (str == null || str.length() == 0) {
            return resultado;
        }

        permutar("", str, resultado);
        return resultado;
    }

    private static void permutar(String prefijo, String restante, List<String> resultado) {
        if (restante.length() == 0) {
            resultado.add(prefijo);
            return;
        }

        for (int i = 0; i < restante.length(); i++) {
            String nuevoPrefijo = prefijo + restante.charAt(i);
            String nuevoRestante = restante.substring(0, i) + restante.substring(i + 1);
            permutar(nuevoPrefijo, nuevoRestante, resultado);
        }
    }
}
