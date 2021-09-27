package tech.credify;

import java.util.ResourceBundle;

public class TestBundle {
    private static final ResourceBundle properties = ResourceBundle.getBundle("application");

    public static String getProperty(String key) {
        return properties.getString(key);
    }
}
