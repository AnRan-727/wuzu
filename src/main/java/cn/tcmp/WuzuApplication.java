package cn.tcmp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.tcmp.*.mapper")
public class WuzuApplication {

    public static void main(String[] args) {
        SpringApplication.run(WuzuApplication.class, args);
    }

}
