package Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RadixSort {

    public static Map<Integer, List<String>> lists_map = new HashMap<>();

    /**
     * Sort a integer array with Radix algoritmh
     * @param number_list array of integers
     * @return sorted list with radix
     */
    public static List<Integer> sort(int[] number_list){
        //inicializar listas
        for(int i = 0; i < 10; i++){
            RadixSort.lists_map.put(i, new ArrayList<String>());
        }

        //se convierte la lista de int en string y se rellena con ceros
        List<String> converted_list = StringUtil.convertArray(number_list);
        List<String> padded_list = StringUtil.padWithZeros(converted_list);
        List<Integer> sorted_list = new ArrayList<>();
        System.out.println("reaches here");

        for(int j = StringUtil.getMaxLengthFromStringList(padded_list) - 1; j >= 0 ; j--){
            for (String s : padded_list){
                int index = s.charAt(j)-'0'; // '0' es 48 en ASCII y va en aumento ('1' = 49, ...)
                 lists_map.get(index).add(s);
            }
            padded_list = mergeAndClearStringLists(lists_map);
        }

        for(String s1 : padded_list){
            sorted_list.add(Integer.valueOf(s1));
        }

        return sorted_list;
    }

    /**
     * Merges lists in a map in
     * only one list, and then deletes them
     *
     * @param lists_map map of lists
     * @return merged list
     */
    private static List<String> mergeAndClearStringLists(Map<Integer, List<String>> lists_map){
        List<String> mergedList = new ArrayList<>();

        for(Map.Entry<Integer, List<String>> entry : lists_map.entrySet()){
            mergedList.addAll(entry.getValue());
            entry.getValue().clear();
        }
        return mergedList;
    }

}
