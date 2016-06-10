 public  static void insertIntoSorted(int[] ar) {
        // Fill up this function  
        
    int val = ar[ar.length-1];
           for(int i=ar.length-1;i>0;i--)
           {
               if(val<ar[i-1])
               {
                ar[i]=ar[i-1];
                printArray(ar);  
               }
               else
               {
                   ar[i]=val;
                    printArray(ar);
                   return;
               }   
           }
           ar[0] = val;
           printArray(ar);
    
     
    
}