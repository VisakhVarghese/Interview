package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringManipulation{

    public static Map<String, String> getParamsFromURL(String urlString){
        Map<String, String> params = new HashMap<>();
        try {
            String query = getQueryFromURL(urlString);

            if(query != null){
                params = getQueryParams(query);
            }else{
                System.out.println("No query parameters found in the URL");
            }
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        return params;
    }

    public static String getQueryFromURL(String urlString){
        String query = null;
        int queryStartIndex = urlString.indexOf("?");
        System.out.println(queryStartIndex);
        if(queryStartIndex != -1){
            query = urlString.substring(queryStartIndex+1);
            System.out.println(query);
        }

        return query;
    }
    public static Map<String, String> getQueryParams(String query){
        Map<String, String> params = new HashMap<>();
        String[] pairs = query.split("&");
        System.out.println(Arrays.toString(pairs));
        for(String pair : pairs){
            System.out.println(pair);
            int idx = pair.indexOf("=");
            String key = idx > 0 ? pair.substring(0, idx) : pair;
            String value = idx > 0 && pair.length() > idx + 1 ? pair.substring(idx + 1) : null ;
            params.put(key, value);
        }
        return params;
    }
    public static void main(String[] args) {
        String url = "https://example.com/?id=123&name=John";
        Map<String, String> params = getParamsFromURL(url);
        StringBuilder stringBuilder = new StringBuilder();
        if(params.isEmpty()){
            System.out.println("No parameters found in he URL");
        }else{
            String id = params.get("id");
            String name = params.get("name");
            if(id != null && name != null){
                System.out.println("ID :" + id + " NAME :"+ name);
                stringBuilder.append("name,").append(name).append(",id,").append(id);
                System.out.println(stringBuilder.toString());
            }

        }
    }
}