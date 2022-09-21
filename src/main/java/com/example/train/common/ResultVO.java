package com.example.train.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVO {
    private int code;//状态码
    private String msg;//提示信息
    private Object data;//响应前端的数据
}
