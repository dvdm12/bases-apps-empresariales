import java.util.List;
import java.util.Collections;

public class MinMaxFinder {
    public static int[] encontrarMinMax(List<Integer> lista) {
        if (lista.isEmpty()) return new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE};
        int min = Collections.min(lista);
        int max = Collections.max(lista);
        return new int[]{min, max};
    }
}
