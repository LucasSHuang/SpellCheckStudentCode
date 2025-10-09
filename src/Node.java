public class Node {
    private static int ASCII_VALUES = 256;
    private boolean isWord;
    private Node[] next;

    public Node() {
        next = new Node[ASCII_VALUES];
        isWord = false;
    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }

    public Node getChild(int index) {
        return next[index];
    }

    public void setChild(int index, Node child) {
        next[index] = child;
    }
}
