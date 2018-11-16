import java.io.*;

	public class P4_HardyTrent_parse {
	public static void main(String [] args) {
	// The name of the file to open.
	String thInputFile = "P4_HardyTrent_parse.dat";
	String thOutputFile = "P4_HardyTrent_clean.txt";
	boolean thFLG;
	String thInputLine = null;
	try {
 	// FileReader reads text files in the default encoding.

 		FileReader thReader = new FileReader(thInputFile);

 	// Always wrap FileReader in BufferedReader.

 	BufferedReader thbuffered = new BufferedReader(thReader);

	FileWriter thWriter = new FileWriter(thOutputFile);

	BufferedWriter thBufferedWriter = new BufferedWriter(thWriter);

 	while((thInputLine = thbuffered.readLine()) != null) {
	if (!thInputLine.contains(":")); {
	System.out.println(thInputLine); }
	thFLG = thInputFile.contains(":");
	if (!thFLG) {
	}
	}
 	// Always close files.
 	thbuffered.close();
	thBufferedWriter.close();
	}
 	catch(FileNotFoundException ex) {
 	System.out.println(
 	"Unable to open file '" +
 	thInputFile + "'");
 	}
 	catch(IOException ex) {
 	System.out.println(
 	"Error reading file '" 
 + thInputFile + "'");
 	// Or we could just do this:
 	// ex.printStackTrace();
	}
	}
}