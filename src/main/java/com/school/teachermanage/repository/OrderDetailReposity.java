package com.school.teachermanage.repository;

import com.school.teachermanage.entity.OrderDetail;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author mandy
 * @Date 2017/11/16.
 */
@Repository
public interface OrderDetailReposity extends PagingAndSortingRepository<OrderDetail,Long>{
}
