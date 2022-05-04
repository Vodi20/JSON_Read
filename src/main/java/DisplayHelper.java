import java.util.List;
import java.util.Scanner;

public class DisplayHelper {
    public static void displayObjects(List<Repository> repo){                   //displays objects from list
        for (int i = 0 ; i < repo.size() ; i++){
            System.out.println((i+1) + ". object: ");
            displayRepository(repo.get(i));
        }
    }

    public static void displayMenu(){                                           //displays the menu
        System.out.println("--------------------");
        System.out.println("Filter: ");
        System.out.println(" 1. Id");
        System.out.println(" 2. Name");
        System.out.println(" 3. Url");
        System.out.println(" 4. DefaultBranch");
        System.out.println(" 5. RemoteUrl");
        System.out.println(" 6. SshUrl");
        System.out.println(" 7. Fork");
        System.out.println("--------------------");
        System.out.println(" Auswahl: ");
    }

    public static void menu(RepositoryInformation rep){                         //the menu logic
        int condition = 0;
        while(condition != 8) {
            displayMenu();
            Scanner sc = new Scanner(System.in);
            condition = sc.nextInt();
            String search = "";

            if (condition != 8) {
                search = Search.search();
            }

            switch (condition) {
                case 1:
                    List<Repository> idlist = Search.filterId(search, rep);
                    displayObjects(idlist);
                    break;
                case 2:
                    List<Repository> namelist = Search.filterName(search, rep);
                    displayObjects(namelist);
                    break;
                case 3:
                    List<Repository> urllist = Search.filterUrl(search, rep);
                    displayObjects(urllist);
                    break;
                case 4:
                    List<Repository> defaultbranchlist = Search.filterDefaultBranch(search, rep);
                    displayObjects(defaultbranchlist);
                    break;
                case 5:
                    List<Repository> remoteurllist = Search.filterRemoteUrl(search, rep);
                    displayObjects(remoteurllist);
                    break;
                case 6:
                    List<Repository> sshurllist = Search.filterSshUrl(search, rep);
                    displayObjects(sshurllist);
                    break;
                case 7:
                    List<Repository> forklist = Search.filterFork(search, rep);
                    displayObjects(forklist);
                    break;
                case 8:
                    System.out.println("Das Program wird geschlossen!");
            }
        }
    }

    private static void displayProject(Project proj){
        System.out.println("  id: "+proj.getId());
        System.out.println("  name: "+proj.getName());
        System.out.println("  url: "+proj.getUrl());
        System.out.println("  state: "+proj.getState());
    }
    public static void displayRepository(Repository repo){

        System.out.println(" id: "+repo.getId());
        System.out.println(" name: "+repo.getName());
        System.out.println(" url: "+repo.getUrl());
        System.out.println(" project: ");
        displayProject(repo.project);
        System.out.println(" defaultbranch: "+repo.getDefaultBranch());
        System.out.println(" remoteurl: "+repo.getRemoteUrl());
        System.out.println(" sshurl: "+repo.getSshUrl());
        System.out.println(" isfork: "+repo.isFork());

    }

}
