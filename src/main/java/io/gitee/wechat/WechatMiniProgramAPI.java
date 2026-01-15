package io.gitee.wechat;


import cn.hutool.json.JSONObject;
import io.github.memo.annotation.API;
import io.github.memo.enums.HttpMethod;

import java.util.Map;

/**
 * 微信小程序
 *
 * @author fushixin
 * @since 1.0.0
 */
public interface WechatMiniProgramAPI {

    // ========== 接口调用凭证 ==========

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/mp-access-token/api_getaccesstoken.html">获取接口调用凭据</a>
     *
     * @param query 查询参数
     * @return 返回体
     */
    @API(api = "https://api.weixin.qq.com/cgi-bin/token")
    JSONObject getAccessToken(Map<String, String> header, Map<String, Object> query);

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/mp-access-token/api_getstableaccesstoken.html">获取稳定版接口调用凭据</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/cgi-bin/stable_token")
    JSONObject getStableAccessToken(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    // ========== openApi管理 ==========

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/openApi-mgnt/api_getapiquota.html">查询API调用额度</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/cgi-bin/openapi/quota/get")
    JSONObject getApiQuota(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/openApi-mgnt/api_clearquota.html">重置API调用次数</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/cgi-bin/clear_quota")
    JSONObject clearQuota(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/openApi-mgnt/api_clearapiquota.html">重置指定API调用次数</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/cgi-bin/openapi/quota/clear")
    JSONObject clearApiQuota(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/openApi-mgnt/api_clearquotabyappsecret.html">使用AppSecret重置API调用次数</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/cgi-bin/clear_quota/v2")
    JSONObject clearQuotaByAppSecret(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/openApi-mgnt/api_getridinfo.html">查询rid信息</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/cgi-bin/openapi/rid/get")
    JSONObject getRidInfo(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/openApi-mgnt/api_callbackcheck.html">网络通信检测</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/cgi-bin/callback/check")
    JSONObject callbackCheck(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/openApi-mgnt/api_getapidomainip.html">获取微信API服务器IP</a>
     *
     * @param query 查询参数
     * @return 返回体
     */
    @API(api = "https://api.weixin.qq.com/cgi-bin/get_api_domain_ip")
    JSONObject getApiDomainIp(Map<String, String> header, Map<String, Object> query);

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/openApi-mgnt/api_getcallbackip.html">获取微信推送服务器IP</a>
     *
     * @param query 查询参数
     * @return 返回体
     */
    @API(api = "https://api.weixin.qq.com/cgi-bin/getcallbackip")
    JSONObject getCallbackIp(Map<String, String> header, Map<String, Object> query);

    // ========== 用户信息 / 用户信息 ==========

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/user-info/basic-info/api_getpluginopenpid.html">获取插件用户openpid</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/wxa/getpluginopenpid")
    JSONObject getPluginOpenPId(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/user-info/basic-info/api_checkencrypteddata.html">检查加密信息</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/wxa/business/checkencryptedmsg")
    JSONObject checkEncryptedData(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/user-info/basic-info/api_getpaidunionid.html">支付后获取Unionid</a>
     *
     * @param query 查询参数
     * @return 返回体
     */
    @API(api = "https://api.weixin.qq.com/wxa/getpaidunionid")
    JSONObject getPaidUnionid(Map<String, String> header, Map<String, Object> query);

    // ========== 用户信息 / 网络 ==========

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/user-info/internet/api_getuserencryptkey.html">获取用户encryptKey</a>
     *
     * @param query 查询参数
     * @return 返回体
     */
    @API(api = "https://api.weixin.qq.com/wxa/business/getuserencryptkey")
    JSONObject getUserEncryptKey(Map<String, String> header, Map<String, Object> query);

    // ========== 用户信息 / 手机号 ==========

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/user-info/phone-number/api_getphonenumber.html">获取手机号</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/wxa/business/getuserphonenumber")
    JSONObject getPhoneNumber(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    // ========== 小程序登录 ==========

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/user-login/api_code2session.html">小程序登录凭证校验</a>
     *
     * @param query 查询参数
     * @return 返回体
     */
    @API(api = "https://api.weixin.qq.com/sns/jscode2session")
    JSONObject code2Session(Map<String, String> header, Map<String, Object> query);

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/user-login/api_checksessionkey.html">检验登录态</a>
     *
     * @param query 查询参数
     * @return 返回体
     */
    @API(api = "https://api.weixin.qq.com/wxa/checksession")
    JSONObject checkSessionKey(Map<String, String> header, Map<String, Object> query);

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/user-login/api_resetusersessionkey.html">重置登录态</a>
     *
     * @param query 查询参数
     * @return 返回体
     */
    @API(api = "https://api.weixin.qq.com/wxa/resetusersessionkey")
    JSONObject ResetUserSessionKey(Map<String, String> header, Map<String, Object> query);

    // ========== 小程序码与小程序链接 / 小程序码 ==========

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/qrcode-link/qr-code/api_getqrcode.html">获取小程序码</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/wxa/getwxacode")
    JSONObject getQRCode(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/qrcode-link/qr-code/api_getunlimitedqrcode.html">获取不限制的小程序码</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/wxa/getwxacodeunlimit")
    JSONObject getUnlimitedQRCode(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/qrcode-link/qr-code/api_createqrcode.html">获取小程序二维码</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/cgi-bin/wxaapp/createwxaqrcode")
    JSONObject createQRCode(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    // ========== 小程序码与小程序链接 / URL Scheme ==========

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/qrcode-link/url-scheme/api_queryscheme.html">查询scheme码</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/wxa/queryscheme")
    JSONObject queryScheme(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/qrcode-link/url-scheme/api_generatescheme.html">获取加密scheme码</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/wxa/generatescheme")
    JSONObject generateScheme(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/qrcode-link/url-scheme/api_generatenfcscheme.html">获取NFC的小程序scheme</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/wxa/generatenfcscheme")
    JSONObject generateNFCScheme(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    // ========== 小程序码与小程序链接 / URL Link ==========

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/qrcode-link/url-link/api_generateurllink.html">获取加密URLLink</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/wxa/generate_urllink")
    JSONObject generateUrlLink(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/qrcode-link/url-link/api_queryurllink.html">查询加密URLLink</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/wxa/query_urllink")
    JSONObject queryUrlLink(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    // ========== 小程序码与小程序链接 / Short Link ==========

    /**
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/server/API/qrcode-link/short-link/api_generateshortlink.html">获取ShortLink</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/wxa/genwxashortlink")
    JSONObject generateShortLink(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

}
