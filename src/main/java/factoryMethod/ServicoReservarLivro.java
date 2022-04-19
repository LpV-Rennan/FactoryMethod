package factoryMethod;

public class ServicoReservarLivro implements IServico{

    public String executar() {
        return "o livro esta reservado";
    }

    public String cancelar() {
        return "o livro nao esta reservado";
    }

}
