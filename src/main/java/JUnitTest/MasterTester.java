package JUnitTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by zhangyue-k on 2018/2/23.
 * 当测试越来越多的时候，可以生成一个类用于包含其他测试类所组成的测试套件
 */
public class MasterTester extends TestCase {
    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static Test suite() {
        TestSuite result = new TestSuite();
        result.addTest(new TestSuite(FileReaderTester.class));
        //result.addTest(new TestSuite(FileWriterTest.class));
        return result;
    }
}
