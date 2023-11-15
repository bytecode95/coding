package datastructure;

import java.util.ArrayList;

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
    }

    private boolean isFull() {
        return size == data.length;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();



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
