package perfilCliente;

import java.util.List;

import investimento.Investimento;
import investimento.rendaFixa.RendaFixa;

public class Conservador extends PerfilCliente {

    public void contratarInvestimento(RendaFixa rendaFixa) {
        super.getListaInvestimento().add(rendaFixa);
        System.out.println("Investimento contratado");
    }

    public List<Investimento> getCarteiraInvestimento() {
        
        return super.getListaInvestimento();
    }
    
}
