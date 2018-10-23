package bupt.astroleander.sodraggable.utils;

import android.databinding.InverseMethod;
import android.util.Log;

/**
 * <h1> ${className} </h1>
 * <p>Created by Astroleander on 2018/10/23<p>.
 * <p>
 * <p>
 *
 * @author Astroleander
 * @version 1.0.0
 * <p>Converters to support data-binding</p>
 */
public class Converters {

    @InverseMethod("convertToString")
    public static Integer convertToInt(String str){
        if(str.equals(""))
            return 0;
        return Integer.parseInt(str);
    }

    @InverseMethod("convertToInt")
    public static String convertToString(Integer i){
        if(i==null) {
            return "0";
        }
        return String.valueOf(i);
    }
}
