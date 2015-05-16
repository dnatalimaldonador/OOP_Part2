
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException, IOException {
        //return null;
        ArrayList<String> result = new ArrayList<String>();
        
        FileReader FR = new FileReader(file);
        char []temp=new char [50];
        Arrays.fill(temp, '\0');
        char temp2 = '\0';
        String temp1 = "";
        FR.read(temp);
        
        for(int i=0; i<temp.length; i++){
            if(temp[i]!='\n' && temp[i] != '\0'){
                temp1 += temp[i];
            }
            else if(temp [i] == '\0'){
                break;
            }
            else{
                result.add(temp1);
                temp1 = "";
            }
        }
        
        //System.out.println(temp1);
        result.add(temp1);
        FR.close();
        return result;
    }

    public void save(String file, String text) throws IOException {
        FileWriter FW = new FileWriter(file);
        FW.write(text);
        FW.close();
    
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter FW = new FileWriter(file);
        FW.write("");
        for(String temp : texts){
            FW.append(temp);
            FW.append("\n");
        }
        FW.close();
    }
}
