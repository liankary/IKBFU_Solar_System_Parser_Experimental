package blackjack_and_hookers //:P

/**
  * Created by geo-b on 09.09.2016.
  */

import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter
import java.io.IOException
import java.io.PrintWriter

import com.pi4j.io.gpio.PinState
import com.pi4j.io.i2c.I2CBus
import com.pi4j.io.i2c.I2CDevice
import com.pi4j.io.i2c.I2CFactory
import com.sun.org.glassfish.gmbal.Description


class devices {

  def Devices: Array[I2CDevice] = new Array[I2CDevice](main.DevAmount)
  def Received_Values: Array[Double] = new Array[Double](main.DevAmount)

  def get_values(req_addr:Int): Int @Description ("(.)(.)") =   //считывает показания I2C датчиков по req_addr и записывает в values
    {                                 // по идее: 0x27

      (0 to main.DevAmount).foreach {
        i:Int =>
        Received_Values{i} = Devices{i}.read(req_addr) // реги
      }

      0
  }


}
