package by.it.kushel.jd01_06;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Diomn on 10.05.2016.
 */
public class TaskA2 {
    public static void main(String[] arg){
        Pattern pat;
        Matcher mat;
        boolean found;
        String str = new String(Data.lukomor);
        pat = Pattern.compile("(^|[^А-яа-яЁё])([А-Яа-яЁё]++)");
        mat=pat.matcher(str);
        Map<String, Integer> hm = new HashMap<String, Integer>();
        Integer count=1;
        while(mat.find()) {
            String word = mat.group(2);


            if(hm.containsKey(word)){
               count=hm.get(word)+1;
                hm.put(word,count);
            }else
            hm.put(word,count);
        }
    }
}
