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

### BubbleSort
  geht immer wieder von vorne nach hinten im array, aufgrund einer rekursion, und tauscht dabei den jetzigen, mit dem nächsten eintrag aus, falls der jetzige größer     ist als der nächste
  
    public static int[] bubbleSort(int[] arr){
          int now;
          for (int i = 0; i < arr.length - 1; i++){
              try {
                  if (arr[i] < arr[i + 1]) {
                      continue;
                  }
                  now = arr[i];
                  arr[i] = arr[i + 1];
                  arr[i + 1] = now;
                  bubbleSort(arr);
              }catch(IndexOutOfBoundsException e){
                  System.out.println(e);
              }
          }
          return arr;
      }
  
### QuickSort
  teilt das array in 2 hälften, welche sich durch eine rekursion wieder selbst teilen, um so nur Teilbereiche anzuschauen und darin zu tauschen
    
     public static int[] quickSort(int[] arr, int left, int right){
        if (left >= right){
            return arr;
        }
        int pivotPos = partition(arr, left, right);
        quickSort(arr, left, pivotPos - 1);
        quickSort(arr, pivotPos + 1, right);
        return arr;
    }
    
    
  pivotElement: ist die mitte des arrays, bzw. teilarrays
    
    public static int partition(int[] arr, int left, int right){
        int pivot = arr[right];

        int i = left;
        int j = right -1;
        while(i<j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (j > left && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int now = arr[i];
                arr[i] = arr[j];
                arr[j] = now;
                i++;
                j--;
            }
        }
        if (i == j && arr[i] < pivot){
            i++;
        }
        if (arr[i] != pivot){
            int now = arr[i];
            arr[i] = arr[right];
            arr[right] = now;
        }
        return i;
    }
