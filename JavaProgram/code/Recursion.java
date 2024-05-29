
public class Recursion{
    static int fact(int n)
    {
        
        if(n==0)
        return n=1;
        return n*fact(n-1); // 5*4*3*2*1 =120  5*fact(4), 5*4*fact(3),5*4*3fact(2), 5*4*3*2fact(1),
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
}
