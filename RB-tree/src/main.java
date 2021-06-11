
public class main {

	public static void main(String[] args) {
		RB_Tree rb=new RB_Tree(); //9 5 7 4 3 1 2
		//rb.insert(42);rb.insert(10);rb.insert(64);	rb.insert(29); rb.insert(7); rb.insert(83); rb.insert(50); rb.insert(5); rb.insert(31);
		//rb.delete(12);
		//rb.delete(7);
		/*rb.root=new RBNode(50,false);
		rb.root.setLeft(new RBNode(10,false));
		rb.root.getLeft().setParent(rb.root);
		rb.root.setRight(new RBNode(100,true));
		rb.root.getRight().setParent(rb.root);*/
		
		/*rb.search(50, rb.root).changeColor(false);
		rb.search(83, rb.root).changeColor(false);
		rb.search(64, rb.root).changeColor(true);
		
		rb.delete(5);
		rb.delete(10);
		rb.delete(31);
		rb.delete(7);
		System.out.println("00");
		rb.delete(29);*/
		
		/*e 9
		rb.insert(7);
        rb.insert(3);
        rb.insert(18);
        rb.insert(10);
        rb.insert(22);
        rb.insert(8);
        rb.insert(11);
        rb.insert(26);
//        rb.delete(3);
		/*
		
		rb.insert(13);   //case 7/8 »«ÌŸ…
		rb.insert(8);
        rb.insert(17);
        rb.insert(1);
        rb.insert(11);
        rb.insert(15);
        rb.insert(25);
        rb.insert(6);
        rb.insert(22);
        rb.insert(27);
		*/
		
		rb.insert(5);
		rb.insert(2);
		rb.insert(8);
		rb.insert(1);
        rb.insert(4);
        rb.insert(7);
        rb.insert(9);
		rb.insert(0);
		
		rb.delete(0);
		rb.delete(2);
        
		/*rb.search(7, rb.root).changeColor(false);
		rb.search(31, rb.root).changeColor(false);
		rb.search(29, rb.root).changeColor(true);**/
		
		rb.inorderRec(rb.getroot());
		System.out.println("fsdo;jfapsdojf");
		rb.clear(rb.getroot());
		rb.inorderRec(rb.getroot());
	}

}
