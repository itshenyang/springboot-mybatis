package cn.no7player;

import cn.no7player.utils.L;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.no7player.mapper")
public class Application  {



    /**
     * Start
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        L.w("SpringBoot Start Success");
    }


}
