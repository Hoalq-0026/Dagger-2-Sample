package com.techdb.dagger2sample.models;

/**
 * Created by le.quang.hoa on 10/24/16.
 */

public class Repository {

    String name;

    String fullName;

    String description;

    public Repository(String name, String fullName, String description) {
        this.name = name;
        this.fullName = fullName;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDescription() {
        return description;
    }
}
