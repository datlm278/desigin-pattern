package com.example.singleton;

public class Database {
    private static volatile Database databaseObject = null;

    private Database() {
    }

    public static synchronized Database getInstance() {
        if (databaseObject == null) {
            synchronized (Database.class){
                if (databaseObject == null)
                    databaseObject = new Database();
            }
        }
        return databaseObject;
    }

    public void getConnection() {
        System.out.println("You are connected to database");
    }
}
