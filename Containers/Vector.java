package Containers;

public class Vector<T> {
    private int size;
    private T[] arr;
    public Vector(){
        size = 0;
        arr = (T[])new Object[size];
    }
    public Vector(int size, T def){
        if(size <= 0) throw new IllegalAccessError("Размер вектора должен быть больше нуля!");
        this.size = size;
        arr = (T[])new Object[this.size];
        for(int i = 0; i < arr.length; ++ i) arr[i] = def;
    }
    public boolean isEmpty(){ return size == 0; }
    public int size(){ return size; }
    public T getElement(int index){ 
        if(index < 0 || index >= arr.length) throw new ArrayIndexOutOfBoundsException("Такого индекса не существует!");
        return arr[index]; 
    }
    public void pushBack(T value){
        size = size + 1;
        T[] newArr = (T[]) new Object[size];
        System.arraycopy(arr, 0, newArr, 0, size - 1);
        arr = newArr;     
        arr[size - 1] = value;
    }
    public void setElement(int index, T value){
        if(index < 0 || index >= arr.length) throw new ArrayIndexOutOfBoundsException("Такого индекса не существует!");
        arr[index] = value;
    }
    public void resize(int newSize){
        this.size = newSize;
        T[] newArr = (T[]) new Object[size];
        System.arraycopy(arr, 0, newArr, 0, size - 1);
        arr = newArr;
    }
    public void popBack(){
        if(size == 0) throw new IllegalAccessError("Размер вектора должен быть больше нуля!");
        size = size - 1;
        T[] newArr = (T[]) new Object[size];
        System.arraycopy(arr, 0, newArr, 0, size);
        arr = newArr;
    }

}
