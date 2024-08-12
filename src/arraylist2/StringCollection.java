package arraylist2;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class StringCollection implements Collection<String> {
    private String[] elements;
    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    public StringCollection() {
        elements = new String[DEFAULT_CAPACITY];
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = Math.max(elements.length * 2, minCapacity);
            String[] newElements = new String[newCapacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }

    @Override
    public boolean add(String s) {
        ensureCapacity(size + 1);
        elements[size++] = s;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (o instanceof String) {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    int numMoved = size - i - 1;
                    if (numMoved > 0) {
                        System.arraycopy(elements, i + 1, elements, i, numMoved);
                    }
                    elements[--size] = null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (o instanceof String) {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int cursor = 0;

            @Override
            public boolean hasNext() {
                return cursor < size;
            }

            @Override
            public String next() {
                if (cursor >= size) {
                    throw new NoSuchElementException();
                }
                return elements[cursor++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        String[] result = new String[size];
        System.arraycopy(elements, 0, result, 0, size);
        return result;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            return (T[]) java.util.Arrays.copyOf(elements, size, a.getClass());
        }
        System.arraycopy(elements, 0, a, 0, size);
        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        ensureCapacity(size + c.size());
        boolean modified = false;
        for (String s : c) {
            add(s);
            modified = true;
        }
        return modified;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        for (Object o : c) {
            while (remove(o)) {
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean modified = false;
        for (int i = 0; i < size; i++) {
            if (!c.contains(elements[i])) {
                remove(elements[i]);
                i--; 
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
}