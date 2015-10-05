import java.util.*;
class itercl{
  public static void main(String args[]){
    ArrayList al=new ArrayList();
    al.add("a");
    al.add("b");
    al.add("f");
    al.add("e");

   System.out.print("contents of al:");
   Iterator it=al.iterator();
   while(it.hasNext()){
     Object obj=it.next();
     System.out.print(obj+" ");
   }
   System.out.println();

   ListIterator lit=al.listIterator();
   while(lit.hasNext()){
     Object obj=lit.next();
    lit.set(obj+"+");
  }
  System.out.print("changed contents of al:");
  it=al.iterator();
  while(it.hasNext()){
    Object obj=it.next();
   System.out.println(obj+" ");
 }
  System.out.println();

 System.out.print("changed list backwards:");
 while(lit.hasPrevious()){
   Object obj=lit.previous();
   System.out.print(obj+" ");
  }
  System.out.println();
 }
}