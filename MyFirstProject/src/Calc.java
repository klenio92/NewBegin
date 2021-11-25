public class Calc {
    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        calcsum(x, y);
    }

    static void calcsum(int x, int y) {
        System.out.println(x + y);
    }
    //static void calcminus(int x, int y){
    //System.out.println(x + y);
    //}
}