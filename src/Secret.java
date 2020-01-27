import java.io.*;

import static java.lang.Character.charCount;
import static java.lang.Character.isUpperCase;

public class Secret {



        public static void main(String[] args) throws IOException {

            FileReader inputStream = null;
            FileWriter outputStream = null;
            try{
                inputStream = new FileReader("secret.txt");
                outputStream = new FileWriter("secretOutput.txt");

                int c;
                while ((c = inputStream.read()) != -1)
                    if (Character.isUpperCase((char) c))
                        outputStream.write(c);
            }

            finally {
                if (inputStream != null)
                    inputStream.close();
                if (outputStream != null)
                    outputStream.close();
            }

        }

}


