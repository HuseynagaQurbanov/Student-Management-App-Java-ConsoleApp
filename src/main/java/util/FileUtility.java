package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileUtility {

    public static Object readFileDeserialize(String name){
          Object obj = null;
          try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(name))){
              obj = in.readObject();
          }finally {
              return obj;
          }
    }
    
    public static boolean writeObjectToFile(Object object, String name) {
        try(FileOutputStream fout = new FileOutputStream(name);
                ObjectOutputStream oos = new ObjectOutputStream(fout);){
            oos.writeObject(object);
            return true;
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
