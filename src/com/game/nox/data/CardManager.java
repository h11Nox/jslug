package com.game.nox.data;

import com.game.nox.fight.card.CardInterface;
import com.game.nox.fight.card.UnitCard;
import com.game.nox.fight.card.WarriorCard;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CardManager
{
    private static CardManager instance;
    private ArrayList<CardInterface> cards = new ArrayList<>();

    private CardManager()
    {

    }

    private void init()
    {
        JSONArray data = (new File(Paths.get("data/cards.json"))).getJson();
        for (int i = 0; i < data.size(); i++) {
            JSONObject row = (JSONObject)data.get(i);
            cards.add(createCard(row));
        }
    }

    private CardInterface createCard(JSONObject row)
    {
        CardInterface card;
        switch ((String)row.get("type")) {
            case "unit":
                card = new UnitCard((JSONObject)row.get("data"));
                break;
            case "warrior":
                card = new WarriorCard((JSONObject)row.get("data"));
                break;
            default:
                throw new IllegalArgumentException("Invalid type");
        }
        return card;
    }

    public static synchronized CardManager getInstance()
    {
        if (instance == null) {
            instance = new CardManager();
            instance.init();
        }
        return instance;
    }

    public CardInterface getCard()
    {
        return cards.get(0);
    }

    public List<CardInterface> getCards(int number)
    {
        return cards;
    }
}
