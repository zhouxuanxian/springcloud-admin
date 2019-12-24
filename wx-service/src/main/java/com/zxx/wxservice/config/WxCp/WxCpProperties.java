package com.zxx.wxservice.config.WxCp;
/**
 *  企业微信微信的配置信息
 */
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="wx.cp")
@Data
public class WxCpProperties {
    /**
     * 设置微信企业号的corpId
     */
    private  String corpId;
    /**
     * 设置微信企业应用的AgentId
     */
    private  Integer agentId;

    /**
     * 设置微信企业应用的Secret
     */
    private  String secret;
    /**

     * 设置微信企业号的token
     */
    private  String token;

    /**
     * 设置微信企业号的EncodingAESKey
     */
    private  String aesKey;
}
