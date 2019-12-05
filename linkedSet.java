package linkedlist;
/**
 * A quick demo of how to implement a set using a singly-linked list
 * @author Kyle & Dennis
 *
 */
public class LinkedSet<T> {
    //---------------------------------------------------------------
    //The body of the list is held in a singly-linked list
    private SLList<T> body;


    //----------------------------------------------------------------
    // Constructor creates a new singly-linked list for the body
    public LinkedSet()
    {
        body = new SLList<T>();
    }

    //----------------------------------------------------------------
    // member method simply delegates the membership testing to SLList
    public boolean member(T elm)
    {
        return body.member(elm);
    }

    //----------------------------------------------------------------
    // Inserts a new element in to the set, if it not already there
    public void insert(T str)
    {
        // Write your code here:
        // if str is not a member of this, insert str into this
        if(!this.member(str)) {
            this.body.insertAt(str,0);
        }
    }

    //----------------------------------------------------------------
    // Simple printing method, delegates the job to SLList
    public void printSet()
    {
        System.out.println (body.toString());
    }



    //----------------------------------------------------------------
    // builds a set by inserting all elements of an array
    public void buildSet(T[] elements)
    {
        // Write your code here
        //Insert all elements one by one
        for(int i = 0; i < elements.length; i++){
            this.insert(elements[i]);
        }
    }

    //--------------------------------------------------------------
    // Returns the union of this set and the other set without
    // modifying this set or the other set
    public LinkedSet<T> union(LinkedSet<T> otherSet)
    {

        LinkedSet<T> result = new LinkedSet<T>();
        SLList<T> resultBody = result.body;
        SLList<T> otherBody = otherSet.body;

        // First insert all the elements into the set called result
        // Hint:
        // Use SLList methods on body, otherBody and resultBody
        // Write code here

        // Now insert all the elements of the other set that
        // are not in the set called result
        // Write code here

        return result;
    }

    //--------------------------------------------------------------
    // Returns the intersection of this set and the other set
    // without modifying this set or the other set
    public LinkedSet<T> intersection(LinkedSet<T> otherSet)
    {
        LinkedSet<T> result = new LinkedSet<T>();
        SLList<T> resultBody = result.body;
        SLList<T> otherBody = otherSet.body;

        // For each element of this set, if it is also a
        // member of otherSet, then insert it into result
        // Hint:
        // Use SLList methods on body, otherBody and resultBody
        // Write code here

        return result;
    }

    //--------------------------------------------------------------
    // Returns the difference of this set and the other set
    // i.e. thisSet – otherSet  (All the elements that are in
    // in this set, but not in the other set
    // without modifying this set or the other set
    public LinkedSet<T> difference(LinkedSet<T> otherSet)
    {
        LinkedSet<T> result = new LinkedSet<T>();
        SLList<T> resultBody = result.body;
        SLList<T> otherBody = otherSet.body;

        // For each element of this set, if it NOT a
        // member of otherSet, then insert it into result
        // Hint:
        // Use SLList methods on body, otherBody and resultBody
        // Write code here

        return result;
    }


}
