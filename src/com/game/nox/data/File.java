package com.game.nox.data;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.nio.file.Path;

public class File
{
    private Path path;

    public File(Path p)
    {
        path = p;
    }

    public JSONArray getJson()
    {
        try {
            FileReader reader = new FileReader(path.toFile());
            int c;
            String text = "";
            while((c=reader.read())!=-1)
            {
                text += (char)c;
            }
            JSONParser parser = new JSONParser();
            return (JSONArray)parser.parse(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new JSONArray();
    }
}
