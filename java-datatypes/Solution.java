import java.util.*;
import java.io.*;
import java.math.BigInteger;

class Solution{
    
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);

        final byte MAX_VALUE_BYTE = 127;
        final byte MIN_VALUE_BYTE = -128;

        final short MAX_VALUE_SHORT = 32767;
        final short MIN_VALUE_SHORT = -32768;

        final int MAX_VALUE_INT = 2147483647;
        final int MIN_VALUE_INT = -2147483648;

        final long MAX_VALUE_LONG = 9223372036854775807L;
        final long MIN_VALUE_LONG = -9223372036854775808L;

        int quantidadeDeEntradas = sc.nextInt();
       
        String[] casosDeTeste = new String[quantidadeDeEntradas];
        String numeroASerImpressoSeEstourarCampo = "";

        StringBuffer sb = new StringBuffer();
        
        for(int i =0; i < quantidadeDeEntradas; i++){
            casosDeTeste[i] = sc.next();
            numeroASerImpressoSeEstourarCampo = casosDeTeste[i];

            try{
                long numeroAtual = Long.parseLong(casosDeTeste[i]);
                sb.append(numeroAtual+" can be fitted in: \n");

                if(numeroAtual>=MIN_VALUE_BYTE && numeroAtual<=MAX_VALUE_BYTE){
                    sb.append("* byte");
                    sb.append("\n");
                }

                if(numeroAtual>=MIN_VALUE_SHORT && numeroAtual<=MAX_VALUE_SHORT){
                    sb.append("* short");
                    sb.append("\n");
                }

                if(numeroAtual>=MIN_VALUE_INT && numeroAtual<=MAX_VALUE_INT){
                    sb.append("* int");
                    sb.append("\n");
                }

                if(numeroAtual>=MIN_VALUE_LONG && numeroAtual<=MAX_VALUE_LONG){
                    sb.append("* long");
                    sb.append("\n");
                }

            }catch(Exception e){
                sb.append(numeroASerImpressoSeEstourarCampo+" can't be fitted anywhere.");
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}



