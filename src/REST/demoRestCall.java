package REST;

import netscape.javascript.JSObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class demoRestCall {
    public static void main(String[] args) throws IOException {
        String url = "https://dummyjson.com/products";

        retriveData(url);
    }

    private static void retriveData(String url) {

        try{
            // The URL of the REST API you want to call
            URL obj = new URL(url);

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

            // Set the request method to GET
            connection.setRequestMethod("GET");

            // Set request headers if needed
//            con.setRequestProperty("User-Agent", "Mozilla/5.0");

            // Get the response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code : " + responseCode);

            if(responseCode == HttpURLConnection.HTTP_OK){
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                String inputLine;

                StringBuffer response = new StringBuffer();

                while((inputLine = bufferedReader.readLine()) != null){
                    response.append(inputLine);
                }

                System.out.println("Response : " + response);
            }else{
                System.out.println("GET request is not worked");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
