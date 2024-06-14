package com.wsleli.service;

import com.wsleli.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description: 功能描述
 * @Version: 1.0
 * @Author: Wsleli Wiliams
 * @Date: 2024/06/14 15:59
 */
@Transactional
public interface BookService {
    /**
     * 保存
     *
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 修改
     *
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 按id删除
     *
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 按id查询
     *
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * 查询全部
     *
     * @return
     */
    public List<Book> getAll();
}