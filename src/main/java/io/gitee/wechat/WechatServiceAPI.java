package io.gitee.wechat;

import cn.hutool.json.JSONObject;
import io.github.memo.annotation.API;
import io.github.memo.enums.HttpMethod;

import java.util.Map;

/**
 * 微信服务号
 *
 * @author fushixin
 * @since 1.0.0
 */
public interface WechatServiceAPI {

    // ========== 基础接口 ==========

    /**
     * <a href="https://developers.weixin.qq.com/doc/service/api/base/api_getaccesstoken.html">获取接口调用凭据</a>
     *
     * @param query 查询参数
     * @return 返回体
     */
    @API(api = "https://api.weixin.qq.com/cgi-bin/token")
    JSONObject getAccessToken(Map<String, String> header,  Map<String, Object> query);

    /**
     * <a href="https://developers.weixin.qq.com/doc/service/api/base/api_getstableaccesstoken.html">获取稳定版接口调用凭据</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/cgi-bin/stable_token")
    JSONObject getStableAccessToken(Map<String, String> header,  Map<String, Object> query, Map<String, Object> body);

    /**
     * <a href="https://developers.weixin.qq.com/doc/service/api/base/api_callbackcheck.html">网络通信检测</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/cgi-bin/callback/check")
    JSONObject callbackCheck(Map<String, String> header,  Map<String, Object> query, Map<String, Object> body);

    /**
     * <a href="https://developers.weixin.qq.com/doc/service/api/base/api_getapidomainip.html">获取微信API服务器IP</a>
     *
     * @param query 查询参数
     * @return 返回体
     */
    @API(api = "https://api.weixin.qq.com/cgi-bin/get_api_domain_ip")
    JSONObject getApiDomainIp(Map<String, String> header,  Map<String, Object> query);

    /**
     * <a href="https://developers.weixin.qq.com/doc/service/api/base/api_getcallbackip.html">获取微信推送服务器IP</a>
     *
     * @param query 查询参数
     * @return 返回体
     */
    @API(api = "https://api.weixin.qq.com/cgi-bin/getcallbackip")
    JSONObject getCallbackIp(Map<String, String> header,  Map<String, Object> query);

    // ========== 用户信息 ==========

    /**
     * <a href="https://developers.weixin.qq.com/doc/service/api/usermanage/userinfo/api_batchuserinfo.html">批量获取用户基本信息</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/cgi-bin/user/info/batchget")
    JSONObject batchUserinfo(Map<String, String> header,  Map<String, Object> query, Map<String, Object> body);

    /**
     * <a href="https://developers.weixin.qq.com/doc/service/api/usermanage/userinfo/api_getfans.html">获取关注用户列表</a>
     *
     * @param query 查询参数
     * @return 返回体
     */
    @API(api = "https://api.weixin.qq.com/cgi-bin/user/get")
    JSONObject getFans(Map<String, String> header,  Map<String, Object> query);

    // ========== 模板消息 ==========

    /**
     * <a href="https://developers.weixin.qq.com/doc/service/api/notify/template/api_sendtemplatemessage.html">发送模板消息</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/cgi-bin/message/template/send")
    JSONObject sendTemplateMessage(Map<String, String> header,  Map<String, Object> query, Map<String, Object> body);

    // ========== 网页授权 ==========

    /**
     * <a href="https://developers.weixin.qq.com/doc/service/api/webdev/access/api_snsaccesstoken.html">换取用户授权凭证</a>
     *
     * @param query 查询参数
     * @return 返回体
     */
    @API(api = "https://api.weixin.qq.com/sns/oauth2/access_token")
    JSONObject snsAccessToken(Map<String, String> header,  Map<String, Object> query);

}
