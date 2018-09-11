package com.qs.mmeng.controller;

import com.qs.mmeng.properties.WuuProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * spring-cloud-config-sample
 *
 * @author qsm
 * @date 2018/09/11
 */
@RestController
@RequestMapping(value = {"/home"})
public class HomeController {

    private WuuProperties wuuProperties;

    public HomeController(WuuProperties wuuProperties) {
        this.wuuProperties = wuuProperties;
    }

    @GetMapping(value = {"/user"})
    public List<String> users() {
        return wuuProperties.getNames();
    }

}
