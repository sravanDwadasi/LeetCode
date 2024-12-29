
import java.util.Arrays;

class ValidAnagram{
    public boolean isAnagram(String s, String t) {
        char[] charS = s.toCharArray(); 
        char[] charT = t.toCharArray(); 

        Arrays.sort(charS);
        Arrays.sort(charT);
        
        return Arrays.equals(charS, charT);
    }
}