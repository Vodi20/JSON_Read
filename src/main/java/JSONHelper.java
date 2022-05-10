import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.List;
import java.util.Scanner;

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

    public static void writeToJson(RepositoryInformation repo){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wollen Sie das Ergebnis in einer JSON-Datei ausgeben?");
        System.out.print("1 = ja / 0 = nein: ");
        int selection = sc.nextInt();
        if(selection == 1) {
            String url = "WriteJson.txt";
            try (Writer writer = new FileWriter(url)) {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                gson.toJson(repo, writer);
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
    public static Repository[] listToArray(List<Repository> list){
        Repository[] rep = new Repository[list.size()];

        for (int i = 0; i < list.size(); i++){
            rep[i] = list.get(i);
        }
        return rep;
    }
}
