package DataStructure;

public class BinarySearchAlgorithm {

public static int Binary_Search(int[] arr, int lb, int ub, int value){
    int beg=lb, end=ub,pos=-1;
    int mid;
   while(beg<=end){
       mid=(beg+end)/2;
       if(arr[mid]==value) {
           pos = mid;
           System.out.println("found");
       return pos; }
       else if(arr[mid]>value) {
           end=mid-1;
       }
       else beg=mid+1;
   }
  return pos;}


    public static void main(String[] args) {
      int[] arr ={2,3,4,5,6,7,8,9,10,11,12};
       int lb=0;
       int ub=10;
       int value=11;
      int result=  Binary_Search(arr,lb,ub,value);
     if(result==-1) {
         System.out.println(value + " not found in array.");
     } else {
         System.out.println(value + " found at index,"
                 + result);
     }}
}
