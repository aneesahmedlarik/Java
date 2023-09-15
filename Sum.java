package DataStructure.Recursion;

public class Sum {

    public static int Sum(int n){
      if(n!=0){
          return n+Sum(n-1);
      }
      else{
          return 0;
      }}

    public static void main(String[] args) {

       int result= Sum(100);
        System.out.println("result is= "+result);
    }
}
