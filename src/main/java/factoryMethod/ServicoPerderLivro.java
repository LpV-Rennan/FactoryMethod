package factoryMethod;

public class ServicoPerderLivro implements IServico{

    public String executar() {
        return "o livro  foi perdido";
    }

    public String cancelar() {
        return "o livro foi recuperado com o aluno";
    }
}
