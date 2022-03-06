import java.util.Scanner;


class Prime{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // accepting upper limit
        int m = sc.nextInt(); // accepting lower limit
        for(int j=n;j<m;j++)
        {
            checkPrime(j); //funtion call to check individually

        }
    }

    static void checkPrime(int n){
        //   int n =5;
        int i, flag=0;
        for(i=n;i<=n*n;i++)
        {
            if(n%i==0)
                flag++;
        }
        if(flag==0)
            System.out.println(n); // printing the prime numbers between the range
        
    }
}
