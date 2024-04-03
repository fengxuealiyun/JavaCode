package com.xunhou.maven;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
  @Test
  public void test(){
      HelloMaven helloMaven = new HelloMaven();
      System.out.println(helloMaven.hello("Maven"));
  }
}
