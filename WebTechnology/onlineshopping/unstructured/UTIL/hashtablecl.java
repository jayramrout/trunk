import java.util.*;
class hashtablecl{
  public static void main(String args[]){
    Hashtable ht=new Hashtable();
    Enumeration names;
    String str;
    double bal;
    ht.put("Raj",new Double(32.25));
    ht.put("Ram",new Double(23.45));
    ht.put("Raju",new Double(-25.45));

   names =ht.keys();
   while(names.hasMoreElements()){
     str=(String)names.nextElement();
    System.out.println(ht.get(str));
  }
  System.out.println();

 bal=((Double)ht.get("Ram")).doubleValue();
 ht.put("Ram",new Double(bal+200));
 System.out.println("new balance:"+ht.get("Ram"));

  names =ht.keys();yt\
 while(names.hasMoreElements()){
     str=(String)names.nextElement();
    System.out.println(ht.get(str));
  }
 }
}