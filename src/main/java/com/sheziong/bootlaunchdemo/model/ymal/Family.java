package com.sheziong.bootlaunchdemo.model.ymal;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * @author zfshe
 * @date 2020/4/27 16:30
 */
@Data
@Component
@Validated
@ConfigurationProperties(prefix = "family")
public class Family {
//    @Value("${family.family-name}")

    private String familyName;
    private Father father;
    private Mother mother;
    private Children children;

}
