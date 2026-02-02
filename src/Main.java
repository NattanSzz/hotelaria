public class Main {
    public static void main(String[] args) {
        
        Quarto[] quarto = {
            new Quarto(100, "simples"),
            new Quarto(101, "duplo"),
            new Quarto(100, "suite")
        };

        while(true){
            Menu menu = new Menu();
            if(menu.opcao == 6){
                break;
            }else if(menu.opcao == 0){
                menu = new Menu();
            }

        }

    }

}
