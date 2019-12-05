package linkedlist;

public class LinkedSetTester {

    public static void main(String[] args) {

        String[] s1 = {"abc", "defg", "abc", "ijkl"};
        // As an array, repeated elements are OK
        LinkedSet<String> set1 = new LinkedSet<String>();
        set1.buildSet(s1);								// but no repeated elements in Set
        System.out.println("Set1");
        System.out.println("---------------");
        set1.printSet();
        System.out.println("---------------");

        String[] s2 = {"xyz", "defg", "abc", "pqr", "xyz"};
        LinkedSet<String> set2 = new LinkedSet<String>();
        set2.buildSet(s2);
        System.out.println("Set2");
        System.out.println("---------------");
        set2.printSet();
        System.out.println("---------------");

        System.out.println("Set1 union Set2");
        System.out.println("---------------");
        set1.union(set2).printSet();
        System.out.println("---------------");

        System.out.println("Set1 intersection Set2");
        System.out.println("---------------");
        set1.intersection(set2).printSet();
        System.out.println("---------------");

        System.out.println("Set1 - Set2");
        System.out.println("---------------");
        set1.difference(set2).printSet();
        System.out.println("---------------");

    }

}

