package perfilCliente;

import java.util.List;

import investimento.Investimento;
import investimento.rendaVariavel.RendaVariavel;

public class Arrojado extends PerfilCliente {
    
    public void contratarInvestimento(RendaVariavel rendaVariavel) {
        super.getListaInvestimento().add(rendaVariavel);
        System.out.println("Investimento contratado");
    }

    public List<Investimento> getCarteiraInvestimento() {
        
        return super.getListaInvestimento();
    }
}
