package factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoReservarLivroTest {
    @Test
    void deveExecutarReservar() {
        IServico servico = ServicoFactory.obterServico("ReservarLivro");
        assertEquals("o livro esta reservado", servico.executar());
    }

    @Test
    void deveCancelarReservar() {
        IServico servico = ServicoFactory.obterServico("ReservarLivro");
        assertEquals("o livro nao esta reservado", servico.cancelar());
    }
}