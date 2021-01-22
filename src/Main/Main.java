package Main;

import Util.RadixSort;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] number_list = {1, 23, 231, 12432, 3425, 12, 43, 23, 54, 123, 4324, 543};

        List<Integer> sorted_list = RadixSort.sort(number_list);

        for(Integer i : sorted_list){
            System.out.println(i);
        }
    }
}
