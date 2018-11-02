package com.qs.mmeng.controller;

import com.qs.mmeng.properties.WuuProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
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

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Value("${wuu.remark}")
    private String remark;

    private WuuProperties wuuProperties;

    public HomeController(WuuProperties wuuProperties) {
        this.wuuProperties = wuuProperties;
    }

    @PostConstruct
    public void init() {
        logger.info("配置信息是否读取成功: {}", remark);
    }

    @GetMapping(value = {"/user"})
    public List<String> users() {
        return wuuProperties.getNames();
    }

}
