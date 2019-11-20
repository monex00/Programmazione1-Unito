public class Ordine{
    public static void main(String[] args){
        int v1 = 1;
        int v2 = 6;
        int v3 = 2;
        int temp = 0;

        if(v3 <= v2){
            temp = v2;
            v2 = v3;
            v3 = temp;
        }
        if(v3 <= v1){
            temp = v1;
            v1 = v3;
            v3 = temp;
        }

        if(v2 <= v1){
            temp = v1;
            v1 = v2;
            v2 = temp;
        }

        System.out.println(v1 + " " + v2 + " " + v3);
    }
}