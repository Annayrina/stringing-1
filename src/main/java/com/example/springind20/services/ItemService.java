package com.example.springind20.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Service
@SessionScope
public class ItemService {
    private final Map<Long, Integer> countByItem = new HashMap<>();
    public void add(List<Long> ids) {
        for (Long id : ids) {
            if (countByItem.containsKey(id)) {
                countByItem.put(id, countByItem.get(id) + 1);
            } else {
                countByItem.put(id,1);
            }
        }
    }
    public Map<Long, Integer> getAll() {
        return countByItem;
    }
}
