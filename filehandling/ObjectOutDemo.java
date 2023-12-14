package filehandling;

import java.io.*;

class StudentData implements Serializable {

    private String name;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class ObjectOutDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("object.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        StudentData studentData = new StudentData();
        studentData.setName("abc");
        studentData.setAddress("delhi");
        objectOutputStream.writeObject(studentData);

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        StudentData studentDataFromFile = (StudentData) objectInputStream.readObject();
        System.out.println(studentDataFromFile.getName());
        System.out.println(studentDataFromFile.getAddress());
    }
}