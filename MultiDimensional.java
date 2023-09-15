package DataStructure;

import java.util.Scanner;


public class MultiDimensional {

public static void printArr(int[][]arr, int r, int c){
    for(int i =0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(arr[i][j]+" ");

        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter rows of matrix= ");
        int r=sc.nextInt();
        System.out.print("enter column of matrix= ");
        int c=sc.nextInt();
    int [][] arr= new int[r][c];

    for(int i =0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print("enter arr["+i+"]["+j+"]= ");

        arr[i][j]= sc.nextInt();
        }
    }
        System.out.println("matrix result ");
    printArr(arr,r,c);
       }}
