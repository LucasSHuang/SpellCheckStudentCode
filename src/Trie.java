public class Trie {
    private Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c < 'a' || c > 'z') {
                continue;
            }
            int index = c - 'a';
            if (current.getChild(index) == null) {
                current.setChild(index, new Node());
            }
            current = current.getChild(index);
        }
        current.setWord(true);
    }

    public boolean find(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (current.getChild(index) == null) {
                return false;
            }
            current = current.getChild(index);
        }
        return current.isWord();
    }
}
