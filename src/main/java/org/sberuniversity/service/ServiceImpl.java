package org.sberuniversity.service;

import java.util.HashMap;
import java.util.HashSet;

public class ServiceImpl implements Service{
    HashMap <String, Integer> hashMapCount = new HashMap<>();

    @Override
    public Double doHardWork(String work, Object param) {
        hashMapCount.merge(work, 1, Integer::sum);
        System.out.println(work + ": " + hashMapCount.get(work));
        return 0.0;
    }
}
