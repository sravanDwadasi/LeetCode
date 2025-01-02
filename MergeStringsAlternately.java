public class MergeStringsAlternately {
      public String mergeAlternately(String word1, String word2) {
        
        if(word1.length() >= word2.length()){
            StringBuilder ch = new StringBuilder();
            for(int i = 0; i < word2.length(); i++){
                ch.append(word1.charAt(i)).append(word2.charAt(i));
            }
            for(int i = word2.length(); i < word1.length(); i++){
                ch.append(word1.charAt(i));
            }
            
            return ch.toString();
        }
        else if(word2.length() > word1.length()){
            StringBuilder ch = new StringBuilder();
            for(int i = 0; i < word1.length(); i++){
                ch.append(word1.charAt(i)).append(word2.charAt(i));
            }
            for(int i = word1.length(); i < word2.length(); i++){
                ch.append(word2.charAt(i));
            }
            return ch.toString();
        }
        else{
           StringBuilder ch = new StringBuilder();
            for(int i = 0; i < word2.length(); i++){
                ch.append(word1.charAt(i)).append(word2.charAt(i));
            }
            return ch.toString();
        }

    }
}
