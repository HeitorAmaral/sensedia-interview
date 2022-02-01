package com.sensedia.interview.services.impl;

import com.sensedia.interview.domain.Order;
import com.sensedia.interview.services.OrderBookService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class OrderBookServiceImpl implements OrderBookService {

  @Override
  public long calculateTotalBuyOrders(List<Order> orderBook) {
    return 0;
  }

  @Override
  public long calculateTotalSellOrders(List<Order> orderBook) {
    return 0;
  }

  @Override
  public double calculateTotalValueOrders(
      List<Order> orderBook) {
    return 0;
  }

  @Override
  public long calculateTotalQuantityOrders(
      List<Order> orderBook) {
    return 0;
  }
}
