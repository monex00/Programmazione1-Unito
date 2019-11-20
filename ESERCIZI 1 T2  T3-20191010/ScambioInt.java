public class ScambioInt{
    public static void main(String[] args){
        int v1 = 1;
        int v2 = 2;
        int v3 = 3;
        int v4 = 4;
        int temp2 = v2;
        int temp3 = v3;
        int temp4 = v4;

        v4 = v1;
        v3 = temp4;
        v2 = temp3;
        v1 = temp2;

        System.out.println("v1:" + v1 +
        " v2:" + v2 +
        " v3:" + v3 +
        " v4:" + v4 
        );



        
        
    }
}