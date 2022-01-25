package by.academy.dao.connection;

import java.util.ResourceBundle;

public class DBResourceManager {
    private final static DBResourceManager instance = new DBResourceManager();

    private final ResourceBundle bundle = ResourceBundle.getBundle("by.academy.resources.db");

    public static DBResourceManager getInstance() {
        return instance;
    }

    public String getValue(String key) {
        return bundle.getString(key);
    }
}
