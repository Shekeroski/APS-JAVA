import java.util.Arrays;

public class Array<E> {
    private E data[];
    private int size;

    public Array(int capacity) {
        this.data = (E[]) new Object[capacity];
        this.size = 0;
    }

    public void insertLast(E o) {
        if ( size + 1 > data.length) {
            this.resize();
        }
        data[size++] = o;
    }

    public void insert(int position, E o) {
        if (position >= 0 && position <= size) {
            if (size + 1 > data.length) {
                this.resize();
            }
            for (int i = size; i > position; i--) {
                data[i] = data[i - 1];
            }
            data[position] = o;
            size++;
        } else {
            System.out.println("ne moze da se vnese na taa pozicija");
        }
    }

    public void set(int position, E o) {
        if (position >= 0 && position <= size) {
            data[position] = o;
        } else {
            System.out.println("ne moze da se vnese na taa pozicija");
        }
    }

    public E get(int position) {
        if (position >= 0 && position <= size) {
            return data[position];
        } else {
            System.out.println("ne moze da se vnese na taa pozicija");
        }
        return null;
    }

    public int find(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }

    public int GetSize() {
        return size;
    }

    public void delete(int position) {
        if (position >= 0 && position < size) {
            E[] newData = (E[]) new Object[size - 1];
            for(int i=0;i<position;i++){
                newData[i]=data[i];
            }
            for (int i = position+1; i < size; i++) {
                newData[i-1] = data[i];
            }
            data = newData;
            size--;
        }
    }

    public void resize() {
        E[] newData = (E[]) new Object[size * 2];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        this.data = newData;
    }

    @Override
    public String toString() {
            String s = "[";
            for (int i = 0; i < size; i++) {
                s += data[i];
                if (i < size - 1) {
                    s += ",";
                }
            }
            s += "]";
            return s;
    }

    public static void main(String[] args){
            Array<Integer> niza = new Array<Integer>(4);
            niza.insertLast(2);
            System.out.println("nizata po vmetnuvanje na 2 e: ");
            System.out.println(niza.toString());
            niza.insertLast(5);
            niza.insertLast(18);
            System.out.println("nizata po dodavanje na 5 i 18 e: ");
            System.out.println(niza.toString());
            niza.insert(1,15);
            System.out.println("nizata po dodavanje na vrednosta na indeks 1 15: ");
            System.out.println(niza.toString());
            niza.delete(1);
            System.out.println("nizata po brisenje na vrednosta na indeks 1 15: ");
            System.out.println(niza.toString());
    }
}

