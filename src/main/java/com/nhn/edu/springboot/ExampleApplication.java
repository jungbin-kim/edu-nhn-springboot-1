package com.nhn.edu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // RestController 역할을 하게 해준다.
@SpringBootApplication
public class ExampleApplication {
    // `src/main/resource/banner.txt` 파일을 생성하여 기본 banner 대체
    // http://patorjk.com/software/taag/#p=display&f=Graffiti&t=Type Something

    public static void main(String[] args) {
        // args가 없어도 컴파일은 되지만, spring boot 옵션들이 적용이 안된다.
        SpringApplication.run(ExampleApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}
