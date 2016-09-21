/**
  * Created by teemo on 02.09.16.
  */



package blackjack_and_hookers //а иди-ка ты со своим wrong declaration..

import java.io.IOException

import com.sun.org.glassfish.gmbal.Description

import scala.util

object main {

  var DevAmount: Int = 0 //без инициализации DevAmount объявляется abstract, если что. ХЗ почему
  def sql = new sql() //линки
  def devices = new devices() //Класс с обработчиком I2c устройств

  def main(args: Array[String]) : Unit = {

    Pafosnoe_ASCII_Logo() //Вывод логотипа

    if (!(args.length > 0)) //Проверка дали ли вообще аргументы (длина массива с ними >0?)
  {
    println("No args given")
    println("")
    println("")
    println("usage: module_platform_scala.jar CFGROUTE=%your_route% N 0xNN  (N is amount of i2c sensors, 0xNN is needed registry address)  " )
    println("")
    System.exit(101)  //остановить прогу, если ей не дали параметры вообще
  }

    if (!(  args{0} . contains("CFGROUTE=/") )) { //Довольно тупая проверка на наличие *nix пути в аргументе

      println("usage: module_platform_scala.jar CFGROUTE=%your_route% N 0xNN  (N is amount of i2c sensors, 0xNN is needed registry address)  " )
       println( "(example: CFGROUTE=/home/$USER/module_config.cfg) ")
      println(" ")
      println(args{0}+" may not be a correct linux path - and probably is not!")
      println(" ")
    } else {  //так, мишура кончилась

      sql.route = args{0}; // запись места где лежит cfg
      println("cfg: "+ args{0})

      this.DevAmount = args{1}.toInt


      if (!(args{2}.contains("0x"))){
        println("warning: "+args{2}+" may not be a registry address..")
      }

    }}




  def Pafosnoe_ASCII_Logo():Unit@Description("Перенес в конец класса, ибо мешанина выходила ^___^ ") = {

    println("")
    println("")
    println("          ``...----:::---...```         ")
    println("       ``..----:::::::::::::--.`        ")
    println("     `.-:::://///////:::::::::::-.`     ")
    println("    .-::////////////////::::::::::-.`   ")
    println(" ``.:///////////::--::::////::::://:.`` ")
    println("``.:////////:-..````````.-://:://///:-.`")
    println("`-:/://///:-.`            `.::/:////::-`")
    println(".:/://///:-`                .-://////::.")
    println(".---::///-`                  `.-:::::/:-")
    println(".```.....``            `````````````...`")
    println("yyss+///--------:://++bite-ossssssoo//:.")
    println("osysyssssssssssssssssssss-my-yyyyyyyyys+")
    println("/osssssssssssooooossyyhhhh-shiny-yyyys+-")
    println("./ossoooooooosssyyyyyyy-metal--ass-sss/`")
    println("``.-++oosssyyyyysssoo+++/:::::::/++++:.`")
    println("    .``.---------..``.--::::::::-..```  ")
    println("   `:+ssoo+++++ooossssssssssyyyyys+-`   ")
    println("    `.:+syyyyssssssssssyyyyyyyys+-` `   ")
    println("        .:+osyssyyyyyyyyyysso/:.    `   ")
    println("         ``.-/+osyyyyyso+/:-``  ")
    println("")
    println("")
    println("SQL Sync module for BFU autonomous energy generation platform.")
    println("")
    println("Software written by Karelin Jurii in autumn of 2016.")
    println("")
    println("")
  }



}








