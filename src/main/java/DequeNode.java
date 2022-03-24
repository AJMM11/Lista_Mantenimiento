/**
 * Class representing a node of a double-ended queue (deque). Each node has pointers to the next and
 * previous nodes. The previous and next of the first and last node of the deque is null.
 *
 * @param <T>
 */
public class DequeNode<T> {

    private T item;
    private DequeNode<T> next;
    private DequeNode<T> previous;

    // Setters
    public void setItem(T item) {
        this.item = item;
    }

    public void setNext(DequeNode<T> next) {
        this.next = next;
    }

    public void setPrevious(DequeNode<T> previous) {
        this.previous = previous;
    }

    // Getters
    public T getItem() {
        return item;
    }

    public DequeNode<T> getNext() {
        return next;
    }

    public DequeNode<T> getPrevious() {
        return previous;
    }

    public DequeNode(T item, DequeNode<T> next, DequeNode<T> previous) {
        this.item = item;
        this.next = next;
        this.previous = previous;
    }

    public DequeNode getAt(int ind) {
        DequeNode<T> aux = this;
        try {
            while(!aux.isFirstNode()) {
                aux = aux.getPrevious();
            }
            for(int i = 0;i<ind;i++) {
                aux = aux.getNext();
            }
        }catch(NullPointerException e) {
            aux = null;
        }

        return aux;
    }
    public DequeNode find(DequeNode<T> obj){
        DequeNode<T> aux = this;

            while(!aux.isFirstNode()) {
                aux = aux.getPrevious();
            }
            while(!aux.isLastNode() && !obj.equals(aux)){
                aux = aux.getNext();
            }
        if(!aux.equals(obj)) {
            aux = null;
        }
        return aux;
    }

    public void delete(DequeNode<T> obj){
        DequeNode<T> aux = find(obj);


        if(aux.isNotATerminalNode()) {
            DequeNode<T> prev = aux.getPrevious();
            prev.setNext(aux.getNext());
            aux.getNext().setPrevious(prev);
            aux = null;
            obj = null;
        } else if(aux.isFirstNode() && aux.isLastNode()) {
            throw new RuntimeException();

        }else if(aux.isFirstNode()) {
            aux.getNext().setPrevious(null);
            aux = null;
            obj = null;
        }else{
            aux.getPrevious().setNext(null);
            obj = null;
            aux = null;
        }



    }

    public boolean isFirstNode() {
        return previous == null;
    }

    public boolean isLastNode() {
        return next == null;
    }

    public boolean isNotATerminalNode() {
        return (!isFirstNode() && !isLastNode());
    }
}


