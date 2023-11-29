package lesson24.taskXOR;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Encrypt implements Encrypter{
    @Override
    public void encrypt(InputStream input, OutputStream output) {
        byte[] encrypted = new byte[512];
        try {
            byte[] key = {1, 2, 3, 4};
            int read = 0;
            while ((read = input.read(encrypted))!= -1) {
                for (int i = 0; i < read; ++i)
                    encrypted[i] = (byte) (encrypted[i] ^ key[i % key.length]);
                output.write(encrypted, 0, read);
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
