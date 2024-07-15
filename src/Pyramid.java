public class Pyramid {
    public static void main(String[] args){
        int n = 5;
        for( int i =1; i<=n; i++){

            for(int k = n; k>i; k--){
                System.out.print("  ");
            }


            for(int j =0; j<i; j++){
                System.out.print(i+j+" ");
            }

            for(int l =2*(i-1); l>i-1; l--){
                System.out.print(l+" ");
            }


            System.out.println();
            }

        }
    }

