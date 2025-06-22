package Integer;

public class Fact {
    public static int fact(int n) {
        return (n == 0) ? 1 : n * fact(n -1);
    }

    public static void main(String args[]) {
        System.out.println(fact(5));;
    }    
}
