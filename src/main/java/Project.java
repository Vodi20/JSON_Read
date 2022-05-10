
public class Project {
    private String id;
    private String name;
    private String url;
    private String state;
    private int revision;

    public Project(String id, String name, String url, String state, int revision) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.state = state;
        this.revision = revision;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getState() {
        return state;
    }

    public int getRevision() {
        return revision;
    }

    public static void displayProject(Project proj){
        System.out.println("  id: "+proj.getId());
        System.out.println("  name: "+proj.getName());
        System.out.println("  url: "+proj.getUrl());
        System.out.println("  state: "+proj.getState());
    }
}
