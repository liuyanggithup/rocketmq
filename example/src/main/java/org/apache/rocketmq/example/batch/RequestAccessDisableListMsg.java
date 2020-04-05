package org.apache.rocketmq.example.batch;

/**
 * @Author: seventeen
 * @Date: 2020/2/25 16:51
 * @Description:
 */
public class RequestAccessDisableListMsg {

    /**
     * 设备唯一标识
     */
    private String deviceId;
    /**
     * 设备类型
     */
    private String deviceType;
    /**
     * 请求路径
     */
    private String path;
    /**
     * 访问禁用规则类型
     */
    private String requestAccessDisableRuleType;
    /**
     * 访问禁用规则说明
     */
    private String requestAccessDisableRuleDesc;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getRequestAccessDisableRuleType() {
        return requestAccessDisableRuleType;
    }

    public void setRequestAccessDisableRuleType(String requestAccessDisableRuleType) {
        this.requestAccessDisableRuleType = requestAccessDisableRuleType;
    }

    public String getRequestAccessDisableRuleDesc() {
        return requestAccessDisableRuleDesc;
    }

    public void setRequestAccessDisableRuleDesc(String requestAccessDisableRuleDesc) {
        this.requestAccessDisableRuleDesc = requestAccessDisableRuleDesc;
    }
}
