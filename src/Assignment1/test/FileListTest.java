package Assignment1.test;

import Assignment1.Solution.FileList;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class FileListTest {
    private FileList fileList;
    private File[] path;

    @Before
    public void setUp() throws Exception {
        fileList = new FileList ();
        path = new File("/home/zemoso/Manish").listFiles();
    }

    @Test
    public void printList () throws Exception {
        fileList.printList ( path,".*" );
    }

}