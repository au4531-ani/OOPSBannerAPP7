
public class OOPSBannerApp7 {

   
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

       
        
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter method for character
         * 
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter method for pattern
         * 
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get character pattern from array
     * 
     * @param ch character to search
     * @param patterns array of CharacterPatternMap
     * @return pattern of character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {

        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return new String[7]; // empty pattern if not found
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        // Pattern for O
        String[] oPattern = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        // Pattern for P
        String[] pPattern = {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };

        // Pattern for S
        String[] sPattern = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        // Create array of CharacterPatternMap objects
        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', oPattern),
                new CharacterPatternMap('P', pPattern),
                new CharacterPatternMap('S', sPattern)
        };

        String word = "OOPS";

        // Print banner
        for (int row = 0; row < 7; row++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, patterns);
                sb.append(pattern[row]).append("  ");
            }

            System.out.println(sb.toString());
        }
    }
}