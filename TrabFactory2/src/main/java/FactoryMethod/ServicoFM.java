package FactoryMethod;

public class ServicoFM {
    public static IServico obterServico(String servico) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("FactoryMethod.Servico" + servico);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Opção Inexistente");
        }
        if (!(objeto instanceof IServico)) {
            throw new IllegalArgumentException("Opção Invalida");
        }
        return (IServico) objeto;
    }
}
