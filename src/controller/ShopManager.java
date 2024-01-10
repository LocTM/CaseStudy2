package controller;

import model.Shop;

import java.util.ArrayList;
import java.util.List;

public class ShopManager {
    public static List<Shop> list = new ArrayList<>();

    public void addNewItem(Shop s){
        list.add(s);
    }

    public void deleteById(int index) {
        list.remove(index);
    }

    public ShopManager() {
    }

    public static List<Shop> getList() {
        return list;
    }

    public static void setList(List<Shop> list) {
        ShopManager.list = list;
    }
}
