package testpackage;
import mainpackage.Main;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

  public class MainTest {
    Main component = new Main();
    @Test
      public void testenabl(){
        int a = 1;
        int b = 0;
         Assert.assertEquals(a ,1);
    }
    }