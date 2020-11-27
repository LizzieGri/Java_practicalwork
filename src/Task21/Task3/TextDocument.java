package Task21.Task3;

import java.io.FileWriter;
import java.io.IOException;

public class TextDocument implements IDocument {
    FileWriter fw;
    @Override
    public void save() throws IOException {
        fw.close();
    }

    @Override
    public void create() throws IOException {
        fw = new FileWriter( "Sample.txt" );
    }

    @Override
    public void open() throws IOException {
        fw = new FileWriter( "Sample.txt" );
    }

    @Override
    public void close() throws IOException {
        fw.close();
    }
}
