package zhy.com.rainbowweather.network;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 网络请求类
 * Created by zhy on 2018/1/11.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }
}
