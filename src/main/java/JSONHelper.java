import com.google.gson.Gson;

import java.io.*;
import java.util.List;

public class JSONHelper {
    public static RepositoryInformation gson(String url){
        Gson gson = new Gson();
        RepositoryInformation rep;
        try (Reader rd = new FileReader(url)){
            rep = gson.fromJson(rd,RepositoryInformation.class);
        }
        catch(IOException e){
            rep = null;
            System.out.println(e);
        }
        return rep;
    }
//    public static void writeToJson(List<Repository> repo){
//        Gson gson = new Gson();
//        String url = "C:\\Users\\Vodenik\\Desktop\\WMS Cardiff\\JSON_Read_newest\\src\\main\\java\\WriteJson.txt";
//        for (int i = 0; i<repo.size(); i++){
//            try {
//                gson.toJson(repo.get(i), new FileWriter("C:\\Users\\Vodenik\\Desktop\\WMS Cardiff\\JSON_Read_newest\\src\\main\\java\\WriteJson.txt"));
//            } catch (IOException e) {
//                System.out.println(e);
//            }
//        }
//    }
}
