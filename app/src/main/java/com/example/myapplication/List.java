package com.example.myapplication;

import java.util.ArrayList;
import java.util.HashMap;

public class List {
    private String title;
    private int itemAmount;
    private ArrayList<HashMap<String, Integer>> listIngredients;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(int itemAmount) {
        this.itemAmount = itemAmount;
    }

    public ArrayList<HashMap<String, Integer>> getListIngredients() {
        return listIngredients;
    }

    public void setListIngredients(ArrayList<HashMap<String, Integer>> listIngredients) {
        this.listIngredients = listIngredients;
    }
}
