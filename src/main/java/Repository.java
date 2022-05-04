
public class Repository {
    private String id;
    private String name;
    private String url;
    public Project project;
    private String defaultBranch;
    private String remoteUrl;
    private String sshUrl;
    private boolean isFork;

    public Repository(String id, String name, String url, Project project, String defaultBranch, String remoteUrl, String sshUrl, boolean isFork) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.project = project;
        this.defaultBranch = defaultBranch;
        this.remoteUrl = remoteUrl;
        this.sshUrl = sshUrl;
        this.isFork = isFork;
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

    public Project getProject() {
        return project;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public String getRemoteUrl() {
        return remoteUrl;
    }

    public String getSshUrl() {
        return sshUrl;
    }

    public boolean isFork() {
        return isFork;
    }
}
