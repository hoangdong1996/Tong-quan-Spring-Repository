package service;

import model.Dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryServiceImpl {
    private static Map<Integer, Dictionary> dictionaries = new HashMap<>();

    static {
        dictionaries.put(1, new Dictionary("xin chào", "hello"));
        dictionaries.put(2, new Dictionary("tạm biệt", "bye"));
        dictionaries.put(3, new Dictionary("quả táo", "apple"));
        dictionaries.put(4, new Dictionary("cảm ơn", "thank"));
        dictionaries.put(5, new Dictionary("tốt", "good"));
    }

    public List<Dictionary> findAll() {
        return new ArrayList<>(dictionaries.values());
    }
}
