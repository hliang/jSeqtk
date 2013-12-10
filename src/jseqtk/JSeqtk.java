/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jseqtk;

/**
 *
 * @author hliang
 */

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JSeqtk {
    
    public static String command;
    public static String options;
    public static String fullCmd;
    List<String> cmdList;
    public static String outFile;
    
    // Constructors
    JSeqtk () {
        this.cmdList = new ArrayList<String>();
        this.outFile = "seqtk_output.txt";
        
    }
    
    JSeqtk (List<String> cmdList) {
        this.cmdList = new ArrayList<String>();
        this.cmdList = cmdList;
        this.outFile = "seqtk_output.txt";
    }
        
    JSeqtk (String fullCmd) {
        this.cmdList = new ArrayList<String>();
        this.cmdList.add(fullCmd);
        this.outFile = "seqtk_output.txt";
    }
    
    JSeqtk (String command, String options) {
        this.cmdList = new ArrayList<String>();
        this.cmdList.add(command);
        this.cmdList.add(options);
        this.outFile = "seqtk_output.txt";
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //List<String> listOfString = Arrays.asList("/opt/local/bin/seqtk", 
        //        "seq", "-f", "0.2", "/Users/hliang/NetBeansProjects/jSeqtk/sample_R1.fastq"); // The List created this way is fixed, cannot perform add/remove method
        List<String> listOfString = new ArrayList<String>();
        listOfString.addAll(Arrays.asList("/opt/local/bin/seqtk", "seq", "-s", "12" ,"-f", "0.4"));
        listOfString.add("/Users/hliang/NetBeansProjects/jSeqtk/sample_R1.fastq");
        JSeqtk myInstance = new JSeqtk(listOfString);
        myInstance.setOutFile("/Users/hliang/NetBeansProjects/jSeqtk/output.txt");
        myInstance.runCommand();
        
//        try
//        {
//            System.out.println("Creating Process...");
//            
////            Runtime rt = Runtime.getRuntime() ;
////            Process p = rt.exec("date") ;
////            InputStream in = p.getInputStream() ;
////            OutputStream out = p.getOutputStream ();
////            InputStream err = p.getErrorStream() ;
////
////            for (int i = 0; i < in.available(); i++) {
////                //System.out.println("===" + in.read());
////            }
////            
//            
//            // or use ProcessBuilder
//            
//            String cmd = "sort";
//            String par1 = "-n";
//            String par2 = "-r";
//            String par3 = "/Users/hliang/NetBeansProjects/jSeqtk/randnum.txt";
//            
//            //ProcessBuilder pb = new ProcessBuilder(cmd, par1, par2, par3);
//            ProcessBuilder pb = new ProcessBuilder(command, options);
//            // merge standard error with standard output
//            // pb.redirectErrorStream(true);
//            // send standard output to a file
//            pb.redirectOutput(new File("output.txt"));
//            // send error to a file:
//            // pb.redirectError(new File("err.txt"));
//            
//            // start a process
//            Process p = pb.start();
//            
//            
//            // get the error stream of the process and print it
//            InputStream err = p.getErrorStream() ;
//            /*
//            for (int i = 0; i < err.available(); i++) {
//                System.out.print((char)(err.read()));
//            }
//            */
//
//            // not good ... 
//            // could not figure out how to print error message in realtime
//            String errString = convertInputStreamToString(err);
//            
//            err.close();
//            
//
//
//            //do whatever you want
//            //some more code
//            //System.out.println(out);
// 
//            // wait for 2 seconds and then destroy the process
//            Thread.sleep(2000);
//            p.destroy() ;
//            
//            int exitVal = p.exitValue();
//            
//            System.out.println("Process exitValue: " + exitVal);
//            System.out.print("==========\n");
//            
//            // not good ... 
//            // could not figure out how to print error message in realtime
//            System.out.print(errString);
//            System.out.print("==========\n");
//            
//        } catch (Exception ex) {
//            /*handle exception*/
//            ex.printStackTrace();
//        }
    }
    
    public static String convertInputStreamToString(InputStream is) {
        Scanner s = new Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }
    
    public void setCommand(String command) {
        this.command = command;
    }
    
    public void setOptions(String options) {
        this.options = options;
    }
    
    public String getFullCmd(){
        return (fullCmd == null ) ? (command + " " + options) : fullCmd;
    }
    
    public void setOutFile(String outFile){
        this.outFile = outFile;
    }
    
    public void runCommand() {
        try {
            System.out.print("++++++++\n");
            System.out.println(cmdList);
            // System.out.print(getFullCmd());
            ProcessBuilder pb = new ProcessBuilder(cmdList);
            pb.redirectErrorStream(true);
            //pb.redirectOutput(new File("/Users/hliang/NetBeansProjects/jSeqtk/output.txt"));
            pb.redirectOutput(new File(outFile));
            Process p = pb.start();
            //InputStream err = p.getErrorStream() ;
            Thread.sleep(2000);
            p.destroy() ;
            int exitVal = p.exitValue();

            System.out.println("Process exitValue: " + exitVal);
            System.out.print("++++++++\n");
        } catch (Exception ex) {
            /*handle exception*/
            ex.printStackTrace();
        }
    }
    
    public void runCommand(List cmdList) {
        this.cmdList = cmdList;
        runCommand();
    }
    
    public void runCommand(String fullCmd) {
        runCommand(command, options);
    }
            
    public void runCommand(String command, String options){
        
        try {
            System.out.print("++++++++\n");
            // System.out.print(getFullCmd());
            ProcessBuilder pb = new ProcessBuilder(command, options);
            pb.redirectErrorStream(true);
            pb.redirectOutput(new File("/Users/hliang/NetBeansProjects/jSeqtk/output.txt"));
            Process p = pb.start();
            //InputStream err = p.getErrorStream() ;
            Thread.sleep(2000);
            p.destroy() ;
            int exitVal = p.exitValue();

            System.out.println("Process exitValue: " + exitVal);
            System.out.print("++++++++\n");
        } catch (Exception ex) {
            /*handle exception*/
            ex.printStackTrace();
        }
    }
    
}
