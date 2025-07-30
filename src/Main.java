import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        Conversor conversor = new Conversor();

        while(n!= 7){
            menu();
            n = scanner.nextInt();


            try {

                double valor;

                switch (n) {
                    case 1:
                        System.out.print("Digite o valor em Dólares: ");
                        valor = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println(conversor.converter("USD", "CLP", valor));
                        break;
                    case 2:
                        System.out.print("Digite o valor em Pesos chilenos: ");
                        valor = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println(conversor.converter("CLP", "USD", valor));
                        break;
                    case 3:
                        System.out.print("Digite o valor em Dólares: ");
                        valor = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println(conversor.converter("USD", "BRL", valor));
                        break;
                    case 4:
                        System.out.print("Digite o valor em Real brasileiro: ");
                        valor = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println(conversor.converter("BRL", "USD", valor));
                        break;
                    case 5:
                        System.out.print("Digite o valor em Dólares: ");
                        valor = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println(conversor.converter("USD", "ARS", valor));
                        break;
                    case 6:
                        System.out.print("Digite o valor em Pesos argentinos: ");
                        valor = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println(conversor.converter("ARS", "USD", valor));
                        break;
                    case 7:
                        System.out.println("Volte sempre.");
                        break;
                    default:
                        System.out.println("Opção inválida, tente outra vez.");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Finalizando a aplicação");
            }
        }
    }

    public static void menu(){
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.println("Seja bem-vindo ao Conversor de Moedas\n\n");
        System.out.println("1) Dólar =>> Peso chileno");
        System.out.println("2) Peso chileno =>> Dólar");
        System.out.println("3) Dólar =>> Real brasileiro");
        System.out.println("4) Real brasileiro =>> Dólar");
        System.out.println("5) Dólar =>> Peso argentino");
        System.out.println("6) Peso argentino =>> Dólar");
        System.out.println("7) Sair");
        System.out.println("Escolha uma opção válida:");
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
    }
}
