package storage;

import model.Shop;

import java.io.*;
import java.util.List;

public class ReadWriteFile {
    //doc file
    public List<Shop> readFile(){
        File file = new File("Shop.txt");
        try {
            InputStream inputStream = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(inputStream);
            List<Shop> list = null;
            list = (List<Shop>) ois.readObject();
            return list;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
