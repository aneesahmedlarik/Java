public class While {
    public static void main(String[] args) {
        int i=0;
        System.out.println("in While\n");
        while(i<=10){
            System.out.println(i);
       i++;
        }

        System.out.println("in do while");
        int j=0;
        do{

            System.out.println(j);
            j++;
        }while(j!=10);



        System.out.println("in for loop");
        for (int k=0;k<=10;k++){
            System.out.println(k);
        }


    }

}
