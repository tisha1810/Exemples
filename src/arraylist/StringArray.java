package arraylist;

public class StringArray {
    private String[] array;
    private int size;

    public StringArray() {
        array = new String[2];
        size = 0;
    }

    public void add(String value) {
        if (size == array.length) {
            increaseArray();
        }
        array[size] = value;
        size++;
    }

    private void increaseArray() {
        String[] newArray = new String[array.length * 2];
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

