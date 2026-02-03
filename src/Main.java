import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner scam = new Scanner(System.in);
        
        ArrayList<Hospede> hospede = new ArrayList<>();
        ArrayList<Reserva> reserva = new ArrayList<>();

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

                System.out.print("Nome: ");
                String nome = scam.nextLine();
                System.out.print("CPF: ");
                int cpf = scam.nextInt();
                System.out.print("Telefone: ");
                int telefone = scam.nextInt();

                hospede.add(new Hospede(nome, cpf, telefone));

            }else if(menu.opcao == 3){

                Hospede usuario = null;
                Quarto quarto_escolhido = null;
                int dias;

                System.out.print("Digite seu CPF: ");
                int cpf = scam.nextInt();
                for(Hospede h : hospede){
                    if(h.ProcurarUsuario(cpf)){
                        usuario = h;
                        break;
                    }
                }
                if(usuario == null){
                    System.out.print("Usuario não encontrado.");
                }else{
                    System.out.print("Digite o número do quarto: ");
                    int numero = scam.nextInt();
                    for(Quarto q : quarto){
                        if(q.ProcurarQuarto(numero)){
                            quarto_escolhido = q;
                            break;
                        }
                    }
                    if(quarto_escolhido == null){
                        System.out.print("Quarto não encontrado.");
                    }else{
                        if(quarto_escolhido.ocupado == true){
                            System.out.print("Quarto ocupado.");
                        }else{
                            System.out.print("Dias de reserva: ");
                            dias = scam.nextInt();
                            reserva.add(new Reserva(usuario, quarto_escolhido, dias));
                            System.out.println("Reserva Concluida com Sucesso!");
                        }

                    }
                }


            }

        }

    }

}
