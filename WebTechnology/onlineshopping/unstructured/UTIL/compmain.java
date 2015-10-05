import java.util.*;
class comparecl implements  Comparator{
   public int compare(Object a,Object b){
     String astr,bstr;
     astr=(String) a;
     bstr=(String) b;
     return bstr.compareTo(astr);
  }
}

class compmain{
  public static void main(String args[]){
   TreeSet ts=new TreeSet(new comparecl());

   ts.add("c");
   ts.add("b");
   ts.add("f");
   ts.add("d");

   Iterator i=ts.iterator();
   while(i.hasNext()){
     Object obj=i.next();
     System.out.print(obj+" ");
   }
   System.out.println();
 }
}
