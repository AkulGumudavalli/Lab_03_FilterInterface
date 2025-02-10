import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.nio.file.StandardOpenOption.CREATE;

public class ShortLister {
    public static void main(String[] args){
        File workingDir = new File(System.getProperty("user.dir"));
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(workingDir);
        File selectedFile = null;
        ArrayList<String> words = new ArrayList<>();
        try{
            if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
                selectedFile = chooser.getSelectedFile();
                Path file = selectedFile.toPath();
                InputStream in = new BufferedInputStream(Files.newInputStream(file,CREATE));
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                while(reader.ready()){
                    Stream<String> line = reader.lines();
                    List<String> lines = line.toList();
                    words.addAll(lines);
                }
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        ShortWordFilter checker = new ShortWordFilter();
        for(String word:words){
            if(checker.accept(word))
                System.out.println(word);
        }
    }
}
