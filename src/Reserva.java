public class Reserva {

    private Hospede hospede;
    private Quarto quarto;
    private int dias;
    private boolean ativa;

    public Reserva(Hospede hospede, Quarto quarto, int dias){

        this.hospede = hospede;
        this.quarto = quarto;
        this.dias = dias;
        this.ativa = true;

        quarto.ocupado = true;

    }

    public void CancelarReserva(){
        this.ativa = false;
    }
    
}
