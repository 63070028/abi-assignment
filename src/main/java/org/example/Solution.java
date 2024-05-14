package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static String palindromeCheck(String s){
        char[] ans = s.toCharArray();

        for(int i=0; i<ans.length/2; i++){
            char f = ans[i];
            char e = ans[ans.length-1-i];

            if(f != e && f != '?' && e != '?'){
                return "NO";
            }else if(f == '?' && e != '?'){
                ans[i] = e;
            }else if(f != '?' && e == '?'){
                ans[ans.length-1-i] = f;
            }else if(f == '?' && e == '?'){
                ans[i] = 'z';
                ans[ans.length-1-i] = 'z';
            }

        }

        return String.valueOf(ans);
    }

    public static int countMaxDuplicate(String[] words){
        Map<String, Integer> wordsMap = new HashMap<>();
        for(String word: words){
            if(!wordsMap.containsKey(word)){
                wordsMap.put(word, 1);
            }else{
                wordsMap.put(word, wordsMap.get(word)+1);
            }
        }

        return Collections.max(wordsMap.values());
    }

    public static int maxConsecutiveNumbers(int[] nums){
        Set<Integer> setD = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int d = Math.abs(nums[i]-nums[j]);
                setD.add(d);
            }
        }

        int ans = 1;

        if(setD.contains(0)){
            Map<Integer, Integer> map = new HashMap<>();
            for(int n: nums){
                map.put(n, map.getOrDefault(n, 0)+1);
            }
            ans = Math.max(Collections.max(map.values()), ans);
            setD.remove(0);
        }

        Set<Integer> temp = new HashSet<>();
        for(int n: nums)
            temp.add(n);

        for(int i = 0; i < nums.length; i++){
            for(int d:  setD){
                if(!temp.contains(nums[i]-d)){
                    int j = nums[i];
                    while (temp.contains(j))
                        j += d;
                    ans = Math.max(ans, (j - nums[i])/d);
                }
            }
        }





        return ans;
    }
}
