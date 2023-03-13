package FactoryMethod;

public class ServicoAdicionar implements IServico {

    public String adicionar() {
        return "Aluno Adicionado";
    }

    public String remover() {
        return "Aluno removido";
    }
}
