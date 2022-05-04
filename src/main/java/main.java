import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        String url = "C:\\Users\\Vodenik\\Desktop\\WMS Cardiff\\JSON_Read_newest\\src\\main\\java\\SampleJson.txt";
        RepositoryInformation rep = JSONHelper.gson(url);
        DisplayHelper.menu(rep);
    }
}
