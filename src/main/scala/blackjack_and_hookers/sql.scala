package blackjack_and_hookers //yeah bitch!

class sql {
  // это самый примитивный интерфейс для коннекта к БД (без файлов и прочего)
  var driver : String = "com.mysql.jdbc.Driver" //встройка-встроечка
  var url: String = "jdbc:mysql://127.0.0.1/mysql" //мускул - на локалхосте (RPi)
  var username: String = "username"
  var password: String = "password"
  //скоро тут будут данные (где моя лодка?)
  var route: String = "" //конфигроут



}