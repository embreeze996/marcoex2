package FactoryMethod;

public class ServicoAssinatura implements IServico {

    public String adicionar() {
        return "Assinatura Premium vinculada";
    }

    public String remover() {
        return "Assinatura Premium removida";
    }
}

