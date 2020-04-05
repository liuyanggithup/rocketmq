package org.apache.rocketmq.example.batch;

import java.util.Date;

/**
 * @Author: seventeen
 * @Date: 2020/2/25 15:37
 * @Description:
 */
public class RequestAccessDataMsg {

    /**
     * 客户端IP
     */
    private String clientIp;

    /**
     * 请求的域名
     */
    private String host;

    /**
     * 请求路径
     */
    private String path;

    /**
     * 接口耗时(s)
     */
    private Long rt;

    /**
     * ios设备号
     */
    private String idfa;

    /**
     * ios设备号
     */
    private String idfv;

    /**
     * android设备号
     */
    private String imei;

    /**
     * 平台客户端唯一标识
     */
    private String phoneToken;

    /**
     * 用户登录令牌
     */
    private String token;

    /**
     * 请求时间  2020-01-02 12:12:12
     */
    private Date requestTime;

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Long getRt() {
        return rt;
    }

    public void setRt(Long rt) {
        this.rt = rt;
    }

    public String getIdfa() {
        return idfa;
    }

    public void setIdfa(String idfa) {
        this.idfa = idfa;
    }

    public String getIdfv() {
        return idfv;
    }

    public void setIdfv(String idfv) {
        this.idfv = idfv;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getPhoneToken() {
        return phoneToken;
    }

    public void setPhoneToken(String phoneToken) {
        this.phoneToken = phoneToken;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }
}
