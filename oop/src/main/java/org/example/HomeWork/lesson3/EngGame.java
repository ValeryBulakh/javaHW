package org.example.HomeWork.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EngGame extends AbstractGame {
    @Override
    public List<String> generateCharList() {
        List<String> strList = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            strList.add(Character.toString(i));
        }
        return strList;
    }

    @Override
    public String getNameGame() {
        List<String> tmp = Arrays.asList(getClass().getName().split("\\."));
        return tmp.get(tmp.size() - 1);
    }
}