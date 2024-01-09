package controller;

import model.Shop;

import java.util.ArrayList;
import java.util.List;

public class ShopManager {
    public static List<Shop> list = new ArrayList<>();

    public void addNew(Shop s){
        list.add(s);
    }

    public void deleteById(int index) {
        list.remove(index);
    }

    public ShopManager() {
    }


}
