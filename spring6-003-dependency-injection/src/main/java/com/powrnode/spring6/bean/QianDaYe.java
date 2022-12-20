package com.powrnode.spring6.bean;

import java.util.Arrays;

/**
 * @ClassName : QianDaYe
 * @Author : longzai
 * @Date : 2022/12/5 11:27
 */
public class QianDaYe {
    private String[] aiHaos;

    private Woman[] women;

    public Woman[] getWomen() {
        return women;
    }

    public void setWomen(Woman[] women) {
        this.women = women;
    }

    public String[] getAiHaos() {
        return aiHaos;
    }

    public void setAiHaos(String[] aiHaos) {
        this.aiHaos = aiHaos;
    }

    @Override
    public String toString() {
        return "QianDaYe{" +
                "aiHaos=" + Arrays.toString(aiHaos) +
                ", women=" + Arrays.toString(women) +
                '}';
    }
}
