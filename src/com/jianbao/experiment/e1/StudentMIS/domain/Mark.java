package com.jianbao.experiment.e1.StudentMIS.domain;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 成绩类
 * 主要记录成绩信息
 */
@Data
public class Mark {
    Map<String,Double> markInfo = new HashMap<String,Double>();
    public Mark(double Chinese,double Math,double English){
        markInfo.put("Chinese",Chinese);
        markInfo.put("Math",Math);
        markInfo.put("English",English);
    }
    public Mark(){
        this(-1,-1,-1);
    }
    public Mark(double Chinese){
        this(Chinese,-1,-1);
    }
    public Mark(double Chinese,double Math){
        this(Chinese,Math,-1);
    }

    @Override
    public String toString() {
        return "{ Chinese:"+markInfo.get("Chinese").toString()+" ,Math:"+markInfo.get("Math").toString()+" ,English:"+markInfo.get("English").toString()+" }";
    }
}
