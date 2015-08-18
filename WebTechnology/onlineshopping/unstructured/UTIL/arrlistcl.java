import java.util.*;
 class arrlistcl{
   public static void main(String args[]){
     ArrayList arr1=new ArrayList();
    System.out.println("size of arr1="+arr1.size());
    arr1.add("c");
    arr1.add("d");
    arr1.add("b");
    arr1.add("a");
    arr1.add(1,"3A");
    System.out.println("size of arr1 after addition is :"+arr1.size());
    System.out.println("contents of arr1:"+arr1);
    
    arr1.remove("d");
    arr1.remove(3);
    System.out.println("size of arr1 after deletion :"+arr1.size());
    System.out.println("contents of arr1 :"+arr1);
  }
}