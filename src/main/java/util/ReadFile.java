package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadFile {

    public  static List<String> getnames(String filePath) {
        List <String> names = new ArrayList <> ();

        try {
            File f = new File (filePath);
            System.out.println("File is "+ f);
            Scanner sc = new Scanner (f);
            Pattern testRegEx= Pattern.compile("[^\\\"]\\w+[^\\\",]");
            while (sc.hasNextLine ()) {
                String line = sc.nextLine ();
                Matcher matcher=testRegEx.matcher(line);
                while(matcher.find()){
                    names.add(matcher.group());
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        }
        return names;
    }
}
