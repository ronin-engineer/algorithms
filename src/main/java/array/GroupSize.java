package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupSize {
    // https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> groupMap = new HashMap<>();
        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < groupSizes.length; i++) {
            int groupSize = groupSizes[i];
            List<Integer> group = groupMap.get(groupSize);
            if (group == null) {
                group = new ArrayList<>();
                groupMap.put(groupSize, group);
            }

            group.add(i);

            if (group.size() == groupSize) {
                answer.add(group);
                groupMap.remove(groupSize);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] groupSizes = {3,3,3,3,3,1,3};
        List<List<Integer>> groups = groupThePeople(groupSizes);
        System.out.println(groups);
    }
}
