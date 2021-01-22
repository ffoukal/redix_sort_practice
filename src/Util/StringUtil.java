package Util;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {

    //convertir arr int a str
    public static List<String> convertArray(int[] int_list){
        List<String> converted_list = new ArrayList<>();

        for(Integer number : int_list){
            converted_list.add(Integer.toString(number));
        }

        return converted_list;
    }

    //Agregar ceros
    public static List<String> padWithZeros(List<String> str_list){

        List<String> padded_list = new ArrayList<>();
        int max_length_string = StringUtil.getMaxLengthFromStringList(str_list);
        String format = "%0" + max_length_string + "d";

        for(String str : str_list){
            String pad = String.format(format, Integer.parseInt(str));
            padded_list.add(pad);
        }

        return padded_list;
    }

    public static int getMaxLengthFromStringList(List<String> str_list){
        int max_length_string = 0;
        for(String str : str_list){
            if(str.length() > max_length_string){
                max_length_string = str.length();
            }
        }
        return max_length_string;
    }

}
