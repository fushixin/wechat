package io.gitee.wechat;

import cn.hutool.json.JSONObject;
import io.github.memo.annotation.API;
import io.github.memo.enums.HttpMethod;

import java.util.Map;

/**
 * 微信公众号
 *
 * @author fushixin
 * @since 1.0.0
 */
public interface WechatSubscriptionAPI {

    // ========== 基础接口 ==========

    /**
     * <a href="https://developers.weixin.qq.com/doc/subscription/api/base/api_getaccesstoken.html">获取接口调用凭据</a>
     *
     * @param query 查询参数
     * @return 返回体
     */
    @API(api = "https://api.weixin.qq.com/cgi-bin/token")
    JSONObject getAccessToken(Map<String, String> header, Map<String, Object> query);

    /**
     * <a href="https://developers.weixin.qq.com/doc/subscription/api/base/api_getstableaccesstoken.html">获取稳定版接口调用凭据</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/cgi-bin/stable_token")
    JSONObject getStableAccessToken(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    /**
     * <a href="https://developers.weixin.qq.com/doc/subscription/api/base/api_callbackcheck.html">网络通信检测</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/cgi-bin/callback/check")
    JSONObject callbackCheck(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    /**
     * <a href="https://developers.weixin.qq.com/doc/subscription/api/base/api_getapidomainip.html">获取微信API服务器IP</a>
     *
     * @param query 查询参数
     * @return 返回体
     */
    @API(api = "https://api.weixin.qq.com/cgi-bin/get_api_domain_ip")
    JSONObject getApiDomainIp(Map<String, String> header, Map<String, Object> query);

    /**
     * <a href="https://developers.weixin.qq.com/doc/subscription/api/base/api_getcallbackip.html">获取微信推送服务器IP</a>
     *
     * @param query 查询参数
     * @return 返回体
     */
    @API(api = "https://api.weixin.qq.com/cgi-bin/getcallbackip")
    JSONObject getCallbackIp(Map<String, String> header, Map<String, Object> query);

    // ========== openApi管理 ==========

    /**
     * <a href="https://developers.weixin.qq.com/doc/subscription/api/apimanage/api_clearquota.html">重置API调用次数</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/cgi-bin/clear_quota")
    JSONObject clearQuota(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    /**
     * <a href="https://developers.weixin.qq.com/doc/subscription/api/apimanage/api_getapiquota.html">查询API调用额度</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/cgi-bin/openapi/quota/get")
    JSONObject getApiQuota(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    /**
     * <a href="https://developers.weixin.qq.com/doc/subscription/api/apimanage/api_getridinfo.html">查询rid信息</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/cgi-bin/openapi/rid/get")
    JSONObject getRidInfo(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    /**
     * <a href="https://developers.weixin.qq.com/doc/subscription/api/apimanage/api_clearquotabyappsecret.html">使用AppSecret重置API调用次数</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/cgi-bin/clear_quota/v2")
    JSONObject clearQuotaByAppSecret(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    /**
     * <a href="https://developers.weixin.qq.com/doc/subscription/api/apimanage/api_clearapiquota.html">重置指定API调用次数</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/cgi-bin/openapi/quota/clear")
    JSONObject clearApiQuota(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    // ========== 自定义菜单 ==========

    /**
     * <a href="https://developers.weixin.qq.com/doc/subscription/api/custommenu/api_createcustommenu.html">创建自定义菜单</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/cgi-bin/menu/create")
    JSONObject createCustomMenu(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    /**
     * <a href="https://developers.weixin.qq.com/doc/subscription/api/custommenu/api_createcustommenu.html">查询自定义菜单信息</a>
     *
     * @param query 查询参数
     * @return 返回体
     */
    @API(api = "https://api.weixin.qq.com/cgi-bin/get_current_selfmenu_info")
    JSONObject getCurrentSelfmenuInfo(Map<String, String> header, Map<String, Object> query);

    /**
     * <a href="https://developers.weixin.qq.com/doc/subscription/api/custommenu/api_getmenu.html">获取自定义菜单配置</a>
     *
     * @param query 查询参数
     * @return 返回体
     */
    @API(api = "https://api.weixin.qq.com/cgi-bin/menu/get")
    JSONObject getMenu(Map<String, String> header, Map<String, Object> query);

    /**
     * <a href="https://developers.weixin.qq.com/doc/subscription/api/custommenu/api_deletemenu.html">删除自定义菜单</a>
     *
     * @param query 查询参数
     * @return 返回体
     */
    @API(api = "https://api.weixin.qq.com/cgi-bin/menu/delete")
    JSONObject deleteMenu(Map<String, String> header, Map<String, Object> query);

    /**
     * <a href="https://developers.weixin.qq.com/doc/subscription/api/custommenu/api_addconditionalmenu.html">创建个性化菜单</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/cgi-bin/menu/addconditional")
    JSONObject addConditionalMenu(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    /**
     * <a href="https://developers.weixin.qq.com/doc/subscription/api/custommenu/api_deleteconditionalmenu.html">删除个性化菜单</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/cgi-bin/menu/delconditional")
    JSONObject deleteConditionalMenu(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

    /**
     * <a href="https://developers.weixin.qq.com/doc/subscription/api/custommenu/api_trymatchmenu.html">测试个性化菜单匹配结果</a>
     *
     * @param query 查询参数
     * @param body  请求体
     * @return 返回体
     */
    @API(method = HttpMethod.POST, api = "https://api.weixin.qq.com/cgi-bin/menu/trymatch")
    JSONObject tryMatchMenu(Map<String, String> header, Map<String, Object> query, Map<String, Object> body);

}
