# groovytestngdemo
testng+java+groovy测试框架集成demo
1.本测试框架集成testng强大的测试套件功能，方便并行测试。
2.支持groovy语言开发测试脚本，groovy的语法简洁性，和强大的断言功能，及对集合的处理等语法功能非常适合写测试
3.同时支持java脚本运行，只需要同时设置src/test/grooy和src/test/java为测试源码目录，可以在pom.xml中通过插件配置：

        <plugins>
            ……
            <!-- ─( add java and groovy test source folder)─────── -->
            <plugin>
                <groupId>org.codehaus.mojo</groupId>
                <artifactId>build-helper-maven-plugin</artifactId>
                <executions>
                    <execution>
                        <phase>generate-test-sources</phase>
                        <goals>
                            <goal>add-test-source</goal>
                        </goals>
                        <configuration>
                            <sources>
                                <source>src/test/java</source>
                                <source>src/test/groovy</source>
                            </sources>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
            ……
      </plugins>
