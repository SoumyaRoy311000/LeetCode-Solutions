class Solution {
    public String countAndSay(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        StringBuilder ans = new StringBuilder("1");
        for (int i = 2; i <= n; i++) {
            ans = getNextString(ans);
        }
        return ans.toString();
    }

    private StringBuilder getNextString(StringBuilder ans) {
        StringBuilder nextAns = new StringBuilder();
        int i = 0;
		
        while (i < ans.length()) {
            char c = ans.charAt(i++);
            int count = 1;
            while (i < ans.length() && c == ans.charAt(i)) {
                count++;
                i++;
            }
            nextAns.append(count).append(c);
        }
		
        return nextAns;
    }
}