import java.util.Scanner;

public class Menu {

    public int opcao;
    
    public Menu(){

        Scanner scam = new Scanner(System.in);

        System.out.println("1 - Listar Quartos.");
        System.out.println("2 - Registrar-se.");
        System.out.println("3 - Fazer Reserva.");
        System.out.println("4 - Fazer Check-in.");
        System.out.println("5 - Fazer Check-out.");
        System.out.println("6 - Cancelar Reserva.");
        System.out.println("7 - Sair.");

        
        opcao = scam.nextInt();
        if(opcao > 0 && opcao <= 7){
            this.opcao = opcao;
        }

    }

}
