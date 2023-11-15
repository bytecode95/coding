package datastructure;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylistdemo {
    private int[] data;
    private static int default_size = 10;
    private int size = 0; //index

    public Arraylistdemo() {
        this.data = new int[default_size];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size] = num;
        size++;
    }

    private void resize() {
        int[] temp = new int[(int)(data.length*1.5)];
        //copy of all in element in data array to new temp array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove(){
        int removed = data[size];
        size--;
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
         data[index] = value;
    }

    @Override
    public String toString() {
        return "Arraylistdemo{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Arraylistdemo listdemo = new Arraylistdemo();
        listdemo.add(3);
        listdemo.add(5);
        listdemo.add(9);
        listdemo.add(12);
        System.out.println((listdemo));

        listdemo.remove();
        System.out.println((listdemo));

        for (int i = 0; i < 15; i++) {
            listdemo.add(2*i);
        }
        System.out.println((listdemo));
//        list.add(5);
//        list.add(15);
//        list.add(13);
//        list.add(1);
//        list.add(-5);
//        System.out.println(list);
//        list.remove(0);
//        System.out.println(list.get(2));
//        list.set(2,12);
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.isEmpty());
    }
}
