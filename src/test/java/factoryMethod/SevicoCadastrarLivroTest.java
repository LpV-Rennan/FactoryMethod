package factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SevicoCadastrarLivroTest {

    @Test
    void deveExecutarCadastrar() {
        IServico servico = ServicoFactory.obterServico("CadastrarLivro");
        assertEquals("o livro inserido no arcevo", servico.executar());
    }

    @Test
    void deveCancelarCadastrar() {
        IServico servico = ServicoFactory.obterServico("CadastrarLivro");
        assertEquals("o livro foi removido do arcevo", servico.cancelar());
    }

}