import java.util.Arrays;

public class Aula {

    /** Pré-Condição¹: Vetores sempre devem entrar ondenados. */

    public static int[] mergeOrdenado(int[] l, int[] r) {
        int[] ArrFim = new int[l.length + r.length];

        int i = 0, j = 0, k = 0;
        while (i < l.length && j < r.length) {
            if (l[i] < r[j])     
                ArrFim[k++] = l[i++];
            else        
                ArrFim[k++] = r[j++];              
        }
        
        while (i < l.length)  ArrFim[k++] = l[i++];
        while (j < r.length)  ArrFim[k++] = r[j++];

        System.out.println("-> "+Arrays.toString(ArrFim)); 
        return ArrFim;
    }
}    