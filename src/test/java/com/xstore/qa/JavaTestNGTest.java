package com.xstore.qa;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @FunctionDesc
 * @Author bjyfxuxiaojun
 * @CreateDate 2018/2/1
 * @Reviewer kongxiangyun
 * @ReviewDate 2018/2/1
 */
public class JavaTestNGTest {

    @Test
    public void testJavaWithTestNG() throws Exception {

        System.out.println("这是一个java+testng 测试用例");

        Assert.assertTrue(1 < 2);
    }
}
