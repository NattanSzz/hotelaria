public class Quarto {

    private int numero;
    private String tipo;
    private double preco;
    private boolean ocupado;

    public Quarto(int numero, String tipo){

        this.numero = numero;
        this.tipo = tipo;
        this.ocupado = false;

        switch (tipo) {
            case "simples":
                this.preco = 100.00;
                break;
            case "duplo":
                this.preco = 180.00;
                break;
            case "suite":
                this.preco = 300.00;
                break;
        }

    }

    public void About(){
        System.out.printf("Número do Quarto: %d", this.numero);
        System.out.printf("%nTipo do Quarto: %s", this.tipo);
        System.out.printf("%nPreço do Quarto: %.2f", this.preco);
        System.out.printf("%nEstado: %s", ocupado ? "Ocupado" : "Livre");
        System.out.println("\n" + "-".repeat(30));
    }
    
}
