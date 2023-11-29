package lesson24.taskXOR;

import java.io.InputStream;
import java.io.OutputStream;

public interface Encrypter {
    void encrypt(InputStream input, OutputStream output);
}
