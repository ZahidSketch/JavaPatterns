 public class DownWardTriangle {
        public static void main(String[] args) {
            int n = 7;

            for (int i = 1; i <= n; i++) {



                for (int k = n; k >= i; k--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
