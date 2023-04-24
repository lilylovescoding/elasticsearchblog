package com.example.elasticsearchblog.repository.mysql;

import com.example.elasticsearchblog.entity.mysql.MysqlBlog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MysqlBlogRepository extends JpaRepository<MysqlBlog, Integer> {

}
