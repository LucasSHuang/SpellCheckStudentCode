public class TST {
    private TSTNode root;

    public TST() {
        root = new TSTNode('m');
    }

    public void insert (String word) {
        TSTNode current = root;
        int i = 0;
        while (i < word.length()) {
            char c = word.charAt(i);
            char middle = current.getLetter();
            if (c < middle) {
                if (current.getLeft() == null) {
                    current.setLeft(new TSTNode(c));
                }
                current = current.getLeft();
            }
            else if (c > middle) {
                if (current.getRight() == null) {
                    current.setRight(new TSTNode(c));
                }
                current = current.getRight();
            }
            else {
                i++;
                if (i == word.length()) {
                    current.setWord(true);
                    break;
                }
                if (current.getMid() == null) {
                    current.setMid(new TSTNode(word.charAt(i)));
                }
                current = current.getMid();
            }
        }
    }

    public boolean find(String word) {
        TSTNode current = root;
        int i = 0;
        while (current != null && i < word.length()) {
            char c = word.charAt(i);
            char middle = current.getLetter();
            if (c < middle) {
                current = current.getLeft();
            }
            else if (c > middle) {
                current = current.getRight();
            }
            else {
                i++;
                if (i == word.length()) {
                    return current.isWord();
                }
                current = current.getMid();
            }
        }
        return false;
    }
}
