package com.xstore.qa

import org.apache.commons.lang3.StringUtils
import org.testng.annotations.Test

/**
 * @FunctionDesc
 * @Author bjyfxuxiaojun
 * @CreateDate 2018/1/18
 * @Reviewer kongxiangyun
 * @ReviewDate 2018/1/18
 */
class GroovyTestNGTest {
    @Test
    void name() throws Exception {
        println "比较 1 和 0 的大小"
        def str = """hello,world!"""
        assert 1 > 5
        assert StringUtils.substringBefore(str, ',') == "hello"
    }
}
