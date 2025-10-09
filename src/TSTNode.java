public class TSTNode {

    private boolean isWord;
    private char letter;
    private TSTNode left;
    private TSTNode right;
    private TSTNode mid;

    public TSTNode(char c) {
        isWord = false;
        letter = c;
    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public TSTNode getLeft() {
        return left;
    }

    public void setLeft(TSTNode left) {
        this.left = left;
    }

    public TSTNode getRight() {
        return right;
    }

    public void setRight(TSTNode right) {
        this.right = right;
    }

    public TSTNode getMid() {
        return mid;
    }

    public void setMid(TSTNode mid) {
        this.mid = mid;
    }
}
