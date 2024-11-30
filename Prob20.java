// Reverse a string

public class Prob20 {

    public static void main(String[] args) {
        String str = "Hariharan";
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);
    }
}
