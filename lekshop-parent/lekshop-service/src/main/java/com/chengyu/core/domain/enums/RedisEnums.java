package com.chengyu.core.domain.enums;

import lombok.Getter;

/**
 * @title  redis的key
 * @author LeGreen
 * @date   2021/1/6
 */
@Getter
public enum RedisEnums {
	/**
	 * 轮播图缓存key
	 */
	BANNER_KEY("rds-cms-banner"),
	/**
	 * 阿里云短信缓存key
	 */
	ALISMS_KEY("rds-sys-alismsConfig"),
	/**
	 * 七牛云缓存key
	 */
	QINIU_CONFIG_KEY("rds-system-qiniu"),
	/**
	 * 银行配置缓存key
	 */
	BANK_CONFIG_KEY("rds-system-bank"),
	/**
	 * 系统参数缓存key
	 */
	CONFIG_KEY("rds-sys-config"),
	/**
	 * 菜单缓存key
	 */
	MENU_KEY("rds-sys-menu"),
	/**
	 * 验证码缓存key
	 */
	VERIFY_CODE_KEY("rds-sys-message"),
	/**
	 * 微信配置缓存key
	 */
	WX_CONFIG_KEY("rds-sys-weixinConfig"),
	/**
	 * 支付宝缓存key
	 */
	ZFB_CONFIG_KEY("rds-sys-zfbConfig"),
	/**
	 * 码支付缓存key
	 */
	CODE_PAY_CONFIG_KEY("rds-sys-codePayConfig"),
	/**
	 * 认证缓存key
	 */
	APPROVE_CONFIG_KEY("rds-sys-approveConfig"),
	/**
	 * 淘发客缓存key
	 */
	TAOFAKE_CONFIG_KEY("rds-sys-taofakeConfig"),
	/**
	 * V兔工具缓存key
	 */
	VRABBIT_CONFIG_KEY("rds-sys-vrabbitConfig"),
	/**
	 * 小飞象缓存key
	 */
	XIAOFEIXIANG_CONFIG_KEY("rds-sys-xiaofeixiangConfig"),
	/**
	 * 丰巢缓存key
	 */
	FENGCHAO_CONFIG_KEY("rds-sys-fengchaoConfig"),
	/**
	 * 礼品缓存key
	 */
	GIFT_CONFIG_KEY("rds-sys-giftConfig"),
	/**
	 * 淘宝智能助手缓存key
	 */
	TB_ASSISTANT_CONFIG_KEY("rds-sys-tbAssistantConfig"),
	/**
	 * 查电商缓存key
	 */
	CHADIANSHANG_CONFIG_KEY("rds-sys-chadianshangConfig"),
	/**
	 * 订单侠缓存key
	 */
	DINGDANXIA_CONFIG_KEY("rds-sys-dingdanxiaConfig"),
	/**
	 * 京东万象缓存key
	 */
	JDWX_CONFIG_KEY("rds-sys-jdwxConfig"),
	/**
	 * 极光配置缓存key
	 */
	JIGUANG_CONFIG_KEY("rds-sys-jiguangConfig"),
	/**
	 * 会员组缓存key
	 */
	MEMBER_GROUP_KEY("rds-ums-memberGroup"),
	/**
	 * 充值卡缓存key
	 */
	RECHARGE_CARD("rds-config-rechargeCard"),
	/**
	 * 公众号配置缓存key
	 */
	GZH_CONFIG("rds-config-gzh"),
	/**
	 * 电商网站类别缓存key
	 */
	SHOP_CATE("rds-config-shopCate"),
	/**
	 * 商品标签缓存key
	 */
	SHOP_TARGET("rds-config-shopTarget"),
	/**
	 * 已选任务缓存key
	 */
	TASK_CHECKED("rds-task-checked"),
	/**
	 * 待匹配任务缓存key
	 */
	TASK_WAIT_GRAB("rds-task-wait-grab"),
	/**
	 * 微信模板消息
	 */
	WEIXIN_TEMPLATE("rds-sys-weixinTemplate"),
	/**
	 * 第三方
	 */
	THIRD_CONFIG("rds-third-config"),
	/**
	 * 第三方预警
	 */
	THIRD_WARN("rds-third-warn"),
	/**
	 * 接单配置
	 */
	CONFIG_TASK_BUY("rds-ConfigTaskBuy"),
	/**
	 * 绑定买号配置
	 */
	CONFIG_BUYER("rds-ConfigBuyer"),
	/**
	 * 订单配置
	 */
	CONFIG_ORDER("rds-ConfigOrder");

	private final String key;

	RedisEnums(String key){
		this.key = key;
	}
}
