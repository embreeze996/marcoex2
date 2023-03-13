package FactoryMethodTestes;

import FactoryMethod.IServico;
import FactoryMethod.ServicoFM;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ServicoFMTeste {
        @Test
        void deveRetornarExcecaoParaServicoInexistente() {
            try {
                IServico servico = ServicoFM.obterServico("Adicionar");
                assertEquals("Aluno Adicionado", servico.adicionar());
            } catch (IllegalArgumentException e) {
                assertEquals("Opção Inexistente", e.getMessage());
            }
        }

        @Test
        void deveRetornarExcecaoParaServicoInvalido() {
            try {
                IServico servico = ServicoFM.obterServico("Assinatura");
                fail();
            } catch (IllegalArgumentException e) {
                assertEquals("Opção inválido", e.getMessage());
            }
        }
    }

