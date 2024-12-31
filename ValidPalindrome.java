public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        int start = 0;
        int last = s.length()-1;

        while(start < last){
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(last))) return false;
                start++;
                last--;
        }
        return true;
    }
}
