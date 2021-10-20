package sugar.multipleexception;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultipleExceptionTest {

	public static void main(String[] args) {
		try
		{
			test();
		}
		catch(IOException | SQLException ex)
		{
			//异常处理
		}


		try
		{
			test();
		}
		catch(IOException | SQLException ex)
		{
			//JDK7开始，支持一个catch写多个异常
			//异常处理
		}
		
		try
		{
			test2();
		}
		catch(IOException | FileNotFoundException ex)
		{
			//JDK7开始，支持一个catch写多个异常
			//异常处理
		}

	}
	
	public static void test() throws IOException, SQLException {  
    } 
	public static void test2() throws IOException, FileNotFoundException {  
    } 
}
