import java.util.Scanner;


class HackerRank1{
    public static void main(String[] args) {
        int count=0 ;
     
        Scanner scann = new Scanner(System.in);
        int x = scann.nextInt();
        int[] arr = new int[x];

        System.out.println(x);

        for(int i =0; i<x ; i++){
           
            arr[i] = scann.nextInt();

            
        }
        for(int i =0 ; i<x;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");

        for (int z =0 ;z<x;z++){
            for (int y=z+1;y<x;y++){
                if((z!=y)  && (arr[z]==arr[y])){
                    
                    count++;
                }

            }
        }
        System.out.println(count/2);






    }
    
}