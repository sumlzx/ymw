package cn.boot.ymw.cn.pojo;

import java.io.Serializable;

/**
 * (Result)实体类
 *
 * @author makejava
 * @since 2023-06-08 22:02:11
 */
public class Result implements Serializable {
    private static final long serialVersionUID = -91971518768959670L;
    
    private String stuno;
    
    private String subjectname;
    
    private Integer score;
    
    private Integer age;


    public String getStuno() {
        return stuno;
    }

    public void setStuno(String stuno) {
        this.stuno = stuno;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}

