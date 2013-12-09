/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jseqtk;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author hliang
 */

public class Test {
    public static void main(String[] args){
    System.out.println("starting ...");
    List<String> listOfString = Arrays.asList("/opt/local/bin/seqtk", "seq");
    listOfString.add("-f");
    listOfString.add("0.2");
    //listOfString.add("-A");
    listOfString.add("/Users/hliang/NetBeansProjects/jSeqtk/sample_R1.fastq");
    //List<String> listOfString = Arrays.asList("date");
    JSeqtk jseqtkInstance = new JSeqtk(listOfString);
    jseqtkInstance.setOutFile("/Users/hliang/NetBeansProjects/jSeqtk/output.txt");
    //jseqtkInstance.setCommand("seqtk comp ");
    //jseqtkInstance.setOptions("-q 20 -n _ -f 0.5 /Users/hliang/NetBeansProjects/jSeqtk/sample_R1.fastq");
    jseqtkInstance.runCommand();
    }
}
