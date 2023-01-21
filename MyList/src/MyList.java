public class MyList<T> {
    private T[] list;
    private T[] array;
    private int arraySize;
    private int capacity;


    public MyList() {
        this.capacity = 10;
        this.list = (T[]) new Object[this.capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.list = (T[]) new Object[this.capacity];
    }

    public int size() {
        return this.arraySize;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void add(T data) {
        if (this.arraySize == capacity) {
            this.capacity *= 2;
            setCapacity(capacity);
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = data;
                break;
            }
        }
        arraySize++;
    }

    public T get(int data) {
        return list[data];
    }

    public void remove(int index) {


        for (int i = index, j = index + 1; i < list.length - 1; i++, j++) {
            list[i] = list[j];

        }
        this.arraySize--;
    }

    public void set(int index, T data) {
        list[index] = data;
    }

    public String toString() {
        System.out.print("[");
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                System.out.print(list[i] + ",");
            }
        }
        System.out.println("]");
        return "";
    }

    public int indexOf(T data) {
        int index = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == data) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int lastIndexOf(T data) {
        int index = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == data) {
                index = i;
            }
        }
        return index;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public T[] toArray() {
        this.array=(T[]) new Object[arraySize];
        for (int i = 0; i < arraySize; i++) {
            this.array[i] = list[i];
        }
        return array;
    }

    public void clear() {
        for (int i = 0; i < list.length; i++) {
            list[i] = null;
        }
        this.capacity=10;
    }

    public MyList<T> subList(int start, int finish) {
        MyList<T> sub = new MyList<>();
        for (int i = start; i <= finish; i++) {
            sub.add(list[i]);
        }
        return sub;
    }

    public boolean contains(T data) {

        for (int i = 0; i < list.length; i++) {
            if (list[i] == data) {
                return true;
            }
        }
        return false;
    }
}
