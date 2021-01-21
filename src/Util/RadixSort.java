package Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RadixSort {

    public static Map<Integer, List<String>> list_map = new HashMap<>();

    public static List<Integer> sort(List<Integer> number_list){
        //inicializar listas
        for(int i = 0; i < 10; i++){
            list_map.put(i, new ArrayList<String>());
        }

        return new ArrayList<>();
    }

    private static void placeInArray(){

    }

    private static List<Integer> mergeArr(){
        return new ArrayList<>();
    }

}
