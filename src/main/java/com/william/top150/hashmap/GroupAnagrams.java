package com.william.top150.hashmap;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(groupAnagrams(strs));

    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){

            StringBuffer sb = new StringBuffer();

            char[] cahrArr = s.toCharArray();

            Arrays.sort(cahrArr);

            for(char c :cahrArr){
                sb.append(c);
            }

            String sortedStr = sb.toString();

            if(map.containsKey(sortedStr)){
               List<String> strList =  map.get(sortedStr);
               strList.add(s);
               map.put(sortedStr, strList);

            }else{
                List<String> temp = new ArrayList<>();
                temp.add(s);
                map.put(sortedStr, temp);
            }

        }

        List<List<String>> result = new ArrayList<>();

        for(String key : map.keySet()){

            result.add(map.get(key));

        }


        return result;
    }

}
