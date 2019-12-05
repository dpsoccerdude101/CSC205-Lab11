package linkedlist;
/**
 * Node Structure in a Singly-linked list
 * @author trao
 *
 */
public class SLNode <T> {
    private T info;
    private SLNode<T> next;
    //----------------------------------------------
    public SLNode (T inf)
    {
        info = inf;
        next = null;
    }
    //----------------------------------------------
    public T getInfo() {
        return info;
    }
    //----------------------------------------------
    public void setInfo(T info) {
        this.info = info;
    }
    //----------------------------------------------
    public SLNode<T> getNext() {
        return next;
    }
    //----------------------------------------------
    public void setNext(SLNode<T> next) {
        this.next = next;
    }
}

