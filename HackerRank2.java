// import java.util.Scanner;

// public class HackerRank2 {


//   public static void main(String[] args) {
//       Scanner scan = new Scanner(System.in);

//       long x = scan.nextLong();
      

      
//       try{
//         if(x<2147483647)
//         System.out.println(x+" can be fitted in:");
          
//       if((x<128 )&&(x>-128)){
//         System.out.println("* short");
//       }
//      if(x>=-32768 && x<32768){
//         System.out.println("* int");
//       }
//       if(x>=-2147483648 && x<=2147483647){
//         System.out.println("* long");
//       }

//       else 
//       System.out.println(x+" can't be fitted anywhere.");
//     }
//     catch(ArithmeticException e)
//     {
//         System.out.println(scan.nextLong()+" can't be fitted anywhere.");
//     }


//   }


    
// }





import java.util.*;
import java.io.*;



class HackerRank2{
    public static void main(String []argh)
    {



        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();

        for(int i=0;i<t;i++)
        {

          Scanner sc = new Scanner(System.in);

      long x = sc.nextLong();
      

      
      try{
        if(x<2147483647)
        System.out.println(x+" can be fitted in:");
          
      if((x<128 )&&(x>-128)){
        System.out.println("* short");
      }
     if(x>=-32768 && x<32768){
        System.out.println("* int");
      }
      if(x>=-2147483648 && x<=2147483647){
        System.out.println("* long");
      }

      else 
      System.out.println(x+" can't be fitted anywhere.");
    }
    catch(Exception e)
    {
        System.out.println(scan.nextLong()+" can't be fitted anywhere.");
    }

        }
    }
}



