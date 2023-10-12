package test.java;
import java.util.ArrayList;

public class Fib {
    int first = 0;
    int second = 1;
    int next;

    public ArrayList<Integer> FibValuesArrayList = new ArrayList<>();

    public  Fib(int numbers){
        for(int i=0; i< numbers; i++){
            if(i < 2){
                FibValuesArrayList.add(i);
            }
            else{
                next = first + second;
                FibValuesArrayList.add(next);
                first = second;
                second = next;
            }
        }
    }

    public int[] GetFibArrayValues() {
        int[] fibValuesArray = new int[FibValuesArrayList.size()];
        for (int i = 0; i < FibValuesArrayList.size(); i++) {
            fibValuesArray[i] = FibValuesArrayList.get(i);
        }
        return fibValuesArray;
    }

}
