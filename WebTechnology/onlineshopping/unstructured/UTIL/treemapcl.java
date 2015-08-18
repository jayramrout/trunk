class treemapcl{
  public static void main(String args[])
  {
    TreeMap tm=new TreeMap();
    tm.put("Ravi",new Double(345.35));
    tm.put("Raju",new Double(12.45));
    tm.put("Ram",new Double(90.25));
    
    Set s=tm.entrySet();
    Iterator i=set.iterator();
 
   while(i.hasNext()){
     Map.Entry m=(Map.Entry)i.next();
     System.out.print(m.getKey()+" ");
     System.out.println(m.getValue());
   }
   System.out.println();
   double d=((Double)tm.get("Ravi")).doubleValue();
   tm.put("Ravi",new Double(d+100));
   System.out.println("new value of Ravi:"+tm.get("Ravi"));
 }
}

  
    
