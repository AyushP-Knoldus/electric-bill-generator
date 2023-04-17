package com.knoldus
import org.scalatest.flatspec.AnyFlatSpec

class TestBill extends AnyFlatSpec{
  "A Bill" should "calculate the bill correctly" in {
    val bill = Bill("1001", "user1", "Delhi", 5062, 5904)
    val expectedBillAmount = 7073.51
    assert(bill.calculateBill() === expectedBillAmount)
  }
  }



