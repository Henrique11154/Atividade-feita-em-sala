import java.util.Scanner;

public class AtividadeAnoBissexto {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = entrada.nextInt();
        double conta1 = ano%400;
        int conta2 = ano%4;

        if (conta1==0){
            System.out.println(ano+" Esse ano é bissexto!");
        }
        else if (conta2 == 0 ){
            if (ano%100 != 0){
                System.out.println(ano+ " Esse ano é bissexto! ");
            }
        }else{
            System.out.println(ano+" Esse ano não é bissexto");
        }

    }
}
