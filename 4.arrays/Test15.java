public class Test15{  
    public static void main(String[] args) {      
          
      
        int [] arr =  {1, 2, 3, 4, 2, 7, 8, 8, 3};
        
         
        System.out.print("even numbers =");
           for(int i = 0; i < arr.length; i++) 
            {
        	   
        	   if(arr[i]%2==0)
        	   {
        		 System.out.print(arr[i]+",");
        	   }
            }
        	   
           System.out.println();
        	   System.out.print("odd numbers =");
               for(int i = 0; i < arr.length; i++) 
                {
            	   
            	   if(arr[i]%2!=0)
            	   {
            		 System.out.print(arr[i]+",");
            	   }
                } 
        	  
            }   
              
        }  
    
 