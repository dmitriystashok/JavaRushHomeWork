package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("Smit", "John");
        map.put("Westwood", "Roger");
        map.put("Donaldson", "Dave");
        map.put("Doe", "John");
        map.put("Velmar", "Voland");
        map.put("Smith", "Arthur");
        map.put("Smithh", "Olly");
        map.put("Westwoodd", "Richard");
        map.put("That", "Roger");
        map.put("Coopeland", "Li");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int i = 0;
        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            if(value.equals(name)){
                i++;
            }
        }
    return i;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int i = 0;
        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            if(key.equals(familiya)){
                i++;
            }
        }
        return i;

    }
}
