package designpatterns.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by zhangyue-k on 2018/1/9.
 */
public class LowerCaseInputStream extends FilterInputStream{

    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException{
        int c = super.read();
        return (c == -1)? c : Character.toLowerCase(c);
    }

    @Override
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for(int i = offset; i < result + offset; i++) {
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;

    }
}
