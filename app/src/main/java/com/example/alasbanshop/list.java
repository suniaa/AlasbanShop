package com.example.alasbanshop;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class list {
    private String game1 = "Mobile Legends";
    private String game2 = "DOTA";
    private String game3 = "League Of Legend";
    private String game4 = "PUBG Mobile";
    private String game5 = "";
    private ArrayList<String> list;

    public list() {
        list = new ArrayList<String>();
        list.add(game1);
        list.add(game2);
    }

    public List<String> getList() {
        return list;
    }
}
