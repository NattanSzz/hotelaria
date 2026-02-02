import java.util.Scanner;

public class Menu {

    public int opcao;
    
    public Menu(){

        Scanner scam = new Scanner(System.in);

        System.out.println("1 - Listar Quartos Disponiveis.");
        System.out.println("2 - Fazer Reserva.");
        System.out.println("3 - Fazer Check-in.");
        System.out.println("4 - Fazer Check-out.");
        System.out.println("5 - Cancelar Reserva.");
        System.out.println("6 - Sair.");

        
        opcao = scam.nextInt();
        if(opcao > 0 && opcao <= 6){
            this.opcao = opcao;
        }

    }

}
