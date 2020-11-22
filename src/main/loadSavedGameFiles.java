package main;

import java.io.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

//This class load the save Folder from a folder.
public class loadSavedGameFiles {

    File Folder = new File(Story_Builder.storyLocation);
    File[] folderArray = Folder.listFiles();

    //Check it savedGame folder exist if not it creats it
    public void load() {
        if (!Folder.exists()) {
            Folder.mkdir();
        }
    }
}
