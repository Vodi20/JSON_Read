
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
}
