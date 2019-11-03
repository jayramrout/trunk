package info._7chapters.utils.json;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by jrout on 10/6/2015.
 */

public class ConvertToJSON {
    static Map<String,Type> mainMap = new HashMap<String,Type>();

    public static void main(String[] args) {
        Type type = new Type("AccountName");
        type.addReference("Account");
        type.addAggregate("SelectionDateRange");
        type.addAttribute("ExpirationDate");
        mainMap.put("AccountName", type);

        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writeValue(new File("testMap.json"), mainMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Process completed...");
    }

    public void showUsedIn(String typeName) {
        Iterator<Map.Entry<String,Type>> iterator = mainMap.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String,Type> mapEntry = iterator.next();
            System.out.println(mapEntry.getValue());
        }
    }
}