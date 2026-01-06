class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int endIndex = s.length() - 1;
      
        while (endIndex >= 0 && s.charAt(endIndex) == ' ') {
            endIndex--;
        }
      
        int startIndex = endIndex;
      
        while (startIndex >= 0 && s.charAt(startIndex) != ' ') {
            startIndex--;
        }
      
        return endIndex - startIndex;
    }
}