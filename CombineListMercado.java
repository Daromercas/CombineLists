/** 
 * @author David Mercado
  *This program combines two lists of integers but whitout the duplicates */
import java.util.*;
public class CombineListMercado{  
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    int list1=1,list2=1;
 
    ArrayList<Integer> cList1 = new ArrayList<Integer> ();
    ArrayList<Integer> cList2 = new ArrayList<Integer> ();
    
    System.out.println("Enter List 1 (enter 0(zero)to finish):");
    while(list1 !=0){
      list1=input.nextInt();
    if(list1!=0)
      cList1.add(list1);
    }
    System.out.println("Enter List 2 (enter 0(zero)to finish):");
    while(list2 !=0){
      list2=input.nextInt();
    if(list2!=0)
      cList2.add(list2);
    }
    System.out.print("Combined list is: ");
    System.out.print(combineLists(cList1,cList2));
    input.close();
  }
  public static ArrayList<Integer> combineLists(ArrayList<Integer> list1,ArrayList<Integer> list2) {
     ArrayList<Integer> combinedList  = new ArrayList<Integer>();
    for(int i:list1){ //enhaced for loop that combines the arrays, without the duplicates
      if(combinedList.contains(i))
        continue;
      else 
        combinedList.add(i); 
     }
    
     for(int p:list2){
      if(combinedList.contains(p))
        continue;
      else 
        combinedList.add(p);
     }
    return combinedList;
}
}

  