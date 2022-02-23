public class javaAsterisks
{ 
//    public static void rightTriangle(int n) 
  //  { 
    //    int i, j;  
      //  for(i=0; i<n; i++) //outer loop for number of rows(n) { for(j=2*(n-i); j>=0; j--) // inner loop for spaces 
//	{
   // 		for(i=0; i<n; i++) //outer loop for number of rows(n) { for(j=2*(n-i); j>=0; j--) // inner loop for spaces 
   //         {           
   //             System.out.print(" "); // printing space
    //        } 
      //      for(j=0; j<=i; j++) //  inner loop for columns
    //        {       
  //              System.out.print("* "); // print star
        //    }           
//            System.out.println(); // ending line after each row
	
	
	//	System.out.print("\t\t");

	 // for ( j=0; j<n; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
  //          { 
           //     System.out.print(" "); //print space
    //        }  
           // for (int j =i; j<=i; j++ ) //inner loop for number of columns
           // { 
          //      System.out.print("* "); //print star
          //  } 
  
         // System.out.println(); //ending line after each row
       // } 
	
         // System.out.println(); //ending line after each row
//	} 

// public static void main(String args[])
///{
//	rightTriangle(5);    
//} 
//} 

//class PyramidPattern  
//{
    public static void main(String[] args) {
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\t");
            for(int j = i; j < 6; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j<i+1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
