package grid.afid;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );


    	fileOut();


    }

    public static void fileOut() {

    	try{
    		 // 書き込むファイルの名前
    	    String outputFileName = "f:/tmp/test.txt";

    	    // ファイルオブジェクトの生成
    	    File outputFile = new File(outputFileName);
    		// 出力ストリームの生成
    	    FileOutputStream fos = new FileOutputStream(outputFile);
    	    OutputStreamWriter osw = new OutputStreamWriter(fos);
    	    PrintWriter pw = new PrintWriter(osw);

    	    // ファイルへの書き込み
    	    pw.println("Javaサンプルプログラム");
    	    pw.println("ファイル入出力");

    	    // 後始末
    	    pw.close();


    	}catch(IOException e){
    	    //System.out.println(e);
    	}

    }


}
