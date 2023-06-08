package cn.boot.ymw.cn.utils;

import com.alipay.easysdk.factory.Factory;
import com.alipay.easysdk.factory.Factory.Payment;
import com.alipay.easysdk.kernel.Config;
import com.alipay.easysdk.kernel.util.ResponseChecker;
import com.alipay.easysdk.payment.page.models.AlipayTradePagePayResponse;
import org.apache.log4j.Logger;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "alipay")
public  class AlipayConfig {
    private Logger logger = Logger.getLogger(getClass());
    private String protocol;
    private String gatewayHost;
    private String signType;
    private String appId;
    private String merchantPrivateKey;
    private String alipayPublicKey;
    private String notifyUrl;
    private String returnUrl;
    private String encryptKey;

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getGatewayHost() {
        return gatewayHost;
    }

    public void setGatewayHost(String gatewayHost) {
        this.gatewayHost = gatewayHost;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMerchantPrivateKey() {
        return merchantPrivateKey;
    }

    public void setMerchantPrivateKey(String merchantPrivateKey) {
        this.merchantPrivateKey = merchantPrivateKey;
    }

    public String getAlipayPublicKey() {
        return alipayPublicKey;
    }

    public void setAlipayPublicKey(String alipayPublicKey) {
        this.alipayPublicKey = alipayPublicKey;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getEncryptKey() {
        return encryptKey;
    }

    public void setEncryptKey(String encryptKey) {
        this.encryptKey = encryptKey;
    }

    @Override
    public String toString() {
        return "AlipayConfig{" +
                "protocol='" + protocol + '\'' +
                ", gatewayHost='" + gatewayHost + '\'' +
                ", signType='" + signType + '\'' +
                ", appId='" + appId + '\'' +
                ", merchantPrivateKey='" + merchantPrivateKey + '\'' +
                ", alipayPublicKey='" + alipayPublicKey + '\'' +
                ", notifyUrl='" + notifyUrl + '\'' +
                ", returnUrl='" + returnUrl + '\'' +
                ", encryptKey='" + encryptKey + '\'' +
                '}';
    }


        public  String toPcPay(String subject,String pageNo,String amount) throws Exception {
            // 1. 设置参数（全局只需设置一次）
            String result = "";
            Factory.setOptions(getOptions());
            try {
                // 2. 发起API调用（以创建当面付收款二维码为例）
                AlipayTradePagePayResponse response = Payment.Page().pay(subject,pageNo,amount,returnUrl);
                // 3. 处理响应或异常
                if (ResponseChecker.success(response)) {
                    result = response.getBody();
                    logger.debug("AlipayConfig---toPcPay----response.body:"+response.body);
                } else {
                    logger.debug("AlipayConfig---toPcPay----response.body:"+response.body);
                }
            } catch (Exception e) {
                logger.error("AlipayConfig---toPcPay----result:"+result,e);
            }
            return result;
        }
        private  Config getOptions() {
            logger.info("AlipayConfig---toPcPay----getOptions:"+this.toString());
            Config config = new Config();
            config.protocol = getProtocol();
            config.gatewayHost = getGatewayHost();
            config.signType = getSignType();
            config.appId = getAppId();
            config.merchantPrivateKey = getMerchantPrivateKey();
            config.notifyUrl = getNotifyUrl();
            config.encryptKey = getEncryptKey();
            config.alipayPublicKey= getAlipayPublicKey();
            logger.debug("AlipayConfig---toPcPay----getOptions:"+this.toString());
            System.out.println("----------------------支付宝SDK初始化成功--------------------");
            return config;
        }


}

