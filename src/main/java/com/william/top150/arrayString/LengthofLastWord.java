package com.william.top150.arrayString;

public class LengthofLastWord {

    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("a"));
        System.out.println(lengthOfLastWord("    day"));
    }

    public static int lengthOfLastWord(String s) {

        s = s.trim();

        int count = 0;

//        if(s.length()==1){
//            return 1;
//        } else if (s.isEmpty()) {
//            return 0;
//        }

        for(int i = s.length()-1; i>=0 ; i--){

            if(s.charAt(i)==' '){
                return count;
            }

            count ++;

        }

        return count;
    }

    public int lengthOfLastWord2(String s) {
        int end = s.length() - 1;

        // 從後面開始，先跳過空白（不呼叫 trim）
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }

        int count = 0;
        while (end >= 0 && s.charAt(end) != ' ') {
            count++;
            end--;
        }

        return count;
    }

}
