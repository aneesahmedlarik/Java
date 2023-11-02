package DataStructure;

public class LinearSearch {

    public static int Linear_search(int[] arr,int x){
        int pos=-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==x){
                pos=i;
            }

        }
        return pos;
    }
    public static void main(String[] args) {
    int arr[]={2,4,5,6,7,8,10};
         int x=6;
         int result=Linear_search(arr,x);
    if(result==-1)
        System.out.println(x+ " not found in array.");

    else
        System.out.println(x+" found in array at index, "+result);
    }
}
