class Solution {
    public int fib(int n) {
        int a=1,b=0,c;
        while(n-->0){
            c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
}