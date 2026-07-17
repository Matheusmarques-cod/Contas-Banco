import java.util.List;

public class Banco{

    private String Nome;
    private List<Conta> contas;

    public String getNome(){
        return Nome;
    }
    public void setNome(String nome){
        this.Nome = nome;
    }
    public List<Conta> getContas(){
        return contas;
    }
    public void setContas(List<Conta> contas){
        this.contas = contas;
    }
}