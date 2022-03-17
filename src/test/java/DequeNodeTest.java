import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DequeNodeTest {

    DequeNode NodoUnico;

    @BeforeEach
            public void setUp()  {
                 NodoUnico = new DequeNode(0,null,null);
             }


    @Test
    public void anadirSigTest() {
        DequeNode sig = new  DequeNode(0,null,NodoUnico);
        NodoUnico.setNext(sig);
        assertEquals(NodoUnico.getNext(),sig);
    }

    @Test
    public void anadirPrevTest() {
        DequeNode prev = new  DequeNode(0,NodoUnico,null);
        NodoUnico.setPrevious(prev);
        assertEquals(NodoUnico.getPrevious(),prev);
    }

    @Test
    public void buscarPrimeroTest() {
        assert(NodoUnico.isFirstNode());
    }

    @Test
    public void buscarUltimoTest() {
        assert(NodoUnico).isLastNode();
    }

    @Test
    public void elementoNoTerminal()
    {

    }
}
