import java.util.Scanner;

public class Perfil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = scanner.next();
        System.out.print(String.format("Olá %s seja muito bem vindo ao meu programa !!\n", nome));


        System.out.print(String.format("Tudo bem contigo %s ?  0-Sim | 1-Não: \n", nome));
        int estadoSentimental = scanner.nextShort();

        if (estadoSentimental == 1){
            System.out.print("Fica em paz, ficar tudo bem!");
        }else{
            System.out.print("Que bom que você está bem!!!");
        }


    }
}
