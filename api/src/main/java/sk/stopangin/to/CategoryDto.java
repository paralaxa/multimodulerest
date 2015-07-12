package sk.stopangin.to;

import java.io.Serializable;

/**
 *
 */
public class CategoryDto implements Serializable {
    private String name;
    private String testField3;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
