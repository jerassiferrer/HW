Insertion 2
public class Solution {

    public static void insertionSortPart2(int[] ar, int s)
    {       
           // Fill up the code for the required logic here
           // Manipulate the array as required
           // The code for Input/Output is already provided
        for(int i=0;i<s-1;i++){
          int j = i+1;
          while(j>0){
            if(ar[j]<ar[j-1]){
              int temp = ar[j];
              ar[j] = ar[j-1];
              ar[j-1] = temp;
              j--;
            }else{
            	break;
            }
          }
          printArray(ar);
        }
    }  