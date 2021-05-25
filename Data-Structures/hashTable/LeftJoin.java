package com.example.hashtable;

import java.util.HashMap;
import java.util.Map;

public class LeftJoin {

    public String[][] leftJoin(HashMap<String,String> tableOne, HashMap<String,String> tableTwo){

        if(tableOne.isEmpty() ){
            return null;
        }else if(tableTwo.isEmpty() ){
            String[][] result = new String[tableOne.size()][3];
            int i =0;
            for(Map.Entry<String,String> data: tableOne.entrySet()) {
                result[i][0] = data.getKey();
                result[i][1] = data.getValue();
                result[i][2] = null;
                i++;
            }
            return result;
        }
        String[][] result = new String[tableOne.size()][3];
        int i =0;
        for(Map.Entry<String,String> data: tableOne.entrySet()){
            String tableOneKey = data.getKey();
            if(tableTwo.containsKey(tableOneKey)){
                result[i][0] = tableOneKey;
                result[i][1] = data.getValue();
                result[i][2] = tableTwo.get(tableOneKey);
            }else{
                result[i][0] = tableOneKey;
                result[i][1] = data.getValue();
                result[i][2] = null;
            }
            i++;
        }
        return result;
    }
}
