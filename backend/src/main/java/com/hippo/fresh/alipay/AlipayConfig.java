package com.hippo.fresh.alipay;

import com.alipay.easysdk.factory.Factory;
import com.alipay.easysdk.kernel.Config;
import org.springframework.stereotype.Component;

/**使用修改说明*/
//请将 AlipayConfig.java 中的 appId、alipayPublicKey、notifyUrl 换成自己的配置；
//同时修改 merchantPrivateKey 的路径或者直接粘贴 merchantPrivateKey 的字符串；
//另外, 请将 AlipayService.java 中的重定向url(return url) 修改为自己项目的url；

@Component
public class AlipayConfig {

    // 1. 设置参数（全局只需设置一次）
    static {
        Factory.setOptions(getOptions());
    }

    private static Config getOptions() {
        Config config = new Config();

        config.protocol = "https";

        //真实环境
        config.gatewayHost = "openapi.alipay.com";
        //沙箱环境
        config.gatewayHost = "openapi.alipaydev.com";

        config.signType = "RSA2";

        //支付宝开放平台中的APPID
        config.appId = "2021000119636906";

        // 为避免私钥随源码泄露，推荐从文件中读取私钥字符串而不是写入源码中
//        config.merchantPrivateKey = FileUtils.readFileOfTxt("C:\\Users\\Yan'zhi'hao\\Documents\\支付宝开放平台开发助手\\RSA密钥\\应用私钥2048.txt");
        config.merchantPrivateKey = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCSwY7pEXYHyHIJPXgHsLxHZ7y/znys6Mz9G9i1XW4MRtqJtOU0RizHN0PlMfLNp7f5P4BvdOK8bcQHrnngIaBVedX4VgSMRrLQyewWfOTTgtp6NwjJU0zj/oKM3j42ir3Q4U1p+JmJpV1QPpm3Emd9mJ8wTrOh56AvU+EtlAy2RcF64d632vhdGRRTTjLSD5prJ2FHO1lxVc3a2zVns6NWb05Zvj5CExUuiSPNJglSfJ/05PS2S+6dbwUUjg5YleW4ovu77QTVyaggrNN12oFYQMINPzLCntuoBY2BG0CfwrbPRWGgRcfKSfaCTMCDPDWOHxMltfNm4TxagwCiE+27AgMBAAECggEAR9Km6HX9N+3nsZH9znW2j5O7knuyFMWSnUUlmA1zsFp01fRMQHsfqxfnCKKbW/77UOa9Ks8fsGxgBgpj50dNusd36qPecfCfzwMjohXZv5JI7otEp5M3DFYg+mRCOltIbpP1WSmrquvdcUpR3IELWTJ6ph++VjyP7tm0WKQeXI2lL2AySnJo+BJLC9RKztzVCMXENQyidN/dvnHGrBJYt+x0WsXJkgbXrpnyERLxZ/iefUA0wqJGU57Tpq5NPgbjjxtSP0lg6PHpUp5fnDu/b2/8L7+1HdQ4mhLvAiG5zaj7TuaXWPgCegZu89dLxSRh8SIrbZ8Nef0UZgZkowZVYQKBgQDKUqitVoNdFZV2FYjfrQptXq0Zkwmiys3Lcpc7VJiO4xP1ABfY1Qzqsd27Nj48cENCwnq+aXQLQBckhhBKZm5HlEuJSVBehGuX/i+LC+G04JJ4UEo2xJGlsLZSBtGH0oQbOn1eqZ8LN86koItntVXR2YHskXC+Wbn8rdFmEPvyEwKBgQC5sOuVQZHwudTowYkPHd8jAth0WJt092G5mOCAgEDThs505IcXAC85sDONaH4jB3c7uS+IHsgTt7eQ0y5JK9QN5kk6puDHT5rdQZJqicaEgy3Jx7eJGANLVpjMLK+AxrWa1PQlxDqjlvXH5Q7BR3k9v8mB9Bveuwz8glJIbOXKuQKBgGvQ2Kpma+Jy2g7vMt1fbSsTRNNYE854nGpKSmUHk7SxNbVds1eNUTDQUASvx0KV4IH2+Un3ECven3aLKqs7IpFqaUZjlzyG/H8mqVdDoaet9N/AiYvd/G97V+0mTQpAGL4Z0S1c3rAvsSLxmthNPcpySlYyuw306rPIPMpTSq+ZAoGAKyktSO8JvftjuoopkmLuF5Q0va5Oy/woMdyP6i5lYwVFfbQUlksLrwv+n5K3Jus4UqBzpN8KwFKGj1oWuxk929E4GjLpskoVg/IW1z6Y7voSrYEHbw0uztcdAvAsBvGpCokPCqw2uQmArWrXaCN10d1/N/6Gb9noZdTgzUbKjrkCgYEAkuEQVXkYtOp1NQbLWDQhV+JFCFddLS9uM2K5ZKf8QkNxNhQq2c/6cI6nDiy5E3m4FeV/RV/05onaL1f6FbQ9RlIt2vvPNyj/8xR7jyKt3i7WtwAhm8AzX9JScvNZxS72bZuYEvxPOxIFWzzdjtdS4icxsAyguoKldNAThxPP15U=";
        //注：采用非证书模式，赋值如下的支付宝公钥字符串即可
        config.alipayPublicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAukMd0YDlIzLJ4w5110Yezk/ytO0DdjVSeYEfVOg42JJ/E7mB38Kqc3fZAKGO9uMoGRfq5e/gCbR1bCbFN4JHC4/78wiHnjv68//3rD1G6sO/JsyuvJrcipvEukwc9hZghOVXGtPgmfRjOeYeDoMtzNF1wrptLf9Fg41i0t/6w4H7xYFEATv1OJkm1kDfGYnt+W9OWDjJwKPxP7vY1lw884Zv6xDF4O20zSt84usdQn9AKh03eM4G8k0kWVDhcC3Bl2tdZ0gqb46A4Q1Vxvzmj8bE6BfL/kv2mJsRO0mieYNztldttzeseofFUrwfth9WIushzObbaDvBYFUcvfxdaQIDAQAB";
        //可设置异步通知接收服务地址（可选）
        config.notifyUrl = "http://127.0.0.1:8080/api/alipay/callback";

        return config;
    }
}

