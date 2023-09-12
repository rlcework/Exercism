class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();

        // flag to detect new word in kebab-case
        boolean newWord = false;
        for (int i = 0; i < identifier.length(); i++) {
            char ch = identifier.charAt(i);
            if (ch == '-') {
                newWord = true;
                continue;
            }
            // omit greek letters
            if ('α' <= ch && ch <= 'ω' ) continue;
            if (Character.isISOControl(ch)) {
                sb.append("CTRL");
                continue;
            }
            if (Character.isLetter(ch)) {
                if (newWord) {
                    // initiate new word in camelCase
                    sb.append(Character.toUpperCase(ch));
                    newWord = false;
                } else {
                    sb.append(ch);
                }
            }
            else if (Character.isWhitespace(ch)) {
                sb.append("_");
            }
        }
        return sb.toString();
    }
}