package com.laioffer.laiDelivery.service;


import com.laioffer.laiDelivery.dao.TmpDeliveryOrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.laioffer.laiDelivery.entity.TmpDeliveryOrder;

import java.util.List;

/**
 * @author Hung-Hsi
 * @version 1.0
 * @description: TmpCartService
 * @date 2021/12/29
 */

@Service
public class TmpCartService {
    @Autowired
    private TmpDeliveryOrderDao tmpDeliveryOrderDao;

    public List<TmpDeliveryOrder> getTmpCart() {
        return tmpDeliveryOrderDao.getTmpDeliveryOrder();
    }
}