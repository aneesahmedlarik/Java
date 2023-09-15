package DataStructure;

import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows and columns for matrix one. ");
        System.out.print("enter rows of matrix= ");
        int r=sc.nextInt();
        System.out.print("enter column of matrix= ");
        int c=sc.nextInt();
        int [][] array1 = new int[r][c];

        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("enter array1["+i+"]["+j+"]= ");

                array1[i][j]= sc.nextInt();
            }
        }


        System.out.println("enter rows and columns for matrix two. ");

        int [][]array2=new int[r][c];
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("enter array2["+i+"]["+j+"]= ");

                array2[i][j]= sc.nextInt();
            }
        }
        System.out.println("Result is ");

        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(array1[i][j]+array2[i][j]+" ");
            }
            System.out.println( );

    }}}


