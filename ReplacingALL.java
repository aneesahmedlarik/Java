public class ReplacingALL {
    public static void main(String[] args) {
        String txt="the quick fox jumps over a lazy dog.";
        System.out.println("before replacing it is.");
        System.out.println(txt);
        System.out.println("after replacing cat with fox is.");
        System.out.println(txt.replaceAll("fox","cat"));
    }
}
