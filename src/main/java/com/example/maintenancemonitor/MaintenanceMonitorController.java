package com.example.maintenancemonitor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController {
    private String m = "Everything operates as expected";
    @RequestMapping("/api/message/set")
    public String setMessage(@RequestParam String m){
        if (m==null) {
            m="Everything operates as expected";
        }
        this.m=m;
        return "ok";
    }
    @RequestMapping("/api/message/reset")
    public  String reset(){
        setMessage(null);
        return "ok";
    }
    @RequestMapping("/api/message")
    public String getMessage(){
        return m;
    }
}
