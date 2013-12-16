package LeetCode;

public class ScrambleString {
	//Given a string s1, we may represent it as a binary tree by partitioning it to two non-empty substrings recursively.
	//Below is one possible representation of s1 = "great":

	//    great
	//   /    \
	//  gr    eat
	// / \    /  \
	//g   r  e   at
	//           / \
	//          a   t
	//To scramble the string, we may choose any non-leaf node and swap its two children.

	//For example, if we choose the node "gr" and swap its two children, it produces a scrambled string "rgeat".

	//    rgeat
	//   /    \
	//  rg    eat
	// / \    /  \
	//r   g  e   at
	//           / \
	//          a   t
	//We say that "rgeat" is a scrambled string of "great".

	//Similarly, if we continue to swap the children of nodes "eat" and "at", it produces a scrambled string "rgtae".

	//    rgtae
	//   /    \
	//  rg    tae
	// / \    /  \
	//r   g  ta  e
	//       / \
	//      t   a
	//We say that "rgtae" is a scrambled string of "great".

	//Given two strings s1 and s2 of the same length, determine if s2 is a scrambled string of s1.
	public boolean isScramble(String C, String T) {
	    if (T.length() != C.length()) {
	        return false;
	    } else if (T.length() == 1) {
	        return T.charAt(0) == C.charAt(0);
	    } else {
	        for (int i = 1; i < T.length(); i++) {
	            String t1 = T.substring(0, i);
	            String t2 = T.substring(i);

	            String c1 = C.substring(0, t1.length());
	            String c2 = C.substring(t1.length());
	            if (isEqualSet(t1, c1)) {
	                if (isScramble(t1, c1) && isScramble(t2, c2) ) {
	                    return true;
	                }
	            }

	            c1 = C.substring(0, t2.length());
	            c2 = C.substring(t2.length());
	            if (isEqualSet(t1, c2)) {
	                if (isScramble(t1, c2) && isScramble(t2, c1)) {
	                    return true;
	                }
	            }
	        }
	        return false;
	    }
	}

	private boolean isEqualSet(String A, String B) {
	    int[] set = new int[256];
	    for (char c : A.toCharArray()) {
	        set[c]++;
	    }
	    for (char c : B.toCharArray()) {
	        if (set[c]-- == 0) {
	            return false;
	        }
	    }
	    return true;
	}
}
