package factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiçoPerderLivroTest {
    @Test
    void deveExecutarPerder() {
        IServico servico = ServicoFactory.obterServico("PerderLivro");
        assertEquals("o livro  foi perdido", servico.executar());
    }

    @Test
    void deveCancelarPerder() {
        IServico servico = ServicoFactory.obterServico("PerderLivro");
        assertEquals("o livro foi recuperado com o aluno", servico.cancelar());
    }
}