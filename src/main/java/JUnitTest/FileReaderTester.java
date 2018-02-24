package JUnitTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.*;

/**
 * Created by zhangyue-k on 2018/2/23.
 */
public class FileReaderTester extends TestCase {

    public FileReaderTester(String name) {
        super(name);
    }
    FileReader _input = null;
    FileReader _empty = null;

    @Override
    protected void setUp() throws Exception {
        try{
            _input = new FileReader(
                    "D:\\project-git\\" +
                    "headfirstdesignpatternsdemo\\" +
                    "src\\main\\resources\\data.txt");
            _empty = newEmptyFile();
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e.toString());
        }
    }

    private FileReader newEmptyFile() throws IOException {
        File empty = new File("D:\\project-git\\"  +
                                "headfirstdesignpatternsdemo\\src\\main"  +
                               "\\resources\\empty.txt");
        FileOutputStream out = new FileOutputStream(empty);
        out.close();
        return new FileReader(empty);
    }

    @Override
    public void tearDown() throws Exception {
        try{
            _input.close();
        }catch (IOException e) {
            throw new RuntimeException("error on closing test file");
        }
    }

    public void testRead() throws IOException {
        char ch = '&';
        for(int i = 0; i < 4; i++) {
            ch = (char)_input.read();
        }
        assertEquals('d', ch);
    }

    public void testReadAtEnd() throws Exception {
        int ch = -1234;
        for( int i = 0; i < 201; i++) {
            ch = _input.read();
        }
        assertEquals(-1, _input.read());
    }

    public void testReadBoundaries() throws Exception {
        assertEquals("read first char", 'B', _input.read());
        int ch;
        for( int i = 1; i < 200; i++) {
            ch = _input.read();
        }
        assertEquals("read last char", '6', _input.read());
        assertEquals("read at end", -1, _input.read());
        assertEquals("readpast end", -1, _input.read());
    }

    //空文件测试
    public void testEmptyRead() throws Exception {
        assertEquals(-1, _empty.read());
    }

    public void testReadAfterClose() throws Exception {
        _input.close();
        try{
            _input.read();
            fail("no exception for read past end");
        }catch (IOException e) {

        }
    }

    //产生一个测试套件
    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(new FileReaderTester("testRead"));
        suite.addTest(new FileReaderTester("testReadAtEnd"));
        suite.addTest(new FileReaderTester("testReadBoundaries"));
        return suite;
    }


    //要想将整个测试运行起来需要一个独立的Runner类
    public static void main(String[] args) {
        //junit.textui.TestRunner.run(suite());
        //按照下面的写法，该类中所有以test命名的方法都会被加入到测试套件中
        junit.textui.TestRunner.run(new TestSuite(FileReaderTester.class));
    }
}
