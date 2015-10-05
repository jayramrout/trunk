import java.util.*;

class linkedlistcl{
   public static void main(String args[]){
     LinkedList ll=new LinkedList();
     System.out.println("adding elements to linked list");
     ll.add("B");
     ll.add("D");
     ll.add("E");
     ll.add("2,C1");
     ll.add("F");
     ll.addLast("Z");
     ll.addFirst("A");
     
     
     System.out.println("original contents of ll are:"+ll);
     ll.remove("F");
     ll.remove(1);
     System.out.println("contents of ll after deletion: "+ll);
     ll.removeFirst();
     ll.removeLast();
    
    System.out.println("contents after deletion of first and last :"+ll);
    Object val=ll.get(2);
    ll.set(2,(String) val+"changed");
    System.out.println("ll after change:"+ll);
  }
}
 
