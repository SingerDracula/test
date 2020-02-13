package us.muzhi.mini.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Integer[] myArgs = {9};
        List letters = getLetters(myArgs);
        System.out.println(letters);
    }

    public static List getLetters(Integer[] digits) {
        if (digits == null || digits.length == 0){
            return new ArrayList();
        }
        String[] DigitsAndLetterMap = {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> resultTemp = new ArrayList<>();
        List<Integer> index = Arrays.asList(digits);
        for (int i = 0; i < index.size(); i++) {
            String s = DigitsAndLetterMap[index.get(i)];
            for (int j = 0; j < resultTemp.size(); j++) {
                String s1 = resultTemp.get(j);
                for (int k = 0; k < s1.length(); k++) {
                    for (int l = 0; l < s.length(); l++) {
                        result.add(s1.charAt(k)+""+s.charAt(l));
                    }
                }
            }
            resultTemp.add(s);
        }
        if (result.size() == 0){
            return resultTemp;
        }else {
            return result;
        }

    }
}
