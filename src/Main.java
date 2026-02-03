import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Hospede> hospede = new ArrayList<>();

        Quarto[] quarto = {
            new Quarto(100, "simples"),
            new Quarto(101, "duplo"),
            new Quarto(102, "suite")
        };

        while(true){
            Menu menu = new Menu();
            if(menu.opcao == 6){
                break;
            }else if(menu.opcao == 0){
                menu = new Menu();
            }else if(menu.opcao == 1){
                for(Quarto Q : quarto){
                    Q.About();
                }
            }else if(menu.opcao == 2){
                Scanner scam = new Scanner(System.in);

                System.out.print("Nome: ");
                String nome = scam.nextLine();
                System.out.print("CPF: ");
                int cpf = scam.nextInt();
                System.out.print("Telefone: ");
                int telefone = scam.nextInt();

                hospede.add(new Hospede(nome, cpf, telefone));

            }

        }

    }

}
