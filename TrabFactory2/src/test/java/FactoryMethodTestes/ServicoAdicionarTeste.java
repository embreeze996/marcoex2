package FactoryMethodTestes;

import FactoryMethod.IServico;
import FactoryMethod.ServicoAdicionar;
import FactoryMethod.ServicoFM;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ServicoAdicionarTeste {

    @Test
    void deveAdicionarAluno() {
        IServico servico = ServicoFM.obterServico("Matricula");
        assertEquals("Matrícula efetivada", servico.adicionar());
    }

    @Test
    void deveRemoverAluno() {
        IServico servico = ServicoFM.obterServico("Matricula");
        assertEquals("Matrícula cancelada", servico.remover());
    }

}

