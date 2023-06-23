package com.example.maintenancemonitor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController {
    private String m = "Everything operates as expected";

    @RequestMapping("/api/")
    public String showStartSite()
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
                "-)  /api/message/set?m=X ... to set the current status to X"  +
                    "<br>" +
                "-)  /api/message ... to see the current status level"  +
                    "<br>" +
                "-)  /api/message/reset ... to reset the current status level";

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
