import java.util.InputMismatchException;
import java.util.Scanner;

public class CaixaEletronico {

    public static void exibirMenu(){
        System.out.println("------- Caixa Eletronico --------");
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Depositar");
        System.out.println("3. Saque");
        System.out.println("4. Sair");
        System.out.println("----------------------------------");
    }

    public static void inciarAtendimento(){
        Scanner leitor = new Scanner(System.in);
        int opções = -1;
        double valor = 0;

        do{
            exibirMenu();
            try{
                System.out.println("Digite uma opção:");
                opções = leitor.nextInt();
                leitor.next();
            }catch (InputMismatchException e){
                System.out.println("Digite uma valor valido");
                opções = -1;
                leitor.next();
            }
            switch (opções) {
                case 1:
                    double saldo = Conta.getSaldoBancario();
                    System.out.println("O seu Saldo é " + saldo);
                    break;
                case 2:
                    try{
                        System.out.println("Digite o valor quer Depositar");
                        valor = leitor.nextDouble();
                        leitor.next();
                    }catch (InputMismatchException e){
                        System.out.println("Digite um valor correto");
                        leitor.next();
                        opções = -1;
                    }
                    Conta.deposito(valor);
                    break;
                case 3:
                    try {
                        System.out.println("Digite o valor do saque");
                        valor = leitor.nextDouble();
                        leitor.next();
                    } catch (InputMismatchException e){
                        System.out.println("Digite um valor correto");
                        leitor.next();
                        opções = -1;
                    }
                    Conta.saque(valor);
                    break;
                case 4:
                    System.out.println("Até logo");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }while (opções!=4);
    }

}
