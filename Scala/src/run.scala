class run {

  def main(args:Array[String]){
    var s = new Spielbrett();
    val arr = Array(Array(1,2,3,4,5,6,7,8,9),
    				Array(1,2,3,4,5,6,7,8,9),
    				Array(1,2,3,4,5,6,7,8,9),
    				Array(1,2,3,4,5,6,7,8,9),
    				Array(1,2,3,4,5,6,7,8,9),
    				Array(1,2,3,4,5,6,7,8,9),
    				Array(1,2,3,4,5,6,7,8,9),
    				Array(1,2,3,4,5,6,7,8,9),
    				Array(1,2,3,4,5,6,7,8,9))
    
    
    s.init(arr);
    s.koor(2, 2, 9);
    println((s.zeile(2))(0) + "-" + (s.zeile(2))(1) + "-" + (s.zeile(2))(2));
  }
}