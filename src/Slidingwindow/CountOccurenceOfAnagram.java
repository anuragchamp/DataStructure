package Slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfAnagram {
    public static void main(String[] args) {
        String pattern = "cat";
        int countChar = 0;
        String str = "atcabcatxxycatyzact";

        Map<Character , Integer> count = new HashMap<>();

        for(int i=0;i<pattern.length();i++ ){
            if(!count.containsKey(pattern.charAt(i))){
                count.put(pattern.charAt(i) , 1);
                countChar++;
            }
            else{
                Integer countch = count.get(pattern.charAt(i));
                countch++;
                count.put(pattern.charAt(i) , countch);
            }
        }
        int i = 0;
        int j = 0;
        int ans = 0;
        while(j < str.length()){
                if(count.containsKey(str.charAt(j))){
                    if(count.get(str.charAt(j)) > 0 ){
                         Integer chI = count.get(str.charAt(j));
                         chI--;
                         count.put(str.charAt(j) , chI);
                    }
                    else if(count.get(str.charAt(j)) == 0){
                        countChar--;
                    }
                }

                if(j - i + 1 < pattern.length()){
                    j++;
                }
                else if(j - i + 1  == pattern.length()){
                     if(countChar == 0){
                         ans++;
                     }
                     if(!count.containsKey(str.charAt(i))){

                         count.put(str.charAt(i) , 1);
                         countChar++;
                     }
                     else{
                        Integer ii = count.get(str.charAt(i));
                        ii++;
                        count.put(str.charAt(i) , ii);

                     }
                     i++;
                     j++;
                }
        }
    }
}
