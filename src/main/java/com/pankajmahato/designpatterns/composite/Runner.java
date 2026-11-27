package com.pankajmahato.designpatterns.composite;

public class Runner {
    public static void main(String[] args) {

        FileSystemItem readme = new FileItem("README.md", 12);
        FileSystemItem mainJava = new FileItem("Main.java", 40);
        FileSystemItem testJava = new FileItem("MainTest.java", 36);

        DirectoryItem src = new DirectoryItem("src");
        src.add(mainJava);
        src.add(testJava);

        DirectoryItem project = new DirectoryItem("design-patterns");
        project.add(readme);
        project.add(src);

        project.print("");
        System.out.println("Total size of src: " + src.getSizeKb() + " KB");
        System.out.println("Total size of README.md: " + readme.getSizeKb() + " KB");
    }
}
