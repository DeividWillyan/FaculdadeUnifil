public class exercicio3 {
        
    public static void exercicioA(String verifica) {
       
       //(a) Faça um método static na classe Principal que recebe uma String por parâme-
       //    tro e indique se trata-se de um palíndromo. Por exemplo, o método deve indicar
       //    “OMISSISSIMO” como palíndromo, enquanto “ACUCAR” como não-palíndromo.
       
        int j = verifica.length() - 1;
        String recebe = "";

        for(int i = 0 ; j >= i ; j--) {
           recebe = recebe + verifica.charAt(j);
        }
        
        if(recebe.equals(verifica))  {
            System.out.println("Palídromo");
        } else {
            System.out.println("Não-palídromo");
        }
    }

    public static void exercicioB(String verifica) {
        
        //(b) Faça um método similar ao anterior, porém este deve ignorar espaços em branco,
        //    tal que a String “ROMA ME TEM AMOR’ é considerado um palíndromo. 
        
        verifica = verifica.replaceAll(" ",""); // troca onde tem espaço " " para ficar sem espaço ""
        int j = verifica.length() - 1;
        String recebe = "";

        for(int i = 0 ; j >= i ; j--) {
           recebe = recebe + verifica.charAt(j);
        }
        
        if(recebe.equals(verifica))  {
            System.out.println("Palídromo");
        } else {
            System.out.println("Não-palídromo");
        }
    }
}
