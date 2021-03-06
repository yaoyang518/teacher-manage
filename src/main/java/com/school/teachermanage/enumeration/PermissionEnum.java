package com.school.teachermanage.enumeration;

/**
 * @author mandy
 * @Date 2017/11/16.
 */
public enum PermissionEnum {
    ADMIN_VIEW,
    //查看管理员
    ADMIN_LIST,
    //管理员列表
    ADMIN_ADD,
    //添加管理员
    ADMIN_LOCK,
    //锁定管理员
    ADMIN_EDIT,
    //编辑管理员
    ROLE_VIEW,
    //查看角色
    ROLE_LIST,
    //角色列表
    ROLE_ADD,
    //添加角色
    ROLE_EDIT,
    //编辑角色
    ROLE_LOCK,
    //锁定角色
    PERMISSION_VIEW,
    //权限查看
    PERMISSION_LIST,
    //权限列表
    PERMISSION_ADD,
    //权限添加
    PERMISSION_LOCK,
    //权限锁定
    PERMISSION_EIDT,
    //权限编辑
    USER_VIEW,
    //查看用户
    USER_EDIT,
    //编辑用户
    USER_ADD,
    //添加用户
    USER_LOCK,
    //锁定用户
    USER_LIST,
    //用户列表
    USER_RECHARGE,
    //用户充值
    USER_PARENT,
    //调整上级
    USER_SCORE,
    //调整积分
    USER_BALANCE,
    //用户充值
    USER_LEVEL_UP,
    //用户升级
    USER_EXPORT,
    //用户导出
    USER_REPLENISH,
    //用户补货操作
    SCORE_LIST,
    //积分列表
    BALANCE_LIST,
    //余额列表
    PERCENT_EDIT,
    //编辑转化率
    LEVEL_EDIT,
    //编辑充值规则
    LEVEL_UP_EDIT,
    //编辑升级规则
    QUALIFICATION_LIST,
    //资格列表
    QUALIFICATION_EDIT,
    //资格升级
    PAYOUT_RECORDS_REFUSE,
    //拒绝用户提现
    PAYOUT_RECORDS_PASS,
    //同意用户提现
    PAYOUT_RECORDS_LIST,
    //用户提现列表
    REPLENISH_PERCENT_EDIT,
    //编辑补货率
    TICKETH_PERCENT_EDIT,
    //编辑消费劵
    TICKETH_PERCENT_LIST,
    //消费劵列表
    BITCOIN_RECORD_LIST,
    //报单积分列表
    BITCOIN_RECORD_ADD,
    //添加报单积分
    REPLENISH_RECORD_LIST
    //补货记录
    ;

}
