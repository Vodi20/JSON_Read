
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class main {
    public static void main(String[] args){
        Gson gson = new Gson();
        try (Reader rd = new FileReader("/SampleJson.txt")){
            RepositoryInformation rep = gson.fromJson(rd,RepositoryInformation.class);
            System.out.println(rep.count);
            rep.repo[0].getId();
        }
        catch(IOException e){
            System.out.println(e);
        }

    }
}
