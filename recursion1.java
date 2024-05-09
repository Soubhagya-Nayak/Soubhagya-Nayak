public class recursion1 {
    // 5 to 1 //

    // public static void printNumber(int n) {
    // if (n == 0) {
    // return;
    // }
    // System.out.println(n);
    // printNumber(n-1);
    // }

    // public static void main(String[] args) {
    // int n = 5;
    // printNumber(n);

    // 1 to 5 //

    // public static void printNumber(int n) {
    // if (n == 6) {
    // return;
    // }
    // System.out.println(n);
    // printNumber(n+1);
    // }

    // public static void main(String[] args) {
    // int n = 1;
    // printNumber(n);
    // }

    // Sum of n numbers //

    // public static void printSum(int i, int n, int sum) {
    // if (i == n) {
    // sum += i;
    // System.out.println(sum);
    // return;
    // }
    // sum += i;
    // printSum(i+1, n, sum);

    // }

    // public static void main(String[] args) {
    // printSum(1, 5, 0);
    // }

    // Factorial of n numbers //

    // public static int calculateFactorial(int n) {
    // if (n == 1) {
    // return 1;
    // }
    // int factorial_nm = calculateFactorial(n-1);
    // int factorial = n * factorial_nm;
    // return factorial;
    // }

    // public static void main(String[] args) {
    // int n = 5;
    // int ans = calculateFactorial(n);
    // System.out.println(ans);
    // }

    // Fibonacci Series //

    // public static void printFibonacci(int a, int b,int n) {
    // if (n == 0) {
    // return;
    // }
    // int c = a + b;
    // System.out.println(c);
    // printFibonacci(b, c, n-1);
    // }

    // public static void main(String[] args) {
    // int a = 0, b = 1;
    // System.out.println(a);
    // System.out.println(b);
    // int n = 8;
    // printFibonacci(a, b, n-2);
    // }

    // X^n (stack height = n) //

    // public static int calPower(int x, int n) {
    // if (n == 0) {
    // return 1;
    // }
    // if (x == 0) {
    // return 0;
    // }
    // int xPower1 = calPower(x, n-1);
    // int xPower2 = x * xPower1;
    // return xPower2;
    // }

    // public static void main(String[] args) {
    // int x = 2;
    // int n = 5;
    // int ans = calPower(x, n);
    // System.out.println(ans);
    // }

    // X^n (stack height = n) //

    public static int calPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        
        if (n % 2 == 0) {
            return calPower(x, n / 2) * calPower(x, n / 2);
        } else {
            return calPower(x, n / 2) * calPower(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int x = 5;
        int n = 2;
        int ans = calPower(x, n);
        System.out.println(ans);
    }
}
