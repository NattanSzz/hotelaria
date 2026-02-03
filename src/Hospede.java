import java.util.Scanner;

public class Hospede {
    
    private String nome;
    private int cpf;
    private int telefone;

    public Hospede(String nome, int cpf, int telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public boolean ProcurarUsuario(int cpf){
        if(cpf == this.cpf){
            return true;
        }else{
            return false;
        }
    }

}
