import java.lang.reflect.Type;
import java.util.*;
import java.util.function.BiFunction;

public class Search {

    public static RepositoryInformation filterId(String id, RepositoryInformation repinf){

        List<Repository> replist = new ArrayList<Repository>();
        int count = 0;
        for(int i  = 0 ; i< repinf.count ; i++) {
            if(repinf.value[i].getId().equals(id)) {
                replist.add(repinf.value[i]);
                count+=1;
            }
        }
        Repository[] arr = JSONHelper.listToArray(replist);
        RepositoryInformation repinfo = new RepositoryInformation(arr,count);
        return repinfo;
    }

    public static RepositoryInformation filterName(String name, RepositoryInformation repinf){

        List<Repository> replist = new ArrayList<Repository>();
        int count = 0;
        for(int i  = 0 ; i< repinf.count ; i++) {
            if(repinf.value[i].getName().equals(name)) {
                replist.add(repinf.value[i]);
                count+=1;
            }

        }
        Repository[] arr = JSONHelper.listToArray(replist);
        RepositoryInformation repinfo = new RepositoryInformation(arr,count);
        return repinfo;
    }

    public static RepositoryInformation filterFork(String state, RepositoryInformation repinf){

        boolean stat = Boolean.parseBoolean(state);
        List<Repository> replist = new ArrayList<Repository>();
        int count = 0;
        for(int i  = 0 ; i < repinf.count ; i++) {
            if(repinf.value[i].isFork() == stat) {

                replist.add(repinf.value[i]);
                count += 1;
            }
        }
        Repository[] arr = JSONHelper.listToArray(replist);
        RepositoryInformation repinfo = new RepositoryInformation(arr,count);
        return repinfo;
    }

    public static RepositoryInformation filterUrl(String url, RepositoryInformation repinf){

        List<Repository> replist = new ArrayList<Repository>();
        int count = 0;
        for(int i  = 0 ; i< repinf.count ; i++) {
            if(repinf.value[i].getUrl().equals(url)) {
                replist.add(repinf.value[i]);
                count+=1;
            }
        }
        Repository[] arr = JSONHelper.listToArray(replist);
        RepositoryInformation repinfo = new RepositoryInformation(arr,count);
        return repinfo;
    }

    public static RepositoryInformation filterDefaultBranch(String defaultBranch, RepositoryInformation repinf){

        List<Repository> replist = new ArrayList<Repository>();
        int count = 0;
        for(int i  = 0 ; i< repinf.count ; i++) {
            if(repinf.value[i].getDefaultBranch().equals(defaultBranch)) {
                replist.add(repinf.value[i]);
                count+=1;
            }
        }
        Repository[] arr = JSONHelper.listToArray(replist);
        RepositoryInformation repinfo = new RepositoryInformation(arr,count);
        return repinfo;
    }

    public static RepositoryInformation filterRemoteUrl(String remoteUrl, RepositoryInformation repinf){

        List<Repository> replist = new ArrayList<Repository>();
        int count = 0;
        for(int i  = 0 ; i< repinf.count ; i++) {
            if(repinf.value[i].getRemoteUrl().equals(remoteUrl)) {
                replist.add(repinf.value[i]);
                count+=1;
            }
        }
        Repository[] arr = JSONHelper.listToArray(replist);
        RepositoryInformation repinfo = new RepositoryInformation(arr,count);
        return repinfo;
    }

    public static RepositoryInformation filterSshUrl(String url, RepositoryInformation repinf){

        List<Repository> replist = new ArrayList<Repository>();
        int count = 0;
        for(int i  = 0 ; i< repinf.count ; i++) {
            if(repinf.value[i].getSshUrl().equals(url)) {
                replist.add(repinf.value[i]);
                count+=1;
            }
        }
        Repository[] arr = JSONHelper.listToArray(replist);
        RepositoryInformation repinfo = new RepositoryInformation(arr,count);
        return repinfo;
    }
    public static String search(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wonach möchten Sie suchen: ");
        String search = sc.next();
        return search;
    }

}
