import java.util.Random;

public class Benchmarking {    

    public static void benchmark() {

        TabelaTempos tabela = new TabelaTempos();

        final int MENOR = 1000, MAIOR = 10000, PASSO = 1000;

        // System.out.println("Arranjo Aleatorio");
        // System.out.println("BubbleSort, SelectionSort");

        for (int length = MENOR; length <= MAIOR; length += PASSO) {
            int[] arranjoOriginal = novoArranjoAleatorio(length);
            int[] arranjo = new int[length];

            final int REPETICOES = 10;
            long tempoMedioBubble = 0;
            long tempoMedioSelection = 0;
            long tempoMedioInsertion = 0;
            for (int i = 0; i < REPETICOES ; i++) {
                clonarArranjo(arranjo, arranjoOriginal);           

                long tempoInicio = System.currentTimeMillis();
                bubblesort(arranjo);    
                long tempoFim = System.currentTimeMillis();              
                tempoMedioBubble +=  tempoFim - tempoInicio;

                tempoInicio = System.currentTimeMillis();
                selectionSort(arranjo);    
                tempoFim = System.currentTimeMillis();              
                tempoMedioSelection +=  tempoFim - tempoInicio;

                tempoInicio = System.currentTimeMillis();
                InsertionSort(arranjo);
                tempoFim = System.currentTimeMillis();
                tempoMedioInsertion += tempoFim - tempoInicio;

            }        
            tempoMedioBubble /= REPETICOES;
            tempoMedioSelection /= REPETICOES;
            tempoMedioInsertion /= REPETICOES;

            //System.out.println(tempoMedioBubble +","+ tempoMedioSelection);
            System.out.println("Passo length = " + length);

            tabela.anotarAmostra(length, tempoMedioBubble, tempoMedioSelection, tempoMedioInsertion);
        }

        tabela.setTitulo("Benchmarking Algoritimos de Ordenação");
        tabela.setEtiquetaX("Length");
        tabela.setEtiquetaY("Tempo (ms)");
        tabela.setLegendas("BubbleSort", "SelectionSort", "InsertionSort");
        tabela.exibirGraficoXY();

    }   

    public static void clonarArranjo(int[] dst, int[] src) {
        for(int i = 0; i < dst.length; i++) {
            dst[i] = src[i];
        }    
    }    

    public static int[] novoArranjoAleatorio(int length) {    
        int[] arranjo = new int[length];
        Random r = new Random(SEED);
        for (int i = 0; i < arranjo.length; i++) {
            arranjo[i] = r.nextInt(length);

        }
        return arranjo;    
    }

    public static void selectionSort(int[] arranjo) {
        for (int i = 0; i < arranjo.length - 1; i++) {
            int maior = i;
            for (int j = i + 1; j < arranjo.length; j++){
                if (arranjo[maior] < arranjo[j]){
                    maior = j;
                }
            }
            int temp = arranjo[maior];
            arranjo[maior] = arranjo[i];
            arranjo[i] = temp;
        }
    }

    public static void bubblesort(int[] arranjo) {
        boolean trocou;
        do {
            trocou = false;
            for(int i = 1; i < arranjo.length; i++) {
                if(arranjo[i-1] > arranjo[i]) {
                    int temp = arranjo[i-1];
                    arranjo[i-1] = arranjo[i];
                    arranjo[i] = temp;
                    trocou = true;
                }
            }

        } while(trocou);
    }

    public static void InsertionSort(int[] arranjo) {
        for (int i = 1; i < arranjo.length; i++) {
            int anterior = i - 1;
            int atual = i;
            while (anterior >= 0 && arranjo[anterior] > arranjo[atual]) {
                trocar(arranjo, anterior, atual);
                anterior--;
                atual--;
            }          
        }
    }

    private static void trocar(int[] ordenado, int i, int j) {
        int seguro = ordenado[i];
        ordenado[i] = ordenado[j];
        ordenado[j] = seguro;
    }

    private final static int SEED = 0;    
}
