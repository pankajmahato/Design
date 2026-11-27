package com.pankajmahato.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class DirectoryItem implements FileSystemItem {

    private final String name;
    private final List<FileSystemItem> children;

    public DirectoryItem(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void add(FileSystemItem child) {
        children.add(child);
    }

    public void remove(FileSystemItem child) {
        children.remove(child);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSizeKb() {
        int totalKb = 0;
        for (FileSystemItem child : children) {
            totalKb += child.getSizeKb();
        }

        return totalKb;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + " - " + name + "/ (" + getSizeKb() + " KB)");
        for (FileSystemItem child : children) {
            child.print(indent + " ");
        }
    }
}
