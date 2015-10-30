//lab for creating a bubble sorting
//Author: Ivaan Shrestha
//November 20, 2014

public class BubbleSort {
   private int[] data; // declaring an array data
   public static final int NUM = 9;//constant
   private boolean swap = true;//boolean variable
  
   
   //constructor with one parameter 
   public BubbleSort(int [] newArray) {
      data = new int[NUM]; //initializing the array
      
      for (int i=0; i<NUM; i++) {//for loop
      
         data[i] = newArray[i];//assigning values for arrays
      
      }
      
   
   }
   //sorting method
   public void sort() {
      int itemsSorted =0;//int for counting items stored
      int n = 9;//int for n times number of datas
      int temp=999999;//intialize temp value
      do 
      {swap = false;//begin a pass
         for (int b=n-1,t=n-2; t >= itemsSorted; b--, t--) {
            if(data[b] < data[t]){ //two adjacent elements not in sorted order
               swap = true;//switch two elements
               temp = data[t];// storing value of big value t to temp
               data[t] = data[b];//storing low value to in place pf big value
               data[b] = temp;// store big value instead of low value
            }
            
         }
         itemsSorted++;//increase items sorted one more item in its final spot
         String output = "The sorting of data follows "; //print intems sorted 
         for(int i = 0; i <NUM; i++) {//loop variable
      
            output += data[i] + ",";//adding sorted value
         }
         System.out.println(output);//printing output

      }   
      while(swap == true && itemsSorted!= n-1);
              
   
   }
   //string method
   public String toString(){
   
      String output = "After sorting ";//initializing String output
      
      for(int i = 0; i <NUM; i++) { //for loop
      
         output += data[i]+ ",";//adding data
      }
      
      return output;//returning ouptut
   }
   //main method
   public static void main (String[] args) {
   
      BubbleSort myArray = new BubbleSort(new int[]{90,80,50,30,10,20,70,40,60});//adding values to array
      System.out.println("Before sorting " + myArray);
      myArray.sort();//sorting BubbleSOrt myArray
      System.out.print(myArray);//printing myArray
   
   }
   
   



}