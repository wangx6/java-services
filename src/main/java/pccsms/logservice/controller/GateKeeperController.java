package pccsms.logservice.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import pccsms.logservice.dto.Log;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

@RestController
public class GateKeeperController {

    @GetMapping("/log")
    @ResponseBody
    public Log sayHello(@RequestParam(name = "name", required = false, defaultValue = "Stranger") String name) {
        return new Log(UUID.randomUUID().toString(), "it is:" + name, "clientId");
    }
}
