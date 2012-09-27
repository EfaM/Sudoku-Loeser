class Spielbrett {

	// Das Spielbrett besteht aus neun Spielfeldern,
	// die nach class "Spielfeld" definiert sind
	//die felder sind "x" "y" "z" "a" "b" "c" geordnet
	// eine Zeile besteht aus 3x "zeile" von Feld
	// eine Spalte besteht aus 3x "spalte" von Feld
	

	var spielbrett = Array[Array[Spielfeld]](Array[Spielfeld](new Spielfeld(),new Spielfeld(),new Spielfeld()), Array[Spielfeld](new Spielfeld(),new Spielfeld(),new Spielfeld()), Array[Spielfeld](new Spielfeld(),new Spielfeld(),new Spielfeld()));

	//Methode: Zeile
	
	def zeile (n:Int):Array[Int]={
		val zeile = new Array[Int](9);
		var count = 0;
		for(i <- 0 to 2){
			for(j <- 0 to 2){
			  zeile (count) = ((spielbrett (i)((n-1)/3)).zeile((n-1)%3))(j);
			  count = count + 1;
			}
		}
		return zeile;
	}
	
	//Methode: Spalte
	
	def spalte (m:Int):Array[Int]={
	  val spalte = new Array[Int](9);
	  var count = 0;
	  for (i <- 0 to 2){
		  for (j <- 0 to 2){
			  spalte (count) = ((spielbrett ((m-1)/3)(i)).spalte((m-1)%3))(j);
			  count = count + 1;
		  }
	  }
	  return spalte;
	  
	}
	
	
	// Methode: x/y - Struktur
	def koor(x:Int, y:Int, zahl:Int):Unit={
		(spielbrett((y-1)/3)((x-1)/3)).feld((x-1)%3)((y-1)%3) = zahl;
	}
	
	
	def init(arr:Array[Array[Int]]):Unit={
	 for (i <- 0 to 8){
	   for (j <- 0 to 8){
		   koor(i+1,j+1,arr(i)(j));
	   }
	 }
	}
	
	
	
	
	
	
	
}