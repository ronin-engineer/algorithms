package string;

import java.util.*;

public class GroupAnagrams01 {

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<Integer, List<String>> anagramMap = new HashMap<>();

        for (String word : strs) {
            int groupId = getGroupID(word);   // unique for each anagram
            List<String> group = anagramMap.get(groupId);

            if (group == null) {
                group = new ArrayList();
                anagramMap.put(groupId, group);
            }

            group.add(word);
        }

        result.addAll(anagramMap.values());
        return result;
    }

    public static int getGroupID(String s) {
        int[] counter = new int[26];
        for (char ch : s.toCharArray()) {
            counter[ch - 'a']++;
        }

        return Arrays.hashCode(counter);    // convert counter array into id using hash
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = groupAnagrams(strs);
    }
}
