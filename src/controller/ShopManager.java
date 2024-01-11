package controller;

import model.Garments;
import model.HouseholdGoods;
import model.Shop;
import storage.ReadWriteFile;

import java.util.Collections;
import java.util.Comparator;
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
            System.out.println("Không có index này");
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

    public static void searchItemById(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID: ");
        String targetId = scanner.nextLine();
        boolean found = false;
        for (Shop shop : list) {
            if (shop.getId().equals(targetId)) {
                found = true;
                showItem(shop);
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sản phẩm với ID: " + targetId);
        }
    }

    private static void showItem(Shop shop) {
        System.out.println("----- Chi tiết sản phẩm -----");
        System.out.println("ID: " + shop.getId());
        System.out.println("Tên: " + shop.getName());
        System.out.println("Giá: " + shop.getCost());
        System.out.println("Năm nhập hàng: " + shop.getYear());

    }

    public void sortItemByName(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm để sắp xếp: ");
        String inputName = scanner.nextLine();

        Collections.sort(list, new Comparator<Shop>() {
            @Override
            public int compare(Shop shop1, Shop shop2) {
                return shop1.getName().compareTo(shop2.getName());
            }
        });

        System.out.println("Danh sách sau khi sắp xếp theo tên:");
        
    }



    public static int getTotalItemCount() {
        return list.size();
    }

    public static List<Shop> getList() {
        return list;
    }

    public static void setList(List<Shop> list) {
        ShopManager.list = list;
    }
}
