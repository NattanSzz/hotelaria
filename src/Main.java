public class Main {
    public static void main(String[] args) {
        
        Quarto quarto001 = new Quarto(100, "simples");
        Quarto quarto002 = new Quarto(101, "duplo");
        Quarto quarto003 = new Quarto(102, "suite");

        // Menu menu = new Menu();

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
