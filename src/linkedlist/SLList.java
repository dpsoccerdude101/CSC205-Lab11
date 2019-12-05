package linkedlist;

public class SLList<T> implements IList<T> {
    //------------------------------------------------------------------
    //List is represented by a reference to
    private SLNode<T> head;
    private SLNode<T> currentElement = null;

    public SLNode<T> getHead()
    {
        return head;
    }
    //------------------------------------------------------------------
    public boolean isEmpty()
    {
        return (head == null);
    }

    //------------------------------------------------------------------
    public void resetCurrentElement()
    {
        currentElement = head;
    }

    //------------------------------------------------------------------
    public boolean hasMoreElements()
    {
        return (currentElement != null);
    }

    //------------------------------------------------------------------
    public T nextElement()
    {
        T thisElement = currentElement.getInfo();
        currentElement = currentElement.getNext();
        return thisElement;
    }

    //------------------------------------------------------------------
    public int length()
    {
        int len = 0;
        SLNode<T> thisNode = head;
        while (thisNode != null)
        {
            len++;
            thisNode = thisNode.getNext();
        }
        return len;
    }

    //------------------------------------------------------------------
    public T elementAt(int loc)
    {
        int ct = 0;
        SLNode<T> thisNode = head;
        while (thisNode != null && ct < loc)
        {
            thisNode = thisNode.getNext();
            ct++;
        }
        if (thisNode != null)
            return thisNode.getInfo();
        return null;
    }

    //------------------------------------------------------------------
    public T first()
    {
        if (this.isEmpty())
            return null;
        return elementAt(0);
    }

    //------------------------------------------------------------------
    public SLList rest()
    {
        if (this.isEmpty())
            return null;
        SLList rest = new SLList();
        rest.head = this.head.getNext();
        return rest;
    }

    /**
     * Insert the new info at the location loc
     * @param info
     * @param loc
     * @return
     */
    //---------------------------------------------------------------------
    public void insertAt(T info, int loc)
    {
        //------------------------------------------------------
        // If loc is illegal, return false
        if (loc < 0 || loc > size())
            return;

        //------------------------------------------------------
        // Create a new node for info
        SLNode<T> node = new SLNode<T>(info);

        //------------------------------------------------------
        // Special case: insert at the beginning
        if (loc == 0)
        {
            node.setNext(head);
            head = node;
            return;
        }

        //------------------------------------------------------
        //Find a pointer to the node before the insertion point
        SLNode<T> pointer = pointerTo(loc-1);

        //------------------------------------------------------
        //Next of the new node should go to the next of the pointer
        node.setNext(pointer.getNext());

        //------------------------------------------------------
        //Next of pointer should go to new node
        pointer.setNext(node);

        //------------------------------------------------------
    }

    //--------------------------------------------------------------------
    /**
     * Delete element at a location loc
     */
    public void deleteNth(int loc)
    {
        //------------------------------------------------------
        // If loc is illegal, return false
        if (loc < 0 || loc > size())
            return;
        //------------------------------------------------------
        // Special case: delete at the beginning
        if (loc == 0)
        {
            head = head.getNext();
            return;
        }
        //------------------------------------------------------
        //Find a pointer to the node before the insertion point
        SLNode<T> pointer = pointerTo(loc-1);

        //------------------------------------------------------
        //Make it point to the node after the node to be deleted
        pointer.setNext(pointer.getNext().getNext());

    }

    //--------------------------------------------------------------------
    public boolean member(T info)
    {
        SLNode<T> thisNode = head;
        while (thisNode != null)
        {
            if (thisNode.getInfo().equals(info))
                return true;
            thisNode = thisNode.getNext();
        }
        return false;
    }


    //--------------------------------------------------------------------
    /**
     * Return a pointer to the node whose index is n
     */
    public SLNode<T> pointerTo(int n)
    {
        if (n < 0 || n > size())
            return null;
        SLNode<T> pointer = head;
        int counter = 0;
        while (counter < n)
        {
            counter++;
            pointer = pointer.getNext();
        }
        return pointer;
    }

    //---------------------------------------------------------------------
    /**
     * Find the length of the list
     */
    public int size()
    {
        return length();
    }

    /**
     * Delete the first occurrence of this info in a list
     * If this info doesn't occur then nothing is done
     */
    //------------------------------------------------------------------
    public void deleteFirstOccurrence(T info)
    {
        SLNode<T> thisNode = head;
        SLNode<T> prevNode = null;
        while (thisNode != null)
        {
            if (thisNode.getInfo().equals(info))
            {
                if (thisNode == head)
                    head = thisNode.getNext();
                else
                    prevNode.setNext(thisNode.getNext());
                return;
            }
            prevNode = thisNode;
            thisNode = thisNode.getNext();
        }
    }

    //------------------------------------------------------------
    public void deleteAllOccurrences(T info)
    {
        SLNode<T> thisNode = head;
        SLNode<T> prevNode = null;
        while (thisNode != null)
        {
            if (thisNode.getInfo().equals(info))
            {
                if (thisNode == head)
                    head = thisNode.getNext();
                else
                    prevNode.setNext(thisNode.getNext());
            }
            prevNode = thisNode;
            thisNode = thisNode.getNext();
        }
    }

//---------------------------------------------------------------------
    /**
     * Create a printable string from the data in this list
     */
    public String toString()
    {
        String result = "[ ";
        SLNode<T> pointer = head;
        while (pointer != null)
        {
            result = result + pointer.getInfo().toString()+", ";
            pointer = pointer.getNext();
        }
        result = result + " ]";
        return result;
    }

    /**
     * Concatenating s2 at the end of this list
     */
//---------------------------------------------------------------------
    public void concat(SLList<T> s2)
    {
        // Get a pointer to the last element
        SLNode<T> pointer = this.pointerTo(this.length() - 1);
        pointer.setNext(s2.getHead());

    }
}
