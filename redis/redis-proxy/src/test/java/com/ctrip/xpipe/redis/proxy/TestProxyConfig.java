package com.ctrip.xpipe.redis.proxy;

import com.ctrip.xpipe.redis.proxy.config.ProxyConfig;

/**
 * @author chen.zhu
 * <p>
 * May 15, 2018
 */
public class TestProxyConfig implements ProxyConfig {

    @Override
    public int frontendPort() {
        return 8992;
    }

    @Override
    public int frontendWorkerEventLoopNum() {
        return 10;
    }

    @Override
    public long getTrafficReportIntervalMillis() {
        return 1000;
    }

    @Override
    public boolean isSslEnabled() {
        return false;
    }

    @Override
    public int backendEventLoopNum() {
        return 2;
    }

    @Override
    public int endpointHealthCheckIntervalSec() {
        return 60;
    }

    @Override
    public String getPassword() {
        return "123456";
    }

    @Override
    public String getServerCertFilePath() {
        return null;
    }

    @Override
    public String getClientCertFilePath() {
        return null;
    }

    @Override
    public String getCertFileType() {
        return null;
    }
}