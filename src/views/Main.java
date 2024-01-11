package views;

import controller.ShopManager;
import model.Garments;
import model.HouseholdGoods;
import model.Shop;


import java.util.List;
import java.util.Scanner;

public class Main {
//    public static List<Shop> list = ShopManager.list;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(ShopManager.getList());
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Thêm item

                    Shop shop = createNewItem();
                    ShopManager.addNewItem(shop);
                    System.out.println("Sản phẩm đã được thêm vào danh sách.");
                    break;

                case 2:
                    // Sửa item
                    int indexToEdit = getIndex();
                    editItemAtIndex(indexToEdit);
                    System.out.println("Sản phẩm đã được sửa.");
                    break;

                case 3:
                    // Xóa item
                    int indexToDelete = getIndex();
                    ShopManager.deleteByIndex(indexToDelete);
                    System.out.println("Sản phẩm đã được xóa.");
                    break;

                case 0:
                    // Thoát chương trình
                    System.out.println("Chương trình đã kết thúc.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 0);







    }

    private static void displayMenu() {
        System.out.println("----- MENU -----");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Sửa sản phẩm");
        System.out.println("3. Xóa sản phẩm");
        System.out.println("0. Thoát");
        System.out.print("Chọn: ");
    }

    //tao moi item trong shop
    public static Shop createNewItem() {
        //id, name, cost, year
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào id của sản phẩm");
        String id = scanner.nextLine();

        System.out.println("Mời bạn nhập vào tên của sản phẩm");
        String name = scanner.nextLine();

        System.out.println("Mời bạn nhập vào giá của sản phẩm");
        double cost = scanner.nextDouble();

        System.out.println("Mời bạn nhập vào năm nhập hàng của sản phẩm");
        int year = scanner.nextInt();

        System.out.println("Chọn 1 để nhập Garment");
        System.out.println("Chọn 2 để nhập HouseholdGoods");
        int type = scanner.nextInt();
        switch(type){
            case 1:
                //Style, color
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Mời bạn nhập style quần áo");
                String style = scanner1.nextLine();
                System.out.println("Mời bạn nhập color quần áo");
                String color = scanner1.nextLine();
                Garments g = new Garments(id, name, cost, year, style, color);
                return g;

            case 2:
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Mời bạn nhập manufacturer");
                String manufacturer = scanner2.nextLine();
                HouseholdGoods h = new HouseholdGoods(id, name, cost, year, manufacturer);
                return h;

            default:
                return null;
        }
    }

    private static int getIndex() {
        Scanner scanner = new Scanner(System.in);
        int index;

        do {
            System.out.print("Nhập index: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Vui lòng nhập một số nguyên: ");
                scanner.next();
            }
            index = scanner.nextInt();
        } while (index < 0 || index >= ShopManager.getList().size());

        return index;
    }

//    private static void editGarmentAtIndex(int index) {
//        List<Shop> shopList = ShopManager.getList();
//
//        if (index >= 0 && index < shopList.size()) {
//            Shop shopItem = shopList.get(index);
//
//            if (shopItem instanceof Garments) {
//                ShopManager.editGarment((Garments) shopItem);
//            } else {
//                ShopManager.editHouseholdGoods((HouseholdGoods) shopItem);
//            }
//        } else {
//            System.out.println("Index không hợp lệ.");
//        }
//    }

    private static void editItemAtIndex(int index) {
        List<Shop> shopList = ShopManager.getList();

        if (index >= 0 && index < shopList.size()) {
            Shop shopItem = shopList.get(index);

            if (shopItem instanceof Garments) {
                ShopManager.editGarment((Garments) shopItem);
            } else if (shopItem instanceof HouseholdGoods) {
                ShopManager.editHouseholdGoods((HouseholdGoods) shopItem);
            } else {
                System.out.println("Loại sản phẩm không hợp lệ.");
            }
        } else {
            System.out.println("Index không hợp lệ.");
        }
    }
}
