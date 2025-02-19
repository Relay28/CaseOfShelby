
import java.io.BufferedReader;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.util.Scanner;
import java.io.*;

public class JsonParser {
    String[] lines;

    //read
    public static String getJSONFromFile(String filename) {
        String jsonText = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                jsonText += line + "\n";
            }

            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonText;
    }

    public String[] arrayLineReader(String linename){
        String strJson = getJSONFromFile("C:/Users/Rae Addison Duque/Documents/CaseOfShelbyVersions/CaseOfShelby_v2.0/ProjTemp/src/dialogue.json");
        try {

            JSONParser parser = new JSONParser();
            Object object = parser.parse(strJson);
            JSONObject mainJsonObject = (JSONObject) object;
            JSONArray jsonArray = (JSONArray) mainJsonObject.get(linename);
             lines = new String[jsonArray.size()];
            for (int i = 0; i < jsonArray.size(); i++){

               // System.out.println((i + 1));
                lines[i]= (String)(jsonArray.get(i));
            }

        }catch (Exception e){
            e.printStackTrace();

        }
        return lines;
    }


    public static void main(String[] args) {
        String strJson = getJSONFromFile("C:/Users/Rae Addison Duque/Documents/CaseOfShelbyVersions/CaseOfShelby_v2.0/ProjTemp/src/dialogue.json");


        System.out.println(strJson);

    }
}


