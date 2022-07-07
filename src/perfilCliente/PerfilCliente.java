package perfilCliente;

import java.util.List;

import investimento.Investimento;

public abstract class PerfilCliente {

    private String nome;
    private long cpf;
    private List<Investimento> listaInvestimento;
    

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return this.cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public List<Investimento> getListaInvestimento() {
        return this.listaInvestimento;
    }

    public void setListaInvestimento(List<Investimento> listaInvestimento) {
        this.listaInvestimento = listaInvestimento;
    }

}
