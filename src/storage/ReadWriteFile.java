package storage;

import model.Shop;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    //doc file
    public List<Shop> readFile(){
        File file = new File("shop.txt");
        try {
            InputStream inputStream = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(inputStream);
            List<Shop> list = null;
            list = (List<Shop>) ois.readObject();
            return list;
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException e) {
            return new ArrayList<>();
        } catch (ClassNotFoundException e) {
            return new ArrayList<>();
        }

    }

    //ghi file
    public void writeFile(List<Shop> list){
            File file = new File("shop.txt");
            try {
                OutputStream os = new FileOutputStream(file);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(os);
                objectOutputStream.writeObject(list);
                os.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

}
