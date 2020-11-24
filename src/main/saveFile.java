package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class saveFile {

    public void saveQTXT(String numberOfDescision, String question, String storyText, String image) throws IOException {
        Paths.get(".");
        String path = Story_Builder.storyLocation + "\\" + main.Story_Builder.textNumber + "Q.txt";
        File fileLedger = new File(path);
        FileWriter fw = new FileWriter(fileLedger);
        PrintWriter pw = new PrintWriter(fw);
        pw.print(numberOfDescision + "\n" + question + "\n" + storyText + "\n" + image);
        pw.close();
    }
    
    public void saveATXT1(String goTo, String decision, String death) throws IOException {
        Paths.get(".");
        String path = Story_Builder.storyLocation + "\\" + main.Story_Builder.textNumber + "A.txt";
        File fileLedger = new File(path);
        FileWriter fw = new FileWriter(fileLedger);
        PrintWriter pw = new PrintWriter(fw);
        pw.print(goTo + "\n" + decision + "\n" + death);
        pw.close();
    }

    public void saveATXT2(String goTo, String decision, String death) {
        Paths.get(".");
        String path = Story_Builder.storyLocation + "\\" + main.Story_Builder.textNumber + "A.txt";
        String text = "\n" + goTo + "\n" + decision + "\n" + death;
        try {
            Files.write(Paths.get(path), text.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
        }
    }
}
