import java.util.*;

public class Logical {
    public static void main(String[] args) {
        int a = 10;
        int b =20;
        int c =30;
        System.out.println(a<b && b<c);
        System.out.println(a<b|| b<a );
        System.out.println(!(b<c));
    }
}
