package controller;

import model.Shop;
import storage.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;

public class ShopManager {
    public static List<Shop> list = new ReadWriteFile().readFile();

    public static void addNewItem(Shop s){

        list.add(s);
        new ReadWriteFile().writeFile(list);
    }

    public static void deleteById(int index) {
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
