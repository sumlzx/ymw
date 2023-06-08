package cn.boot.ymw.cn.utils;

import java.util.HashMap;
import java.util.List;

public class Rest {

    private Integer code;

    private String msg;

    private Object data;

    private List<Object> list;

    private HashMap<String,Object> map;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public HashMap<String, Object> getMap() {
        return map;
    }

    public void setMap(HashMap<String, Object> map) {
        this.map = map;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Rest{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
