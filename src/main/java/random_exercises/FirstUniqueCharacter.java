package random_exercises;

import java.util.HashMap;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> countMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1; // If no unique character found
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "loveleetcode";

        System.out.println("First unique character index in '" + s1 + "': " + firstUniqChar(s1));
        System.out.println("First unique character index in '" + s2 + "': " + firstUniqChar(s2));
    }
}
