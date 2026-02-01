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
            case "duplo":
                this.preco = 180.00;
            case "suite":
                this.preco = 300.00;

        }
    }
    
}
