package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] one = new int[20];
        int[] two = new int[10];
        int[] three = new int[10];
        for (int i = 0; i < one.length; i++)
        {
            one[i] = Integer.parseInt(reader.readLine());
        }
        for (int j = 0; j < 10; j++)
        {
            two[j] = one[j];
        }
        for (int k = 0; k < 10; k++)
        {
            three[k] = one[10 + k];
        }
        for (int i = 0; i < three.length; i++)
        {
            System.out.println(three[i]);
        }
    }
}
