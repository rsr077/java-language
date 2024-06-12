import java.util.*;

public class Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        // char at index 0
        System.out.println(sb.charAt(1));

        // set char at index 0
   sb.setCharAt(3, 'e');
System.out.println(sb);
    }
}
