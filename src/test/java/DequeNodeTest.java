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
    public void elementoNoTerminal() {
        DequeNode sig = new  DequeNode(0,null,NodoUnico);
        NodoUnico.setNext(sig);
        DequeNode fin = new DequeNode(0,null,sig);
        sig.setNext(fin);
        assert sig.isNotATerminalNode();
    }
    @Test
    public void deUltimoANoTerminal() {
        DequeNode sig = new  DequeNode(0,null,NodoUnico);
        NodoUnico.setNext(sig);
        DequeNode fin = new DequeNode(0,null,sig);
        sig.setNext(fin);
        DequeNode aux = new  DequeNode(0,null,fin);
        fin.setNext(aux);
        assert(fin.isNotATerminalNode());
    }
    @Test
    public void dePrimeroANoTerminal() {
        DequeNode sig = new  DequeNode(0,null,NodoUnico);
        NodoUnico.setNext(sig);
        DequeNode fin = new DequeNode(0,null,sig);
        sig.setNext(fin);
        DequeNode prev = new  DequeNode(0,NodoUnico,null);
        NodoUnico.setPrevious(prev);
        assert(NodoUnico.isNotATerminalNode());
    }
    @Test
    public void comprobarObjeto() {
        assertEquals(NodoUnico.getItem(),0);
    }
    @Test
    public void comprobarModObj() {
        NodoUnico.setItem(2);
        assertEquals(NodoUnico.getItem(),2);
    }
    @Test
    public void comprobarPos(){
        DequeNode sig = new  DequeNode(0,null,NodoUnico);
        NodoUnico.setNext(sig);
        DequeNode fin = new DequeNode(0,null,sig);
        sig.setNext(fin);
        assertEquals(sig.getAt(2),fin);
    }
    @Test
    public void comprobarNullInd()
    {
        DequeNode sig = new  DequeNode(0,null,NodoUnico);
        NodoUnico.setNext(sig);
        DequeNode fin = new DequeNode(0,null,sig);
        sig.setNext(fin);
        assertEquals(sig.getAt(4),null);
    }
    @Test
    public void comprobarEncuentraObj(){
        DequeNode sig = new  DequeNode(0,null,NodoUnico);
        NodoUnico.setNext(sig);
        DequeNode fin = new DequeNode(0,null,sig);
        sig.setNext(fin);
        assertEquals(sig.find(fin),fin);
    }
    @Test
    public void comprobarNoEncuentraObj(){
        DequeNode sig = new  DequeNode(0,null,NodoUnico);
        NodoUnico.setNext(sig);
        DequeNode fin = new DequeNode(0,null,sig);
        sig.setNext(fin);
        DequeNode aux = new DequeNode(0,null,null);
        assertEquals(sig.find(aux),null);
    }
    @Test
    public void comprobarBorrarUnico(){

        NodoUnico.delete(NodoUnico);
        assertEquals(NodoUnico.find(NodoUnico),null);
    }
}
