import java.util.*;
public class Conga {
    public static Scanner s = new Scanner(System.in);
    public static boolean Redoublable(int[] digits){
        int count = 0;
        for(int i = 0; i < digits.length; i++){
            for(int j = 0; j < digits.length; j++){
                if(digits[i] == 2 * digits[j]){
                    count++;
                    digits[i] = 1000001;
                    digits[j] = 1000001;
                }
            }
        }
        if (count >= digits.length /2) return true;
        return false;
    }
    public static void main(String[] args){
        int numOfLines = s.nextInt();
        for(int i = 0; i < numOfLines; i++){
            int length = s.nextInt();
            int[] digits = new int[length];
                for(int j = 0; j < length; j++){
                    digits[j] = s.nextInt();
                }
            if(Redoublable(digits)) System.out.println("This can be redoubled");
            else System.out.println("This cannot be redoubled");
        }
    }
}
