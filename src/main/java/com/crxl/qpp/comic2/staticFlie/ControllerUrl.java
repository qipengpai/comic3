package com.crxl.qpp.comic2.staticFlie;

public class ControllerUrl {
    // 查询所有商品
    public static final String GET_PRODUCT_LIST = "/app/get/product";
    // 增加商品
    public static final String ADD_PRODUCT_LIST = "/add/get/product";

    // 定時檢查vip
    // public static final String CHACK_VIP= "/app/Check/vip";

    // 用户上传文件
    public static final String TEXT = "/app";
    // 定時檢查vip
    public static final String CHACK_VIP = "/app/Check/vip";

    // 用户上传文件
    public static final String USER_UPLOD_PORTRACT = "/app/uplod/multipartFile";
    // 用户上传文件(水印)
    public static final String USER_UPLOD_PORTRACT_WATER = "/app/uplod/multipartFile/water";
    // 用户上传文件（更新）
    public static final String USER_UPLOD_PORTRACT_UPDATE = "/app/uplodUpdate/multipartFile";
    // 定时更细数据
    public static final String BACKSUPS_CARTOON_DATA = "/backups/cartoon/data";
    // 平台分享回掉
    public static final String SHARE_BACK = "/app/back/share";
    // 每部漫画分享回掉
    public static final String SHARE_COMIC_BACK = "/app/comic/back/share";
    // 分享公衆號
    public static final String SHARE_WEIXIN = "/get/weixin/fenxiang";

    // APP 发送验证码
    public static final String APP_SEND_REGISTER_CODE = "/send/register/code";
    // 微信登录
    public static final String WEIXINLOGIN = "/servlet/OAuthAPIServlet";
    // APP用户注册
    public static final String USER_REGISTER = "/app/user/register";
    // 忘记密码
    public static final String FORGET_USER_INFO_PWD = "/app/forget/user/pwd";
    // APP用户手机号注册
    public static final String USER_BOND_PHONE = "/app/user/bond/phoneandpwd";
    // 发送验证码
    public static final String SEND_REGISTER_CODE = "/app/send/register/code";
    // 修改密码发送验证码
    public static final String SEND_REGISTER_CODE_UPDATE_PWD = "/app/send/register/code/byupdatepwd";
    // 用户登录
    public static final String USER_LOGIN = "/app/user/login/bypwd";
    // 用户第三方注册&登录
    public static final String USER_LOGIN_BYTHREE = "/app/user/login/bythree";
    // 退出登录
    public static final String USER_LOGIN_OUT = "/app/user/loginout";
    // 用户完善资料
    public static final String USER_PERFECT_INFO = "/app/user/perfect/info";
    // 用户更换头像
    public static final String USER_PERFECT_INFO_HEADPORTRACT = "/app/user/perfect/info/update/headportrait";
    /* 更新用户手机号码 */
    public static final String GET_UPDATE_PHONE = "/app/user/update/phone";
    /* 更新用户信息 */
    public static final String GET_USER_INFO = "/app/user/get/userinfo";
    /* 个人中心获取用户信息 */
    public static final String GET_USER_INFO_BYUSERID = "/qpp/user/get/userinfo/byuserid";

    // 获取banner图
    public static final String GET_BANNER = "/qpp/comic/get/banner";

    // 根据id查询漫画集数
    public static final String GET_CARTOONSET_BYID = "/qpp/comic/get/cartoon/byid";
    // 根据id查询漫画集数>点赞
    public static final String GET_CARTOONSET_BYID_OKCOUNT = "/qpp/comic/bysetid/okcount";
    // 首頁查询漫画列表
    public static final String GET_ALL_CARTOON = "/qpp/comic/get/allcartoon";
    // 查询热门漫画
    public static final String GET_ALL_HOT_CARTOON = "/qpp/comic/get/hot/cartoon";
    // 发现>热门漫画>查看更多>全部
    public static final String GET_ALL_HOT_CARTOON_MORE = "/qpp/comic/get/more/cartoon";
    // 发现>热门漫画>查看更多>热门
    public static final String GET_CARTOON_MORE_HOT = "/qpp/comic/get/more/hot";
    // 发现>热门漫画>查看更多>分类查询
    public static final String GET_CARTOON_MORE_BYTYPE = "/qpp/comic/get/more/bytype";
    // 二级页面查询表头
    public static final String GET_CARTOON_HEAD_BYID = "/qpp/comic/get/cartoon/head";
    // 猜你喜欢
    public static final String GET_CARTOON_LOVE = "/qpp/comic/get/cartoon/love";
    // 漫画详情
    public static final String GET_CARTOONPHOTO_INFO_BYID = "/qpp/comic/get/info";
    // 发现>热门漫画>详细排行榜
    public static final String GET_ALL_CARTOON_RANKING = "/qpp/comic/get/more/cartoon/rankinglist";
    // 发现>热门漫画>排行前三
    public static final String GET_ALL_CARTOON_RANKING_THREE = "/qpp/comic/get/cartoon/rankinglist/three";
    // 发现>得到所有类型
    public static final String GET_ALL_CARTOOMTYPE = "/qpp/comic/get/cartoon/type";

    // 每个漫画集数>看漫画
    public static final String GET_ALL_CARTOON_PHOTO_BYCARTOONSET = "/qpp/comic/get/cartoonphoto";
    // 每个漫画集数>上一划 下一卦
    public static final String GET_ALL_CARTOONPHOTO_BYIDUP = "/qpp/comic/get/cartoonphoto/up/down";
    // 每个漫画集数>購買此集漫畫（不重複購買）
    public static final String BUY_THIS_CARTOONSET = "/qpp/comic/buy/this/cartoonset";
    // 每个漫画集数>看漫画
    public static final String APP_GET_ALL_CARTOON_PHOTO_BYCARTOONSET = "/qpp/app/comic/get/cartoonphoto";
    // 每个漫画集数>上一划 下一卦
    public static final String APP_GET_ALL_CARTOONPHOTO_BYIDUP = "/qpp/app/comic/cartoonphoto/up/down";
    // 每个漫画集数>購買此集漫畫（不重複購買）
    public static final String APP_BUY_THIS_CARTOONSET = "/qpp/app/comic/buy/this/cartoonset";

    // 增加漫画弹幕（发弹幕）
    public static final String ADD_BARRAGE = "/qpp/app/add/comic/barrage";
    // 获取弹幕
    public static final String GET_BARRAGE = "/qpp/app/get/comic/allbarrage";
    // 评论该剧
    // public static final String ADD_CARTOOMCOMMENT =
    // "/qpp/comic/add/allcomment";

    // 获取该剧所有评论
    public static final String GET_ALL_CARTOOMCOMMENT = "/qpp/comic/get/allcomment";
    // 根據id获取评论
    public static final String GET_ALL_CARTOOMCOMMENT_BYID = "/qpp/comic/get/allcomment/byid";
    // 评论该剧
    public static final String ADD_CARTOOMCOMMENT = "/qpp/comic/add/allcomment";
    // 查看評論的所有評論
    public static final String GET_ALL_CARTOOMCOMMENTSET = "/qpp/comic/get/comment/allcomment";
    // 評論 評論
    public static final String ADD_CARTOOMCOMMENTSET = "/qpp/comic/add/comment/comment";
    // 点赞
    public static final String ADD_CARTOOMCOMMENT_OK = "/qpp/comic/add/okcount";

    // 获取该话所有评论
    public static final String GET_ALL_CARTOOMCOMMENT_SON = "/qpp/comic/get/allcomment/son";
    // 根據id获取评论
    public static final String GET_ALL_CARTOOMCOMMENT_SON_BYID = "/qpp/comic/get/allcomment/son/byid";
    // 评论该话
    public static final String ADD_CARTOOMCOMMENT_SON = "/qpp/comic/add/allcomment/son";
    // 查看評論的所有評論
    public static final String GET_ALL_CARTOOMCOMMENTSET_SON = "/qpp/comic/get/comment/allcomment/son";
    // 評論 評論
    public static final String ADD_CARTOOMCOMMENTSET_SON = "/qpp/comic/add/comment/comment/son";
    // 点赞
    public static final String ADD_CARTOOMCOMMENT_OK_SON = "/qpp/comic/add/son/okcount";

    // app>詳情>关注漫画
    public static final String FOLLOW_CARTOON = "/qpp/comic/follow/cartoon";
    // app>書架 >我的書架我的書架取消关注漫画
    public static final String CANCEL_FOLLOW_CARTOON = "/qpp/comic/cancel/follow/cartoon";
    // app>書架 >我的書架
    public static final String GET_MY_FOLLOW_CARTOON = "/qpp/comic/get/myBookshelf";
    // app>更新提醒
    public static final String GET_MY_FOLLOW_CARTOON_NEWS = "/qpp/comic/get/myBookshelf/news";

    // app>搜索页面初始化
    public static final String GET_SEARCH_INITIALIZATION = "/app/search/initialization";
    // app>搜索页面历史
    public static final String GET_SEARCH_HIS_INITIALIZATION = "/app/search/initialization/his";
    // app>搜索
    public static final String GET_SEARCH = "/app/search";

    // app>個人中心>歷史紀錄
    public static final String GET_HISTORY_RECORD = "/qpp/comic/get/myhistoryRecord";
    // app>個人中心>我的朋友圈
    public static final String GET_MY_ALL_FRIENDSCIRCLE_INFO = "/qpp/comic/get/my/allfriendcircle";
    // app>個人中心>意見反饋
    public static final String ADD_FEEDBACK_INFO = "/qpp/comic/add/my/feedback";
    // app>個人中心>我的消息
    public static final String USER_MY_SENDCODE = "/qpp/comic/get/allNews232";
    // app>個人中心>我的订单
    public static final String USER_MY_ORDER = "/qpp/comic/get/allorder232";
    // app>续看
    public static final String GET_GOON_HISTORY_RECORD = "/qpp/comic/get/goon/myhistoryRecord";

    // app>混圈>发布朋友圈
    public static final String RELEASE_FRIENDSCIRCLE_INFO = "/qpp/comic/release/friendcircle";
    // app>混圈>删除朋友圈
    public static final String DELETE_FRIENDSCIRCLE_INFO = "/qpp/comic/delete/friendcircle/byid";
    // app>混圈>查看广场朋友圈>最新
    public static final String GET_ALL_FRIENDSCIRCLE_INFO = "/qpp/comic/get/allfriendcircle";
    // app>混圈>查看评论
    public static final String GET_ALL_FRIENDS_CARTOONCOMMENTSET = "/qpp/comic/get/this/comments";
    // app>混圈>评论该条朋友圈
    public static final String COMMENT_FRIENDS_CARTOONCOMMENT = "/qpp/comic/comment/friendsCircle/";
    // app>混圈>发表评论
    public static final String RELEASE_FRIENDSCIRCLE_COMMENT = "/qpp/comic/release/friendscomment";
    // app>混圈>点赞朋友圈
    public static final String ADD_FRIENDSCIRCLE_VERYOK = "/qpp/comic/add/friendscomment/veryOk";
    // app>混圈>根據id查看朋友圈
    public static final String GET_ALL_FRIENDSCIRCLE_INFO_BYID = "/qpp/comic/get/friendscomment/Byid";
    // app>朋友圈>查看评论> 根據id查詢朋友圈
    public static final String UPLOD_TOKEN = "/qpp/comic/uplod/token";

    // H5>个人中心>生成任务
    public static final String ADD_CARTOONTASK = "/qpp/comic/add/cartoon/task";
    // app>个人中心>生成任务
    public static final String ADD_CARTOONTASK_APP = "/qpp/app/comic/add/cartoon/task";
    // app>个人中心> 查询用户任务根据userId(用户登录时展示任务页面)
    public static final String GET_CARTOON_TASK = "/qpp/comic/get/cartoon/task/byuserid";
    // app>个人中心> 用户签到
    public static final String GET_CARTOON_SIGN_AWARD = "/qpp/comic/get/cartoon/sign/award";
    // app>个人中心> 领奖
    public static final String GET_CARTOON_RECHARGE_AWARD = "/qpp/comic/get/cartoon/task/award/byuserid";
    // // app>个人中心> 每日分享领奖
    // public static final String GET_CARTOON_DAY_SHARE_AWARD =
    // "/qpp/comic/get/cartoon/task/byuserid";
    // // app>个人中心> 每日分享漫画领奖
    // public static final String GET_CARTOON_SHARECARTOON_AWARD=
    // "/qpp/comic/get/cartoon/task/byuserid";
    // // app>个人中心> 绑定手机领奖
    // public static final String GET_CARTOON_BOAND_PHONE_AWARD =
    // "/qpp/comic/get/cartoon/task/byuserid";
    // // app>个人中心> 关注公众号领奖
    // public static final String GET_CARTOON_FOLLOW_AWARD =
    // "/qpp/comic/get/cartoon/task/byuserid";

	/* 后台管理cui */

    /* 验证码获取 */
    public static final String VALIDATECODE = "/qpp/comic/ValidateCodeServlet";
    // 管理员注册
    public static final String ADD_ADMIN = "/qpp/comic/add/admin";
    // 管理员登录
    public static final String LOGIN_ADMIN = "/qpp/comic/login/admin";
    // 管理员验证
    public static final String GET_ADMIN = "/qpp/comic/login/adminYan";
    // 管理员修改密码
    public static final String UPDATE_ADMINPWD = "/qpp/comic/update/adminPwd";
    /* 管理员退出 */
    public static final String ADMIN_LOGOUT = "/qpp/comic/admin/logout";

    // 增加漫画
    public static final String ADD_CARTOON_LIANJIE = "/qpp/comic/add/cartoon/lianjie";
    // 增加漫画
    public static final String ADD_CARTOON = "/qpp/comic/add/cartoon";
    // 删除漫画
    public static final String DELETE_CARTOON = "/qpp/comic/delete/cartoon";
    // 修改漫画
    public static final String UPDATE_CARTOON = "/qpp/comic/update/cartoon";
    // 查询漫画(分页)
    public static final String SELECT_CARTOON = "/qpp/comic/select/cartoon";
    // 查询漫画ID
    public static final String SELECT_CARTOONBYID = "/qpp/comic/select/cartoonById";
    // 查询漫画（用于增加Banner图）
    public static final String SELECT_CARTOONADDBANNER = "/qpp/comic/select/cartoonAddBanner";

    // 增加某个漫画类型
    public static final String ADD_CARTOONALLTYPE = "/qpp/comic/add/cartoonAllType";
    // 查询某个漫画的所有类型
    public static final String SELECT_CARTOONALLTYPE = "/qpp/comic/select/cartoonAllType";

    // 增加漫画类型
    public static final String ADD_CARTOONTYPE = "/qpp/comic/add/cartoonType";
    // 修改漫画类型
    public static final String UPDATE_CARTOONTYPE = "/qpp/comic/update/cartoonType";
    // 查询漫画类型（id查询）
    public static final String SELECT_CARTOONTYPEID = "/qpp/comic/select/cartoonType";
    // 查询所有漫画类型
    public static final String ALLSELECT_CARTOONTYPE = "/qpp/comic/Allselect/cartoonType";
    // 删除漫画类型
    public static final String DELETE_CARTOONTYPE = "/qpp/comic/delete/cartoonType";

    // 增加话
    public static final String ADD_CARTOONSET = "/qpp/comic/add/cartoonSet";
    // 增加话时自增话的标题（用户体验度）
    public static final String ADD_CARTOONSETADDTITILE = "/qpp/comic/add/cartoonSetTitile";
    // 修改话
    public static final String UPDATE_CARTOONSET = "/qpp/comic/update/cartoonSet";
    // 删除话
    public static final String DATELE_CARTOONSET = "/qpp/comic/datele/cartoonSet";
    // 查询话
    public static final String SELECT_CARTOONSET = "/qpp/comic/select/cartoonSet";
    // 查询话根据Id
    public static final String SELECT_CARTOONSETBYID = "/qpp/comic/selectById/cartoonSet";
    // 全部上线话（下线）
    public static final String UPDATE_CARTOONSETALLSTATE = "/qpp/comic/update/cartoonSetAllWatchState";

    // 增加话的图片内容
    public static final String ADD_CARTOONPHOTO = "/qpp/comic/add/cartoonPhoto";
    // 查询话的所有图片
    public static final String SELECT_CARTOONPHOTO = "/qpp/comic/select/cartoonPhoto";
    // 修改话的图片
    public static final String UPDATE_CARTOONPHOTOBYID = "/qpp/comic/update/cartoonPhotoById";
    // 查询下一话（上一话）图片
    public static final String SELECT_CARTOONPHOTO_UPANDDOWN = "/qpp/comic/select/cartoonPhotoUpAndDown";

    // 查询用户的信息
    public static final String SELECT_USERENTITY = "/qpp/comic/select/userEntity";

    // 增加漫画Banner图
    public static final String ADD_BANNER = "/qpp/comic/add/banner";
    // 删除漫画Banner图
    public static final String DELETE_BANNER = "/qpp/comic/delete/banner";
    // 修改漫画Banner图
    public static final String UPDATE_BANNER = "/qpp/comic/update/banner";
    // 查询Banner图
    public static final String SELECT_BANNER = "/qpp/comic/select/banner";
    // 查询Banner图（id）
    public static final String SELECT_BANNERBYID = "/qpp/comic/select/bannerById";

    // 查询用户反馈表
    public static final String SELECT_FEEDBACK = "/qpp/comic/select/feedBack";

    // 增加消息
    public static final String ADD_NEWS = "/qpp/comic/add/news";
    // 删除消息
    public static final String DELETE_NEWS = "/qpp/comic/delete/news";
    // 修改消息
    public static final String UPDATE_NEWS = "/qpp/comic/update/news";
    // 查询消息（id）
    public static final String SELECT_NEWSBYID = "/qpp/comic/select/newsById";
    // 查询消息
    public static final String SELECT_NEWS = "/qpp/comic/select/news";

    // 查询用户订单(充值咔咔豆订单)
    public static final String SELECT_USERORDER = "/qpp/comic/select/userOrder";

    // 查询用户用咔咔豆购买漫画订单
    public static final String SELECT_MALLCARTOONORDER = "/qpp/comic/select/mallCartoonOrder";
    // 查询用户用咔咔豆购买漫画流水
    public static final String SELECT_MALLCARTOONORDER_MONEYWATER = "/qpp/comic/select/mallCartoonOrderMoneyWater";

    // 对漫画评论查询
    public static final String SELECT_CARTOONCOMMENT = "/qpp/comic/select/cartoonComment";
    // 对漫画评论修改（用户是否可以看到）
    public static final String UPDATE_CARTOONCOMMENT = "/qpp/comic/update/cartoonComment";
    // 查询漫画评论的评论
    public static final String SELECT_CARTOONCOMMENT_CCOMMENT = "/qpp/comic/select/cartoonCommentAndComment";
    // 修改漫画评论的评论状态
    public static final String UPDATE_CARTOONCOMMENT_CCOMMENT = "/qpp/comic/update/cartoonCommentAndComment";

    // 对话的评论
    public static final String SELECT_CARTOONSETCOMMENT = "/qpp/comic/select/cartoonSetComment";
    // 对话的评论修改（用户是否可以看到）
    public static final String UPDATE_CARTOONSETCOMMENT = "/qpp/comic/update/cartoonSetComment";
    // 对话的评论的评论
    public static final String SELECT_CARTOONSETCOMMENT_COMMENT = "/qpp/comic/select/cartoonSetCommentAndComment";
    // 对话的评论的评论修改
    public static final String UPDATE_CARTOONSETCOMMENT_COMMENT = "/qpp/comic/update/cartoonSetCommentAndComment";

    // 后台查询混圈
    public static final String SELECT_ALL_FRIENDSCIRCLE_INFO = "/qpp/comic/select/adminAllfriendcircle";
    // 修改混圈状态
    public static final String UPDATE_ALL_FRIENDSCIRCLE_STATE = "/qpp/comic/update/adminAllfriendcircleState";
    // 后台查询混圈图片
    public static final String SELECT_ALL_FRIENDSCIRCLE_PHOTO = "/qpp/comic/select/adminAllfriendcirclePhoto";

    // 后台统计用户性别
    public static final String SELECT_USERENTITY_SEX = "/qpp/comic/select/userEntitySexGroupBy";
    // 后台统计粉丝分布(地域)
    public static final String SELECT_USERENTITY_AREA = "/qpp/comic/select/userEntityFansArea";
    // 后台统计粉丝分布(地域列分页)
    public static final String SELECT_USERENTITY_AREA_PAGE = "/qpp/comic/select/userEntityFansAreaPage";
    // 后台统计公众号粉丝分布
    public static final String SELECT_USERENTITY_GONGZHONG = "/qpp/comic/select/userEntityFansGongZhong";
    // 后台公众号各个渠道的咔咔豆收益
    public static final String SELECT_USERENTITY_GONGZHONG_KAKAMONEY = "/qpp/comic/select/gongZhongKaKaMoney";
    // 后台各个漫画咔咔豆收益
    public static final String SELECT_CARTOON_KAKAMONEY = "/qpp/comic/select/cartoonKaKaMoney";
    // 后台各个漫画咔咔豆收益（列分页）
    public static final String SELECT_CARTOON_KAKAMONEY_PAGE = "/qpp/comic/select/cartoonKaKaMoneyPage";
    // 后台查询漫画各个话咔咔豆收益
    public static final String SELECT_CARTOONSET_KAKAMONEY = "/qpp/comic/select/cartoonSetKaKaMoney";
    // 后台查询漫画各个话咔咔豆收益
    public static final String SELECT_CARTOONSET_KAKAMONEY_PAGE = "/qpp/comic/select/cartoonSetKaKaMoneyPage";

    // pc>添加消息
    public static final String ADD_SENDCODE = "/qpp/pc/comic/add/news";
    // 微信登录
    // public static final String GET_ALL_CARTOON = "/servlet/OAuthAPIServlet";
    // 微信登录
    // public static final String WEIXINLOGIN = "/servlet/OAuthAPIServlet";
    // 获取banner图
    // public static final String GET_BANNER = "/qpp/comic/get/banner";
    // 根据id查询漫画
    // public static final String GET_CARTOON_BYID = "/qpp/get/cartoon/byid";
    // 微信登录
    // public static final String GET_ALL_CARTOON = "/servlet/OAuthAPIServlet";

}
