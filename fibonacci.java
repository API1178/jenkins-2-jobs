public class fibonacci {
    public static void main(String [] args) {
        int n;
        var console = System.console();
        System.out.println("Enter the length");
        n=Integer.parseInt(console.readLine());
        int a=-1,b=1;
        System.out.println("Fibonacci Series till " + n);;
        for(int i=0;i<n;i++) {
            int c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
} 