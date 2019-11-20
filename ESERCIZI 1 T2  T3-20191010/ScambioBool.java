public class ScambioBool{
    public static void main(String[] args){
        boolean x = false;
        boolean y = true;
        boolean temp = x;
        x = y;
        y = temp;
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }
}