package FactoryMethodTestes;

import FactoryMethod.IServico;
import FactoryMethod.ServicoFM;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ServicoAssinaturaTeste {
    @Test
    void deveAdicionarAssinatura() {
        IServico servico = ServicoFM.obterServico("Assinatura");
        assertEquals("Assinatura Premium vinculada", servico.adicionar());
    }

    @Test
    void deveRemoverAssinatura() {
        IServico servico = ServicoFM.obterServico("Matricula");
        assertEquals("Assinatura Premium removida", servico.remover());
    }

}

