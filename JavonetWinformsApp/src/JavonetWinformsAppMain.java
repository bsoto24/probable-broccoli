import com.javonet.JavonetException;


public class JavonetWinformsAppMain {
	public static void main(String[] args) throws JavonetException {
		
		//**************** JAVONET SAMPLE **************************
		// IMPORTANT: Before running this sample please make sure
		// that you have updated javonet.xml file by replacing
		// default email address and license key with your activation
		// details.
		//
		// To obtain FREE trial license key please visit:
		// http://www.javonet.com/signup-for-trial/
		//**********************************************************
		
		CalculatorForm frmMain = new CalculatorForm();
		frmMain.ShowDialog();
	}
	
}
