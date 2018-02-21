package Exc15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exc15
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(31);
        list.add(56);
        list.add(15);
        list.add(15);
        list.add(56);
        list.add(15);
        list.add(99);

        System.out.println(maxOccurences(list));


    }
    private static int maxOccurences(List<Integer> list)
    {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> listFinal = new ArrayList<>();
        int maxOccurences = 0;
        if (list.isEmpty())
        {
            return maxOccurences;
        }
        for (Integer i:list)
        {
            if (map.containsKey(i))
            {
                map.put(i, map.get(i)+1);
            }
            else
            {
                map.put(i, 1);
            }
        }
        listFinal.addAll(map.values());
        for (Integer i:listFinal)
        {
            if (i > maxOccurences)
            {
                maxOccurences = i;
            }
        }
        return maxOccurences;
    }
}
