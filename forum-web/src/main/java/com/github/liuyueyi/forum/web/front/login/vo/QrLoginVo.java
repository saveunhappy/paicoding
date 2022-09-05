package com.github.liuyueyi.forum.web.front.login.vo;

import lombok.Data;

/**
 * @author YiHui
 * @date 2022/9/5
 */
@Data
public class QrLoginVo {
    /**
     * 验证码
     */
    private String code;

    /**
     * 二维码
     */
    private String qr;

}