package gfg.string;

public class Reverse2 {
    public static void main(String[] args) {
        String s1 = "omkar Sanjay Jagtap";
        System.out.println("Original String: " + s1);
        
        function(s1);
    }

    private static void function(String s1) {
        String[] s2 = s1.split(" ");
        String temp;
        int j = s2.length - 1;
        
        for (int i = 0; i < s2.length / 2; i++) {
            temp = s2[i];
            s2[i] = s2[j];
            s2[j] = temp;
            j--;
        }
        
        s1 = String.join(" ", s2);
        
        System.out.println("Reversed String: " + s1);
    }
}
