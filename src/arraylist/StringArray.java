package arraylist;

public class StringArray {
    private String[] array;
    private int size;

    public StringArray() {
        array = new String[1];
    }

    public void add(String element) {
        if (size == array.length) {
            increaseArray();
        }
        array[size] = element;
        size++;
    }

    private void increaseArray() {
        String[] newArray = new String[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public String get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return array[index];
    }

    public int size() {
        return size;
    }
}

