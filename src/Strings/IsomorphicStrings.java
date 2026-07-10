package Strings;

import java.util.HashMap;

public class IsomorphicStrings {

    /**
     * Returns true if strings s and t are isomorphic.
     * Two strings are isomorphic if characters in s can be replaced to get t,
     * with a consistent one-to-one mapping in both directions.
     */
    public boolean isIsomorphic(String s, String t) {
        // If lengths differ, they cannot be isomorphic
        if (s.length() != t.length()) return false;

        // mapST: stores mapping from a char in s -> a char in t
        // mapTS: stores mapping from a char in t -> a char in s (reverse check to ensure one-to-one)
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        // Traverse both strings character by character
        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i); // current character from s
            char ct = t.charAt(i); // current character from t

            // Do we already have mappings involving these characters?
            boolean hasST = mapST.containsKey(cs); // is cs already mapped to some char?
            boolean hasTS = mapTS.containsKey(ct); // is ct already mapped from some char?

            if (!hasST && !hasTS) {
                // Case 1: Neither character has been seen before.
                // Create fresh mappings in both directions: cs -> ct and ct -> cs
                mapST.put(cs, ct);
                mapTS.put(ct, cs);
            } else {
                // Case 2: At least one mapping already exists.
                // We must verify that the existing mappings are consistent.

                // Check mapping from s -> t:
                // "mapped" is the character in t that cs is supposed to map to.
                Character mapped = mapST.get(cs);
                // If cs was seen before, it must map to the same ct now.
                // Also handle the case mapped == null (no mapping found) as inconsistent.
                if (mapped == null || mapped != ct) {
                    return false;
                }

                // Check mapping from t -> s (reverse):
                // "reverseMapped" is the character in s that ct is supposed to map from.
                Character reverseMapped = mapTS.get(ct);
                // If ct was seen before, it must map back to the same cs now.
                if (reverseMapped == null || reverseMapped != cs) {
                    return false;
                }
            }
        }

        // If all character pairs are consistent, the strings are isomorphic
        return true;
    }

    // Quick manual tests
    public static void main(String[] args) {
       IsomorphicStrings sol = new IsomorphicStrings();
        System.out.println(sol.isIsomorphic("egg", "add"));     // true
        System.out.println(sol.isIsomorphic("foo", "bar"));     // false
        System.out.println(sol.isIsomorphic("paper", "title")); // true
        System.out.println(sol.isIsomorphic("badc", "baba"));   // false
    }
}
