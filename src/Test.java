import CSVWriter.Exceptions.FieldMismatchException;
import CSVWriter.Writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

/**
 * Created by mohma on 5/14/2017.
 */
public class Test {
    public static void main(String[] args){
        try {
            Writer CSVWriter = new Writer(new File("test.csv"),Writer.DEFAULT_ENCODING).
                    setDelimiter("|").
                    setFields(new String[]{"id","name","department","profession"});
            CSVWriter.addRow(new String[]{"1","Alice","IT","Java Developer"});
            CSVWriter.addRow(new String[]{"1","Alice","IT","Java Developer"});
            CSVWriter.write();
            CSVWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FieldMismatchException e) {
            e.printStackTrace();
        }
    }
}
