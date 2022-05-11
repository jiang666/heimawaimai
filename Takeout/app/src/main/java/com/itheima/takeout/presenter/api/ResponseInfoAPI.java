package com.itheima.takeout.presenter.api;



import com.itheima.takeout.model.net.bean.GoodsResponseInfo;
import com.itheima.takeout.model.net.bean.HomeResponseInfo;
import com.itheima.takeout.model.net.bean.ResponseInfo;
import com.itheima.takeout.utils.Constant;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * 对请求方式和请求参数的封装
 */
public interface ResponseInfoAPI {
    /**
     * 用户登陆:/login?username="itheima"&password="bj"
     */
//    @GET(Constant.PATH+Constant.LOGIN)

    /**
     * 传统方式登陆
     * @param username
     * @param password
     * @return
     */
    @GET(Constant.LOGIN)
    Call<ResponseInfo> login(
            @Query("username")// 参数的名字
                    String username, // 该参数的值
            @Query("password")
                    String password);

    /**
     * 短信验证的登陆
     * @param phone
     * @param type
     * @return
     */
    @GET(Constant.LOGIN)
    Call<ResponseInfo> login(@Query("phone") String phone,
                             @Query("type") int type);

    /**
     * 获取首页数据
     * @return
     */
    @Headers("Content-Type:application/json")
    @GET("TakeoutService/home")
    Call<HomeResponseInfo> home();

    /**
     * 获取首页数据
     * @return
     */
    /*@Headers("Content-Type:application/json")
    @GET("TakeoutService/home")
    Call<ResponseInfo> home();*/

    /**
     * 获取商品数据
     * @param sellerId（商家标识）
     * @return
     */
    /*@GET(Constant.GOODS)
    Call<ResponseInfo> goods(@Query("sellerId") long sellerId);*/

    @GET(Constant.GOODS)
    Call<GoodsResponseInfo> goods();


    @GET(Constant.ADDRESS)
    Call<ResponseInfo> address(@Query("userId") int userId);

    @FormUrlEncoded
    @POST(Constant.ORDER)
    Call<ResponseInfo> creatOrder(@Field("orderOverview") String json);


    @GET(Constant.PAY)
    Call<ResponseInfo> payment(@Query("orderId") String orderId);
    @GET(Constant.ORDER)
    Call<ResponseInfo> orderList(@Query("userId") int userid);
}
