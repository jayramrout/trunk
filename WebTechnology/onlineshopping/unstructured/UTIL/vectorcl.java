import java.util.*;

class vectorcl{
  public static void main(String args[]){
   Vector v=new Vector(3,2);
   System.out.println("size:"+v.size());
   System.out.println("capacity:"+v.capacity());
   v.addElement(new Integer(1));
   v.addElement(new Integer(2));
   v.addElement(new Integer(3));
   v.addElement(new Integer(4));
   System.out.println("capacity after four additions:"+v.capacity());
  v.addElement(new Double(3.25));
  System.out.println("current capacity:"+v.capacity());
  v.addElement(new Float(7.5));
  v.addElement(new Integer(1));
  System.out.println("current capacity:"+v.capacity());
  System.out.println("Firstelement:"+(Integer)v.firstElement());
 System.out.println("Lastelement:"+(Integer)v.lastElement());
if(v.contains(new Integer(1)))
  System.out.println("contains 1");
Iterator it=v.iterator();
System.out.println("\n elements in vector:");
while(it.hasNext())
  System.out.print(it.next()+" ");
  System.out.println();
 }
}
