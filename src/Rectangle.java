public class Rectangle {

    static void rectangle(int r, int c){
        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= c; j++){
                if(i == 1 || i == r || j == c || j == 1){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int r = 4;
        int c = 12;
        rectangle(r, c);
    }
}
