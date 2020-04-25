package com.sheziong.bootlaunchdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**统一所有开发人员响应前端请求的返回结果格式，减少前后端开发人员沟通成本，是一种RESTful接口标准化的开发约定。
 * @author zfshe
 * @date 2020/4/25 13:29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AjaxResponse {
    private boolean isOk;// 请求是否处理成功
    private int code;      // 请求响应状态(200， 400， 500)
    private String message; // 请求结果描述信息
    private Object data;   // 请求数据结果

    // 请求成功的响应，不带查询数据（用于删除、修改、新增接口）
    public static AjaxResponse success() {
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setOk(true);
        resultBean.setCode(200);
        resultBean.setMessage("success");
        return resultBean;
    }

    // 请求成功的响应，带有查询数据（用于数据查询接口）
    public static AjaxResponse success(Object data) {
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setOk(true);
        resultBean.setCode(200);
        resultBean.setMessage("success");
        resultBean.setData(data);
        return resultBean;
    }
}
