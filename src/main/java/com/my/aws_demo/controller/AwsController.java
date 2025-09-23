package com.my.aws_demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// @RestController : @ResoponseBody를 갖는 컨트롤러
@RestController
// @Slf4j : 로그 출력 용 Annotation
@Slf4j
public class AwsController {
    @GetMapping("/aws")
    public String hello() {
        return "안녕하세요";
    }

    // localhost:8080/aws/v1?num=파람값
    @GetMapping("/aws/v1")
    public String awsReturn(@RequestParam(defaultValue = "1", name = "num") Integer num) {
        if (num == 1) {
            log.info("aws/v1 호출 : Info 로그 ######");
            return "<h1>AWS-Demo Test : Info Log</h1>";
        } else if (num == -1) {
            log.warn("aws/v1 호출 : Warning 로그 ######");
            return "<h1>AWS-Demo Test : Warning Log</h1>";
        } else if (num == 0) {
            log.error("aws/v1 호출 : Error 로그 ######");
            return "<h1>AWS-Demo Test : Error Log</h1>";
        }
        log.info("aws/v1 호출 ######");
        return "<h1>AWS-Demo Test</h1>";
    }
}
