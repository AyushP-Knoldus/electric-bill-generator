package com.knoldus

case class Bill(accountNumber : String , accountUsername : String , address : String , previousUnit : Int , currentUnit : Int ) {
  def calculateBill() :Double={
      val consumedUnits = currentUnit - previousUnit
    val gstCharge = 0.18
    val totalCharges = {
      if (consumedUnits > 0 && consumedUnits < 250) {
        consumedUnits * 5.25
      }
      else if (consumedUnits > 250 && consumedUnits < 450) {
        250 * 5.25 + consumedUnits - 250 * 6.75
      }
      else {
        (250 * 5.25) + (200 * 6.75) + (consumedUnits - 450) * 8.50
      }
    }
    totalCharges + totalCharges * gstCharge
  }
  }