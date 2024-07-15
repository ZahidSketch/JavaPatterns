public class PascalsTriangle {

    static int coeff(int n, int r) {
        int ans = fact(n)/(fact(r)*fact(n-r));
        return ans;
    }
    static int fact(int n) {
        int ans = 1;
        for(int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }
    public static void main(String[] args){

        int n = 5;

        for(int i = 0; i < n; i++){

            for(int j = 0; j < n-i; j++){
                System.out.print(" ");
            }

            for(int k = 0; k <= i; k++){
                System.out.print(coeff(i, k)+" ");
            }
            System.out.println();
        }
    }
}
