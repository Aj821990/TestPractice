import java.util.*;
import java.util.stream.Collectors;

public class Learning {

    public static void countInList()
    {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("d");

        System.out.println(list);
        Map<String,Long> map = list.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()));

        map.forEach((k,v)->System.out.println(k + ":" +v));

        Collections.sort(list);
        System.out.println("after sorting : " + list);
    }

    public static void hashMapWorking()
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

    public static void duplicateString()
    {
        String anyString = "my name is anto";
        anyString=anyString.replaceAll(" ","");

        Map<Character, Integer> baseMap = new HashMap<>();
        char[] charArray = anyString.toCharArray();

        for(Character ch : charArray)
        {
            if(baseMap.containsKey(ch))
            {
                baseMap.put(ch, baseMap.get(ch)+1);
            }
            else {
                baseMap.put(ch,1);
            }
        }

        Set<Character> key = baseMap.keySet();
        for(Character ch : key)
        {
            if(baseMap.get(ch)>0)
            {
                System.out.println(ch + " is " + baseMap.get(ch));
            }
        }
    }

    public static void reverseAndDuplicateString()
    {

        String str = "My name is anto123";
        String strProper = "";
        String reverse = "";

        String[] strList = str.split(" ");

        for(int i=0; i<strList.length; i++)
        {
            strList[i] = strList[i].toLowerCase();
            strList[i] = strList[i].substring(0,1).toUpperCase() + strList[i].substring(1).toLowerCase();
            strProper = strProper + " " + strList[i];
        }

        strProper = strProper.trim();
        for(int i = strProper.length()-1; i>=0; i--)
        {
            reverse = reverse + strProper.charAt(i);
        }
        System.out.println("reverse of " + strProper + " is : " + reverse);

        //String str = "My name is anto";
        Map<Character, Integer> map = new HashMap<>();
        char[] ch = str.toCharArray();

        for(Character c : ch)
        {
            if(map.containsKey(c))
            {
                map.put(c, map.get(c)+1);
            }
            else
            {
                map.put(c,1);
            }
        }

        System.out.println(map);

        Set<Character> key = map.keySet();
        for(Character character : key)
        {
            if(map.get(character)>0)
                System.out.println(character + " is " + map.get(character));
        }
    }

    public static void main(String[] args)
    {
        duplicateString();
    }
}
