
public class RepositoryInformation {
    public Repository[] repo;
    public int count;

    public RepositoryInformation(Repository[] repo, int count) {
        this.repo = repo;
        this.count = count;
    }
    public int GetCount(){
        return count;
    }
}
