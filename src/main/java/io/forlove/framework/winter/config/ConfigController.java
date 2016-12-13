package io.forlove.framework.winter.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Erik Augustus on 2016/12/13.
 */
@Controller
@RequestMapping("/winter/config")
public class ConfigController {

    @RequestMapping
    public String index(){
        return "index";
    }

}
