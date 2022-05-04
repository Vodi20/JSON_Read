import java.lang.reflect.Type;
import java.util.*;
import java.util.function.BiFunction;

public class Search {

    public static List<Repository> filterId(String id, RepositoryInformation repinf){
        ArrayList<Repository> arr = new ArrayList<Repository>();
        for(int i  = 0 ; i< repinf.count ; i++) {
            if(repinf.value[i].getId().equals(id)) {
                arr.add(repinf.value[i]);
            }
        }
        return arr;
    }

    public static List<Repository> filterName(String name, RepositoryInformation repinf){
        ArrayList<Repository> arr = new ArrayList<Repository>();
        for(int i  = 0 ; i< repinf.count ; i++) {
            if(repinf.value[i].getName().equals(name)) {
                arr.add(repinf.value[i]);
            }
        }
        return arr;
    }

    public static List<Repository> filterFork(String state, RepositoryInformation repinf){
        boolean stat = Boolean.parseBoolean(state);
        ArrayList<Repository> arr = new ArrayList<Repository>();
        for(int i  = 0 ; i < repinf.count ; i++) {
            if(repinf.value[i].isFork() == stat) {
                arr.add(repinf.value[i]);
            }
        }
        return arr;
    }

    public static List<Repository> filterUrl(String url, RepositoryInformation repinf){

        List<Repository> arr = new ArrayList<Repository>();
        for(int i  = 0 ; i< repinf.count ; i++) {
            if(repinf.value[i].getUrl().equals(url)) {
                arr.add(repinf.value[i]);
            }
        }
        return arr;
    }

    public static List<Repository> filterDefaultBranch(String defaultBranch, RepositoryInformation repinf){

        List<Repository> arr = new ArrayList<Repository>();
        for(int i  = 0 ; i< repinf.count ; i++) {
            if(repinf.value[i].getDefaultBranch().equals(defaultBranch)) {
                arr.add(repinf.value[i]);
            }
        }
        return arr;
    }

    public static List<Repository> filterRemoteUrl(String remoteUrl, RepositoryInformation repinf){

        List<Repository> arr = new ArrayList<Repository>();
        for(int i  = 0 ; i< repinf.count ; i++) {
            if(repinf.value[i].getRemoteUrl().equals(remoteUrl)) {
                arr.add(repinf.value[i]);
            }
        }
        return arr;
    }

    public static List<Repository> filterSshUrl(String url, RepositoryInformation repinf){

        List<Repository> arr = new ArrayList<Repository>();
        for(int i  = 0 ; i< repinf.count ; i++) {
            if(repinf.value[i].getSshUrl().equals(url)) {
                arr.add(repinf.value[i]);
            }
        }
        return arr;
    }
    public static String search(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wonach möchten Sie suchen: ");
        String search = sc.next();
        return search;
    }

}
