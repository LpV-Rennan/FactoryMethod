package factoryMethod;

public class ServicoCadastrarLivro implements IServico{
    public String executar() {
        return "o livro inserido no arcevo";
    }

    public String cancelar() {
        return "o livro foi removido do arcevo";
    }


}
