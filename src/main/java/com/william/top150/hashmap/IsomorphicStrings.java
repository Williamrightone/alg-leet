package com.william.top150.hashmap;

public class IsomorphicStrings {

    public static void main(String[] args) {

    }

    /**
     * 同構字串
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphic(String s, String t) {

        int[] m1 = new int[128];
        int[] m2 = new int[128];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (m1[c1] != m2[c2]) return false;

            // i+1 是避免預設值 0 和有效值混淆
            m1[c1] = i + 1;
            m2[c2] = i + 1;
        }

        return true;

    }

}
