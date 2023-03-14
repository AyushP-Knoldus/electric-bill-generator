package com.knoldus
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestBill extends AnyFlatSpec with Matchers {
  //"A Bill" should "calculate the bill correctly" in {
  try {
    val bill = Bill("1001", "user1", "Delhi", 5062, 5904)
    val expectedBillAmount = 7073.51
    assert(bill.calculateBill() === expectedBillAmount)
  }
  catch{
    case error: Exception =>
      println("Error in calculating bill" +error.getMessage)
  }
  }



