package com.powrnode.spring6.bean;

/**
 * @ClassName : MathBean
 * @Author : longZai
 * @Date : 2022/12/6 1:20
 */
public class MathBean {
    private String result;

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "MathBean{" +
                "result='" + result + '\'' +
                '}';
    }
}
