package cn.lastwhisper.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@SpringBootApplication
public class ServiceB1Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceB1Application.class, args);
    }

    @RequestMapping("/method")
    public Map methodA(){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("service","order 1");
        return hashMap;
    }
}
