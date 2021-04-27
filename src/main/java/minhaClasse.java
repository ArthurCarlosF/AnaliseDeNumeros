import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class minhaClasse {
    public static void main(String[] args) throws IOException {
        int cont=0;
        int contaImpares=0;
        int contaPares=0;
        int contaPositivos=0;
        int contaNegativos=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(cont<5) {

        StringTokenizer st = new StringTokenizer(br.readLine());

//declare suas variaveis

            int numero = Integer.parseInt(st.nextToken());
           // System.out.println(numero);
            if(numero>0){
                contaPositivos++;
            }else if(numero<0){
                contaNegativos++;
            }
            if(numero%2==0){
                contaPares++;
            }else{
                contaImpares++;
            }
            cont++;
        }
        System.out.printf("%d" + " valor(es) par(es)\n",contaPares);
        System.out.printf("%d" + " valor(es) impar(es)\n",contaImpares);
        System.out.printf("%d" + " valor(es) positivo(s)\n",contaPositivos);
        System.out.printf("%d" + " valor(es) negativo(s)\n",contaNegativos);

        br.close();

    }



}