// selectionSort.java

import java.util.Scanner;

public class selectionSort{
    static void main(){
         int x;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number of Element: ");
        x=sc.nextInt();
        int [] arr =new int[x];
        System.out.print("Enter the "+x +" element: ");
        for(int i=0;i<x;i++){
            arr [i]=sc.nextInt();
        }
        System.out.print("The elements of array is: ");
        for(int i=0;i<x;i++){
            System.out.print(arr [i]);
            System.out.print(" ");
        }
        for(int i=0;i<x;i++){
            int mini=i;
            for(int j=i+1;j<x;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
        System.out.println();
        System.out.print("Sorted array is : ");
          for(int i=0;i<x;i++){
            System.out.print(arr [i]);
            System.out.print(" ");
        }
    }
}