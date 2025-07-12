
class Solution {
    public boolean isValid(String a) {
        Stack<Character> str = new Stack<>();
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				str.push(ch);
			} else {
				if (str.isEmpty()) {
					return false;
				}
				char top = str.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
			}
		}

		return str.isEmpty();
    }
}
