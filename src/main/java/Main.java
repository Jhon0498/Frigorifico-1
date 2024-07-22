import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // criando variáveis
        int contagem = 1;
        int idade, velho = 0, novo = 0, mediaIdade = 0;
        int contvelho = 1, contnovo = 1;
        double peso, pesado = 0, leve = 0, mediaPeso = 0;
        int contpesado = 1, contleve = 1;

        // perguntas norteadoras
        System.out.print("Digite a idade do animal: ");
        idade = scanner.nextInt();
        velho = idade;
        novo = idade;
        mediaIdade = idade;

        System.out.print("Digite o peso do animal: ");
        peso = scanner.nextDouble();
        pesado = peso;
        leve = peso;
        mediaPeso = peso;

        // loop
        while (idade != 0 && peso != 0) {
            System.out.print("Digite a idade do animal: ");
            idade = scanner.nextInt();
            if (idade != 0) {
                System.out.print("Digite o peso do animal: ");
                peso = scanner.nextDouble();
            }

            if (idade != 0 && peso != 0) {
                mediaIdade += idade;
                contagem++;
                if (idade > velho) {
                    velho = idade;
                    contvelho = contagem;
                }
                if (idade < novo) {
                    novo = idade;
                    contnovo = contagem;
                }
                if (peso > pesado) {
                    pesado = peso;
                    contpesado = contagem;
                }
                if (peso < leve) {
                    leve = peso;
                    contleve = contagem;
                }
            }
        }

        mediaIdade = mediaIdade / contagem;
        mediaPeso = mediaPeso / contagem;

        // mostrando resultados
        System.out.printf("\nO %d animal é o mais pesado, o peso dele é %.2f arrobas, %.2f kilos.\n", contpesado, pesado, pesado * 14.688);
        System.out.printf("O %d animal é o mais leve, o peso dele é %.2f arrobas, %.2f kilos.\n", contleve, leve, leve * 14.688);
        System.out.printf("A média do peso dos animais é %.2f. \n", mediaPeso);
        System.out.printf("O %d animal é o mais velho, a idade dele é %d. \n", contvelho, velho);
        System.out.printf("O %d animal é o mais novo, a idade dele é %d. \n", contnovo, novo);
        System.out.printf("A média da idade dos animais é %d.\n", mediaIdade);
        System.out.printf("Tem %d animais.\n", contagem);

        scanner.close();
    }
}