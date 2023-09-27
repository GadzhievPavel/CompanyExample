package company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MyArray<T> {
    private T[] array;
    private int size;
    public MyArray(int size){
        this.array = (T[])new Object[size];
        this.size = size;
    }

    public void fillArray(HandlerArray<T> handlerArray){
        for (int i =0; i< size; i++){
            array[i]= handlerArray.randomObject();
        }
    }

    public T maxItem(Comparator<T> comparator){
        T max = this.array[0];
        for (int i=0; i< size; i++){
            if(comparator.compare(max,this.array[i])<0){
                max = this.array[i];
            }
        }
        return max;
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
