import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        double NumeroDecimal = 0;

        System.out.println("Informe o Número em Binário De 4 bits");
        String BinarioInformado = s.next();

        if (BinarioInformado.charAt(3) == '1') {
           NumeroDecimal += 2;  
        }
        if (BinarioInformado.charAt(2) == '1') {
           NumeroDecimal += 4;  
        }
        if (BinarioInformado.charAt(1) == '1') {
           NumeroDecimal += 8;  
        }
        if (BinarioInformado.charAt(0) == '1') {
            NumeroDecimal += 16;
        }
        
        System.out.println("O número Binário Informado em Decimal é: " + NumeroDecimal);


    

    }
}