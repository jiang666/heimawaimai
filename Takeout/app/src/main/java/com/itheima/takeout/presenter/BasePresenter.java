package com.itheima.takeout.presenter;

import android.util.Log;

import com.google.gson.Gson;
import com.itheima.takeout.model.dao.DBHelper;
import com.itheima.takeout.model.net.bean.GoodsResponseInfo;
import com.itheima.takeout.model.net.bean.HomeResponseInfo;
import com.itheima.takeout.model.net.bean.ResponseInfo;
import com.itheima.takeout.presenter.api.ResponseInfoAPI;
import com.itheima.takeout.utils.Constant;
import com.itheima.takeout.utils.ErrorInfo;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 业务层公共部分代码封装
 */

public abstract class BasePresenter {
    protected static ResponseInfoAPI responseInfoAPI;
    // 数据库
    // 网络
    protected DBHelper helper;


    public BasePresenter() {

/*        Retrofit.Builder builder = new Retrofit.Builder();
        builder.baseUrl(Constant.BASEURL);
        builder.addConverterFactory(GsonConverterFactory.create());// Gson解析

        Retrofit retrofit = builder.build();*/


        // 第一次初始化完成后，所有子类都可以使用
        if(responseInfoAPI==null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.connectTimeout(20, TimeUnit.SECONDS);//连接超时时间
            builder.readTimeout(20,TimeUnit.SECONDS);//读操作超时时间
            Retrofit retrofit = new Retrofit.Builder()
                    .client(builder.build())
                    .baseUrl(Constant.BASEURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            responseInfoAPI = retrofit.create(ResponseInfoAPI.class);
        }

        helper=DBHelper.getInstance();

    }

    public class CallbackAdapter implements Callback<ResponseInfo>{

        @Override
        public void onResponse(Call<ResponseInfo> call, Response<ResponseInfo> response) {
            Log.e("============","home data " + response.code());
            // 处理回复
            if (response != null && response.isSuccessful()) {
                ResponseInfo info = response.body();
                Log.e("============","home 000");
                if("0".equals(info.code)){
                    // 服务器端处理成功，并返回目标数据
                    Log.e("============","home 111" + info.data);
                    parserData(info.data);
                }else{
                    // 服务器端处理成功，返回错误提示，该信息需要展示给用户
                    // 依据code值获取到失败的数据
                    String msg = ErrorInfo.INFO.get(info.code);
                    failed(msg);
                }

            } else {

                // 联网过程中的异常
            }


        }

        @Override
        public void onFailure(Call<ResponseInfo> call, Throwable t) {
            Log.e("============","联网过程中的异常 " + call.toString()+ "  "+t.getMessage());
            // 联网过程中的异常
        }
    }

    /**
     * home接口返回值
     */
    public class CallbackHomeAdapter implements Callback<HomeResponseInfo>{

        @Override
        public void onResponse(Call<HomeResponseInfo> call, Response<HomeResponseInfo> response) {
            // 处理回复
            if (response != null && response.isSuccessful()) {
                HomeResponseInfo info = response.body();
                String ssss = new Gson().toJson(info.getData());
                //String dddd = new Gson().toJson(info);
                ResponseInfo responseInfo = new ResponseInfo();
                responseInfo.code = "0";
                responseInfo.data = ssss;
                String eeee = new Gson().toJson(responseInfo);
                writeFile("sdcard/touch/eeee.txt", eeee, false);
                Log.e("============","home data = " + eeee );
                parserData(ssss);

            } else {

                // 联网过程中的异常
            }


        }

        @Override
        public void onFailure(Call<HomeResponseInfo> call, Throwable t) {
            Log.e("============","联网过程中的异常 " + call.toString()+ "  "+t.getMessage());
        }

    }

    public class GoodsCallbackAdapter implements Callback<GoodsResponseInfo>{
        @Override
        public void onFailure(Call<GoodsResponseInfo> call, Throwable t) {
            Log.e("============","联网过程中的异常 " + call.toString()+ "  "+t.getMessage());

        }

        @Override
        public void onResponse(Call<GoodsResponseInfo> call, Response<GoodsResponseInfo> response) {
            Log.e("============","home data " + response.code());
            // 处理回复
            if (response != null && response.isSuccessful()) {

                GoodsResponseInfo info = response.body();
                String ssss = new Gson().toJson(info.getData());
                //String dddd = new Gson().toJson(info);
                ResponseInfo responseInfo = new ResponseInfo();
                responseInfo.code = "0";
                responseInfo.data = ssss;
                String eeee = new Gson().toJson(responseInfo);
                writeFile("sdcard/touch/gg.txt", eeee, false);
                Log.e("============","goods data = " + eeee );
                parserData(ssss);
            } else {

                // 联网过程中的异常
            }


        }

    }

    /**
     * 写入本地文件
     * @param filename
     * @param content
     * @param append
     * @return
     */
    public static boolean writeFile(String filename, String content, boolean append) {
        boolean isSuccess = false;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(filename, append));
            bufferedWriter.write(content);
            isSuccess = true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeIO(bufferedWriter);
        }
        return isSuccess;
    }

    public static void closeIO(Closeable... closeables) {
        if (null == closeables || closeables.length <= 0) {
            return;
        }
        for (Closeable cb : closeables) {
            try {
                if (null == cb) {
                    continue;
                }
                cb.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 错误处理
     * @param msg
     */
    protected abstract void failed(String msg);

    /**
     * 解析服务器回复数据
     * @param data
     */
    protected abstract void parserData(String data);
}
