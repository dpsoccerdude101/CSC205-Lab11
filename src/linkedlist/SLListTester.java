package linkedlist;

public class SLListTester {
	/*
	public static void main(String[] args)
	{

		SLList <String> sll = new SLList<String>();

		//Test insert
		sll.insertAt("abc", 0);
		sll.insertAt("ijk", 1);
		sll.insertAt("ABCD", 2);
		sll.insertAt("pqrst", 0);
		System.out.println("List Now: " +sll);

		//Test delete
		sll.deleteNth(1); //delete
		System.out.println("List After deleting: "+sll);

		sll.deleteNth(2);
		System.out.println("List After deleting: "+sll);

		SLNode<Integer> p1 = new SLNode<Integer>(200);
		SLNode<Integer> p2 = new SLNode<Integer>(100);
		SLNode<Integer> p3 = new SLNode<Integer>(300);
		SLNode<Integer> p4 = new SLNode<Integer>(50);
		//a
		p1.setNext(p3);
		System.out.println(p1.getInfo()+" "+p1.getNext().getInfo());
		//b
		p1.setNext(p4);
		p4.setNext(p2);
		p2.setInfo(500);
		System.out.println(p1.getInfo()+" "+p1.getNext().getInfo()+" " +
				p4.getNext().getInfo());
		//c
		p2.setNext(p3);
		p2 = p1;
		while (p2 != null){
			System.out.print(p2.getInfo()+" ");
		    p2 = p2.getNext();
		}
		}
		*/

    public static void main(String[] args) {
        SLNode p = null;
        //Exercise 1
        SLNode p1 = new SLNode(10);
        SLNode p2 = new SLNode(20);
        SLNode p3 = p2;
        p1.setNext(p2);
        p2.setInfo(100);
        System.out.println(p1.getInfo()+" "+p2.getInfo());
        System.out.println(p1.getInfo()+" "+p3.getInfo());

        //Exercise 2
        SLNode p4 = new SLNode(100);
        SLNode p5 = p4;
        p4.setNext(p5);
        p5.setInfo(200);
        System.out.println(p4.getInfo()+" "+p5.getInfo());
        System.out.println(p4.getInfo()+" "+p4.getNext().getInfo());

        //Exercise 3
        SLNode p6 = new SLNode(400);
        SLNode p7 = new SLNode(600);
        SLNode p8 = new SLNode(900);
        p6.setNext(p8);
        p = p6;
        while (p != null){
            System.out.print(p.getInfo()+"  ");
            p = p.getNext();
        }
        System.out.println(p6.getInfo()+" "+p6.getNext().getInfo());

        //Exercise 4
        p7.setNext(p8);
        p6.setNext(p7);
        p = p6;
        while (p != null){
            System.out.print(p.getInfo()+"  ");
            p = p.getNext();
        }

        //Exercise 5
        p7.setNext(null);
        p = p6;
        while (p != null){
            System.out.print(p.getInfo()+"  ");
            p = p.getNext();
        }

        SLList<Integer> intList = new SLList<Integer>();

        for (int k = 0; k < 8; k++)
            intList.insertAt(k, k);
        System.out.println("Length = " + intList.length());


    }
}

