package com.example.elasticsearchblog.entity.mysql;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data   //帮忙省略getter和setter
@Table(name="t_blog")
public class MysqlBlog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String author;

    @Column(columnDefinition = "mediumtext")
    private String content;
    private Date createTime;
    private Date updateTime;

}
