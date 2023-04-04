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
        String item=strings[--N];
        strings[N]=null;
        if (N>0&&N== strings.length/4)
            resize(strings.length/2);
        return item;

    }

    private void resize(int capacity) {
        String[] copy = new String[capacity];
        for (int i = 0; i < N; i++)
            copy[i] = strings[i];
        strings = copy;
    }
}
