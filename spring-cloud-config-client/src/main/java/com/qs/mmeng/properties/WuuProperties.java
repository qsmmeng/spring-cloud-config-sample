package com.qs.mmeng.properties;

import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * security
 *
 * @author qsm
 * @date 2018/09/11
 */
@Component
@ConfigurationProperties(prefix = "wuu")
public class WuuProperties {

    private List<String> names;

    private String remark;

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
