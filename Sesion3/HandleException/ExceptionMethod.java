package HandleException;
import java.io.*;

class ExceptionMethodSample {
  // declara el tipo de exception
  public static void findFile() throws IOException {

    // Genera IOException
    File newFile = new File("test.txt");
    try (FileInputStream stream = new FileInputStream(newFile)) {
        stream.read();
    }
  }

  public static void main(String[] args) {
    try {
      findFile();
    }
    catch (IOException e) {
      System.out.println(e);
    }
  }
}