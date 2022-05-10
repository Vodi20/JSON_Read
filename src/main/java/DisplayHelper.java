import java.util.List;
import java.util.Scanner;

public class DisplayHelper {


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
                    RepositoryInformation repo = Search.filterId(search, rep);
                    RepositoryInformation.displayRepoInfo(repo);
                    JSONHelper.writeToJson(repo);
                    break;
                case 2:
                    RepositoryInformation repo2 = Search.filterName(search, rep);
                    RepositoryInformation.displayRepoInfo(repo2);
                    JSONHelper.writeToJson(repo2);
                    break;
                case 3:
                    RepositoryInformation repo3 = Search.filterUrl(search, rep);
                    RepositoryInformation.displayRepoInfo(repo3);
                    JSONHelper.writeToJson(repo3);
                    break;
                case 4:
                    RepositoryInformation repo4 = Search.filterDefaultBranch(search, rep);
                    RepositoryInformation.displayRepoInfo(repo4);
                    JSONHelper.writeToJson(repo4);
                    break;
                case 5:
                    RepositoryInformation repo5 = Search.filterRemoteUrl(search, rep);
                    RepositoryInformation.displayRepoInfo(repo5);
                    JSONHelper.writeToJson(repo5);
                    break;
                case 6:
                    RepositoryInformation repo6 = Search.filterSshUrl(search, rep);
                    RepositoryInformation.displayRepoInfo(repo6);
                    JSONHelper.writeToJson(repo6);
                    break;
                case 7:
                    RepositoryInformation repo7 = Search.filterFork(search, rep);
                    RepositoryInformation.displayRepoInfo(repo7);
                    JSONHelper.writeToJson(repo7);
                    break;
                case 8:
                    System.out.println("Das Program wird geschlossen!");
            }
        }
    }

}
