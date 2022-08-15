package cn.icods.jenkinsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName JenkinsTest
 * @Description TODO
 * @Author rex.zhao
 * @Date 2022/8/15 3:56 PM
 * @Version 1.0
 */
@RestController
public class JenkinsTest {
    @GetMapping("/jenkins")
    public String hello() {
        return "hello jenkins!!!";

    }
}
