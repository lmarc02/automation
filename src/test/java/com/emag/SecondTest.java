package com.emag;

import com.emag.base.BaseTest;
import org.testng.annotations.Test;

public class SecondTest extends BaseTest {
    @Test
    public void SecondTestMethod(){
        //open www.ejobs.ro/‎.ro
        driver.get("https://www.ejobs.ro/");
        System.out.println("ejobs opened. Test passed");



    }
}
