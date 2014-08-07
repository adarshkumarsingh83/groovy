package com.adarsh.groovy

/**
 * @author $CreatedBy Adarsh_K
 * @author $LastChangedBy: Adarsh_K
 * @version $Revision: 1.0 $, $Date:: 5/7/13 1:53 PM
 * @see
 */

public class FileReading {

    //C:\log\applicationLogFile.log
    def static getFile() throws Exception {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
            print "Enter the File Name :"
            def fileName = br.readLine()
            def fileObject = new File(fileName);
            if (!fileObject.exists()) {
                throw new FileNotFoundException(fileName)
            }
            return fileObject
        } catch (Exception e) {
            print "${e.getMessage()}"
            return null;
        }
    }

    public static void main(String[] args) {
        def fileObject = getFile();
        if (fileObject != null) {
            fileObject.eachLine {
                println it
            }
        } else {
            println "file not found ";
        }
    }
}
