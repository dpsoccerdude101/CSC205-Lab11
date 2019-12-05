package linkedlist;

public interface IList<T>{
    public boolean isEmpty();
    public int length();
    public T elementAt(int loc);
    public void insertAt(T info, int loc);
    public void deleteNth(int loc);
    public boolean member(T info);
    public void deleteFirstOccurrence(T info);
    public void deleteAllOccurrences(T info);
    public String toString();
    public void resetCurrentElement();
    public T nextElement();
    public boolean hasMoreElements();
}

