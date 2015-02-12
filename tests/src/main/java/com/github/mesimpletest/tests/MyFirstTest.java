/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.mesimpletest.tests;
/**
 * @author Dmitry Myasnikov
 */
import java.io.PrintWriter;
import com.sun.javatest.Status;
import com.sun.javatest.Test;
import java.util.Random;
/**
 * @test @executeClass com.oracle.simpletest.MyFirstTest
 * @sources com/oracle/simpletest/MyFirstTest.java
 */
public class MyFirstTest implements Test {
    public static void main(String[] args) {
        PrintWriter err = new PrintWriter(System.err, true);
        Test t = new MyFirstTest();
        Status s1 = t.run(args, null, err);
        s1.exit();
    }
    @Override
    public Status run(String[] args, PrintWriter log1, PrintWriter log2) {
        Status result;
        Random rand = new Random();
        if (rand.nextInt()>0) {
            result = Status.passed("OK");
        } else {
            result = Status.failed("Oops");
        }
        return result;
    }
}
