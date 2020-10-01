import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice_List {

    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("a");
        list.add("c");
        list.add("c");
        list.add("c");
        list.add("d");
        list.add("d");
        list.add("d");
        list.add("d");

        System.out.println(list);
        Map<String,Long> map = list.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()));

        map.forEach((k,v)->System.out.println(k + ":" +v));

        Collections.sort(list);
        System.out.println("after sorting : " + list);
    }
}
