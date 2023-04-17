package com.example.week12;

import java.io.Serializable;

public class Item implements Serializable {

    private String itemName;
    private String note;

    private boolean important;

    public  Item(String itemName, String note, boolean important) {
        this.itemName = itemName;
        this.note = note;
        this.important = important;
    }

    public String getItemName() {
        return itemName;
    }

    public String getNote() {
        return note;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public void setNote(String note) {
        this.note = note;
    }

}