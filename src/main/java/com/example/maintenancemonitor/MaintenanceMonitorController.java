package com.example.maintenancemonitor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController {
    private String m = "Everything operates as expected";

    @RequestMapping("/")
    public String showStartsite()
    {
        return  "Welcome to the Maintenance Monitor!" +
                    "<br>" +
                    "<br>" +
                    "<br>" +
                "We are a small hydro-power electricity supplier near Vienna. " +"<br>" +
                "Our customers expect electricity around the clock with a very high service level agreement."+"<br>" +
                " It is easy to derive that service times are very important to us." +
                    "<br>" +
                    "<br>" +
                "Type in one of the following options api requests:"+"<br>" +
                    "<br>" +
                "-)  /set?a=X ... to set the current status to X"  +
                    "<br>" +
                "-)  /setMin?a=X&b=X ... to set the current status using X minutes  and X seconds" +
                    "<br>" +
                "-)  /status ... to see the current status level"  +
                    "<br>" +
                "-)  /reset ... to reset the current status level";

    }
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
