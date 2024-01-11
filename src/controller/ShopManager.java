package controller;

import model.Garments;
import model.HouseholdGoods;
import model.Shop;
import storage.ReadWriteFile;

import java.util.List;
import java.util.Scanner;

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


    public static void editGarment(Garments g){
        //String id, String name, double cost, int year, String style, String color
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id mới: ");
        String id = scanner.nextLine();
        g.setId(id);
        System.out.println("Nhập name mới: ");
        String name = scanner.nextLine();
        g.setName(name);
        System.out.println("Nhập cost mới: ");
        double cost = scanner.nextDouble();
        g.setCost(cost);
        System.out.println("Nhập năm mới: ");
        int year = scanner.nextInt();
        g.setYear(year);
        System.out.println("Nhập style mới: ");
        Scanner scanner1 = new Scanner(System.in);
        String style = scanner1.nextLine();
        g.setStyle(style);
        System.out.println("Nhập color mới: ");
        String color = scanner1.nextLine();
        g.setColor(color);

    }

    public static void editHouseholdGoods(HouseholdGoods h){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id mới: ");
        String id = scanner.nextLine();
        h.setId(id);
        System.out.println("Nhập name mới: ");
        String name = scanner.nextLine();
        h.setName(name);
        System.out.println("Nhập cost mới: ");
        double cost = scanner.nextDouble();
        h.setCost(cost);
        System.out.println("Nhập năm mới: ");
        int year = scanner.nextInt();
        h.setYear(year);
        System.out.println("Nhập manufacturer mới: ");
        String manufacturer = scanner.nextLine();
        h.setManufacturer(manufacturer);
    }

    public void searchItem(Shop s){
        
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
