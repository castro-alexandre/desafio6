import investimento.Investimento;
import investimento.rendaFixa.CDB;
import investimento.rendaFixa.Tesouro;
import investimento.rendaVariavel.Acao;
import investimento.rendaVariavel.FundoImobiliario;
import perfilCliente.Arrojado;
import perfilCliente.Conservador;

public class App {
    public static void main(String[] args) throws Exception {
        
    var conservador = new Conservador();
    //método contratarInvestimento adiciona na lista de investimentos do cliente
    conservador.contratarInvestimento(new CDB());
    conservador.contratarInvestimento(new Tesouro());

    conservador.contratarInvestimento(new Acao());//ERRO de compilação
    for (Investimento i : conservador.getCarteiraInvestimentos()) {
        System.out.println(i);
    }

    var arrojado = new Arrojado();
    arrojado.contratarInvestimento(new Acao());
    arrojado.contratarInvestimento(new FundoImobiliario());

    arrojado.contratarInvestimento(new Tesouro());//ERRO de compilação
    for (Investimento i : arrojado.getCarteiraInvestimentos()) {
        System.out.println(i);
    }
    }
}
