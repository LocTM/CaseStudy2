package controller;

import model.Shop;
import storage.ReadWriteFile;

import java.util.List;

public class ShopManager {
    public static List<Shop> list = new ReadWriteFile().readFile();

    public static void addNewItem(Shop s){

        list.add(s);
        new ReadWriteFile().writeFile(list);
    }

    public static void deleteByIndex(int i) {
        if (i >= 0 && i < list.size()) {
            list.remove(i);
            new ReadWriteFile().writeFile(list);
        } else {
            System.out.println("Index out of bounds.");
        }
    }


    public void editItem(Shop s){

    }

    public void searhItem(Shop s){
        
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
