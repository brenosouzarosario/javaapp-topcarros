package Testes;

import java.util.Scanner;

public class Pro_Testes {

    public static void main(String[] args) {
        boolean continualaço = true;
        Scanner entrada = new Scanner(System.in);
        do {
            try {
                System.out.print("Informe o código do produto: ");
                int codigo;
                codigo = entrada.nextInt();
                continualaço = false; //entrada bem-sucedida
            } catch (Exception e) {
                entrada.nextLine(); //ignora entrada anterior.
                System.out.println("Informe só número inteiro.");
            }
        } while (continualaço);

    }
}
