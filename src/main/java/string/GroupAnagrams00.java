package string;

import java.util.*;

public class GroupAnagrams00 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : strs) {
            String groupId = getGroupID(word);
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

    public static String getGroupID(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = groupAnagrams(strs);
    }
}
