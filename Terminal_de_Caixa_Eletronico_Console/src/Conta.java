public class Conta {
    static double saldobancario = 0;

    public static double getSaldoBancario(){
        return saldobancario;
    }
    public static void deposito(double valor){
        if(valor>0){
            saldobancario += valor;
            System.out.println("O valor R$"+valor+" foi depositado na sua conta");
        }else{
            System.out.println("Digite um valor válido");
        }
    }
    public static void saque(double valor){
        if(saldobancario>0 && valor>0){
            saldobancario -= valor;
            System.out.println("Saque o valor R$"+valor+" foi realizado na sua conta!");
        } else {
            System.out.println("Digite um valor correto ou você está duro então dorme");
        }
    }
}
