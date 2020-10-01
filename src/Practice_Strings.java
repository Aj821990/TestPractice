import java.util.HashMap;
import java.util.Map;

public class Practice_Strings {

    public static void main(String[] args) {
        String str = "my name is anto123";
        String reverse = "";

        for(int i=str.length()-1; i>=0; i--)
        {
            reverse= reverse + str.charAt(i);
        }

        System.out.println("reverse is : " + reverse);
        Map<Character,Integer> map1 = new HashMap<>();
        str = str.replace(" ","");
        char[] charArray = str.toCharArray();

        for(Character ch : charArray)
        {
            if(map1.containsKey(ch))
            {
                map1.put(ch, map1.get(ch)+1);
            }
            else
            {
                map1.put(ch,1);
            }
        }

        System.out.println(map1);
    }
}
