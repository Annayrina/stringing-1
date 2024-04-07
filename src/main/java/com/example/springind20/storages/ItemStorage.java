package com.example.springind20.storages;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@SessionScope
public class ItemStorage {
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

