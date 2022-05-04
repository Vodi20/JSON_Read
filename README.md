# JSON_Read
Program, welches eine JSON deserialisiert, um dann aus den eingelesenen Daten filtern zu können.
  Update: writetojson: gefilterte Ergebnisse können nun im Json-Format ausgegeben werden

### gson
  deserialisiert eine json-Datei genau so, wie man es in einer Klassenstruktur definiert hat.
  Class, welche sozusagen das erste json Array repräsentiert
  
    public class RepositoryInformation {
    public Repository[] repo;
    public int count;

    public RepositoryInformation(Repository[] repo, int count) {
        this.repo = repo;
        this.count = count;
    }
    }
    
  Class, welche die darunterliegenden json arrays repräsentieren(wenn man zugriff auf die daten braucht, muss man für jedes   property einen getter setzen):
    
    public class Repository {
    private String id;
    private String name;
    
    public Repository(String id, String name, String url, Project[] project, String defaultBranch, String remoteUrl, String     sshUrl, boolean isFork) {
        this.id = id;
        this.name = name;
    }
    
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
    
    
