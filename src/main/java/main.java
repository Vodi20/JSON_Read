public class Main {
    public static void main(String[] args){
        String url = "SampleJson.txt";
        RepositoryInformation rep = JSONHelper.gson(url);
        DisplayHelper.menu(rep);

//        int[] intarr = {3,4,1,2,7,6};
//
//        intarr = Sort.quickSort(intarr, 0 ,5);
//
//        for (int i = 0; i < intarr.length; i++){
//            System.out.println(intarr[i]);
//        }
    }
}
