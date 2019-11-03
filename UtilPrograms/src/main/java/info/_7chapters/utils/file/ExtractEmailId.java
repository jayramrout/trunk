package info._7chapters.utils.file;

import java.io.File;
import java.util.Scanner;

/**
 * Created by jrout on 1/23/17.
 */
public class ExtractEmailId {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(new File("/Users/jrout/Desktop/EmailId.txt"));
        while (scan.hasNext()) {
            String email = scan.nextLine();
            if(email.contains("@gmail.com"))
                System.out.print(email+",");

        }
    }
}
