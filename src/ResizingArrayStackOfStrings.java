public class ResizingArrayStackOfStrings {
    public String[] strings;
    private int N = 0;

    public ResizingArrayStackOfStrings() {
        strings = new String[1];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(String item) {
        if (N == strings.length)
            resize(2 * strings.length);
        strings[N++] = item;
    }

    public String pop() {
        return strings[--N];
    }

    private void resize(int capacity) {
        String[] copy = new String[capacity];
        for (int i = 0; i < N; i++)
            copy[i] = strings[i];
        strings = copy;
    }
}
