import java.util.List;

public class RepositoryInformation {
    public Repository[] value;
    public int count;

    public RepositoryInformation(Repository[] value, int count) {
        this.value = value;
        this.count = count;
    }
    public int GetCount(){
        return count;
    }
    public static void displayRepoInfo(RepositoryInformation repo){                   //displays every entry in repository array + count of repository array
        for (int i = 0 ; i < repo.value.length ; i++){
            System.out.println((i+1) + ". object: ");
            Repository.displayRepository(repo.value[i]);
        }
        System.out.println(" Anzahl: " + repo.count);
    }
}
