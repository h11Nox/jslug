package com.game.nox;

import java.util.HashMap;
import java.util.Map;

public class Config
{
    private Map<String, String> data = new HashMap<String, String>();
    private static Config instance;

    private Config()
    {
        data.put("dataPath", "./data");
    }

    public static synchronized Config getInstance()
    {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public String get(String key)
    {
        return data.get(key);
    }
}
