package DataSet;
import java.util.ArrayList;
public class SummarizeData {
    public ArrayList<ArrayList<String>> summarize(ArrayList<ArrayList<String>> arrayOfData , String [] column){
        ArrayList<ArrayList<String>> arrList =  new ArrayList<>();
        for (String s : column) {
            int index = arrayOfData.getFirst().indexOf(s);
            if (index == -1) throw new RuntimeException("Invalid Column Name");
            ArrayList<String> arr = new ArrayList<>();
            arr.add(s);
            arr.add(Double.toString(sum(arrayOfData, index)));
            arr.add(Double.toString(avg(arrayOfData, index)));
            arr.add(Double.toString(min(arrayOfData, index)));
            arr.add(Double.toString(max(arrayOfData, index)));

            arrList.add(arr);
        }
        return arrList;
    }

    private double sum(ArrayList<ArrayList<String>> arr ,int index ){
        double sum = 0 ;
        for(int i = 1 ; i < arr.size();i++){
            sum+= Double.parseDouble(arr.get(i).get(index));
        }
        return sum;
    }
    private double avg(ArrayList<ArrayList<String>> arr ,int index ){
        double sum = 0 ;
        double count =0;
        for(int i = 1 ; i < arr.size();i++){
            sum+= Double.parseDouble(arr.get(i).get(index));
            count++;
        }
        return sum/count;
    }
    private double min(ArrayList<ArrayList<String>> arr ,int index ){
        double min = 0 ;
        for(int i = 1 ; i < arr.size();i++){
            double val = Double.parseDouble(arr.get(i).get(index));
            if(val<min){
                min = val;
            }
        }
        return min;
    }
    private double max(ArrayList<ArrayList<String>> arr ,int index ){
        double max = 0 ;
        for(int i = 1 ; i < arr.size();i++){
            double val = Double.parseDouble(arr.get(i).get(index));
            if(val>max){
                max = val;
            }
        }
        return max;
    }






}
