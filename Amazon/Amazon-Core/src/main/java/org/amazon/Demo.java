package org.amazon;

public class Demo {
    public static void main(String[] args) {
       String data="Test";
       String  test = "Test";

        System.out.println("Added file");

       Connection connection = Connection.getInstance();
       connection.insertData();

    }
}
