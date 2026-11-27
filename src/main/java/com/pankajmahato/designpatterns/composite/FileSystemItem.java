package com.pankajmahato.designpatterns.composite;

public interface FileSystemItem {

    String getName();

    int getSizeKb();

    void print(String indent);
}
