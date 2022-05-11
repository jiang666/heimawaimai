package com.itheima.takeout.utils;

/**
 * Created by Teacher on 2016/9/2.
 */
public interface Constant {
    // http://localhost:8080/   TakeoutService    /login?username="itheima"&password="bj"
//http://192.168.0.98/TakeoutService/imgs/category/1.png
    String BASEURL="http://192.168.0.98/";
    // 登陆
    String LOGIN="TakeoutService/login";
    // http://192.168.0.98/TakeoutService/home
    String HOME="TakeoutService/home";
    // http://localhost:8080/TakeoutService/goods?sellerId=1
    String GOODS = "TakeoutService/goods";
    //    http://localhost:8080/TakeoutService/address?userId=2163&&&&&&
    String ADDRESS="TakeoutService/address";

    String ORDER = "TakeoutService/order";
    String PAY="TakeoutService/pay";

    // 短信登陆的分类值
    int LOGIN_TYPE_SMS=2;



}
