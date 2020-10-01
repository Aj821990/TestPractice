import java.util.*;

public class Practice_Maps {

    public static void main(String[] args)
    {
        Map<String,String> map1 = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();

        map1.put("One","1");
        map1.put("Two","2");
        map1.put("Three","3");
        map1.put("Four","4");

        map2.put("One","8");
        map2.put("Five","5");
        map2.put("Six","6");

        //if duplicate values to be replaced
        //map1.putAll(map2);

        map2.forEach((key,value) -> map1.merge(key, value, (v1,v2) -> v1.equalsIgnoreCase(v2) ? v1 : v1 + " & " +v2));

        System.out.println("map1 after merging is : " + map1);

        List<String> sortByKey = new ArrayList<>(map1.keySet());
        Collections.sort(sortByKey);
        System.out.println("after sorting by key : " + sortByKey);

        List<String> sortByValue = new ArrayList<>(map1.values());
        for(int i=0; i<sortByValue.size(); i++)
        {
            String values = sortByValue.get(i);
            if(values.length()>1)
            {
                String valueToBeEdited = values;
                valueToBeEdited = valueToBeEdited.replace(" & ", " ");
                String[] splitValues = valueToBeEdited.split(" ");
                for(int j=0; j<splitValues.length; j++)
                {
                    sortByValue.add(splitValues[j]);
                    sortByValue.remove(values);
                }
            }
        }
        Collections.sort(sortByValue);
        System.out.println("after sorting by values : " + sortByValue);
    }
}
