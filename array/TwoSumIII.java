package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumIII {
    public HashMap<Integer, Integer> map;
    public TwoSumIII() {
        map = new HashMap<>();
    }

    public void add(int num) {
        int count = map.containsKey(num) ? map.get(num) :0;
        map.put(num, count);
    }

    public boolean find(int num) {
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int findSum = num- key;

            if(key == findSum){
                return entry.getValue()>=2;
            }else if(map.containsKey(findSum)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TwoSumIII obj = new TwoSumIII();
        obj.add(1);
        obj.add(3);
        obj.add(5);
        System.out.println(obj.find(5));

    }
}
