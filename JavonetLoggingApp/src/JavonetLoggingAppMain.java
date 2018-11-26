import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;


public class JavonetLoggingAppMain {

	public static void main(String[] args) throws JavonetException {
		
		//**************** JAVONET SAMPLE **************************
		// IMPORTANT: Before running this sample please make sure
		// that you have updated Javonet.activate method arguments
		// by replacing default email address and license key with 
		// your activation details.
		//
		// To obtain FREE trial license key please visit:
		// http://www.javonet.com/signup-for-trial/
		//**********************************************************
				
		//Modify JavonetFramework version to the one installed on your computer: v35, v40 or v45
		Javonet.activate("bsoto.dev@gmail.com", "o3JK-o3Q8-p2D8-Bm5t-Lo9w",JavonetFramework.v40);
		Javonet.addReference("MyBackNet.dll");
		int result = Javonet.getType("Class1").invoke("random");
		System.out.println("Resultado:" + result);

		result = Javonet.getType("Class1").invoke("duplicar", result);
		System.out.println("Resultado:" + result);

		
		/*
		Javonet.addReference("log4net.dll");
		
		Javonet.getType("BasicConfigurator").invoke("Configure");
		
		NObject log = Javonet.getType("LogManager").invoke("GetLogger","main");
		log.invoke("Debug","Test Javonet!");
		log.invoke("Info", "Test info javonet");
		log.invoke("Error", "Test info javonet");
		
		*/
	}

}