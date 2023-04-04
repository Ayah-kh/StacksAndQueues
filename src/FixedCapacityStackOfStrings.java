public class FixedCapacityStackOfStrings {
    public String[] strings;
    private int N = 0;

    public FixedCapacityStackOfStrings(int capacity) {
        strings = new String[capacity];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(String item){
        strings[N++]=item;
    }

    public String pop(){
        return strings[--N];
    }
}
