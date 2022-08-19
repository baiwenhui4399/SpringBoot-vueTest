package com.bai.springbootvuetest.repository;

import com.bai.springbootvuetest.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: SpringBoot
 * @description: book方法接口
 * @author: BaiWenHui
 * @create: 2022-08-16 11:27
 */
public interface BookRepository extends JpaRepository<Book,Integer> {
}
