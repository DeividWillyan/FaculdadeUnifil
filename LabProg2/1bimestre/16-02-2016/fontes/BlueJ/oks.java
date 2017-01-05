public class oks {

    public static int Maior(int[] arr) {
    
        int maior = 0;
        
        for(int i = 0; i <= arr.length -1; i++){
            if(maior < arr[i]) {
                maior = arr[i];
            }
        }

        return maior;
    }

}
