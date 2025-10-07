public class Node {
    private boolean isWord;
    private Node[] next;

    public Node() {
        next = new Node[256];
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
