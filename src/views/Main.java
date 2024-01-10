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
        // Thêm
        System.out.println(ShopManager.list);
        Shop shop = createNewItem();
        ShopManager.addNewItem(shop);
        System.out.println(ShopManager.list);

        // Xóa cửa hàng tại vị trí đã nhập
        System.out.println(ShopManager.list);
        int indexToDelete = getIndex();
        ShopManager.deleteByIndex(indexToDelete);
        System.out.println(ShopManager.list);


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
            System.out.print("Nhập index cần xóa: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Vui lòng nhập một số nguyên: ");
                scanner.next();
            }
            index = scanner.nextInt();
        } while (index < 0 || index >= ShopManager.getList().size());

        return index;
    }
}
