class Spielfeld  {

	val feld = Array (Array(0,0,0),Array(0,0,0),Array(0,0,0))

	//Eine Zeile sei: 
	//- alle 3 Werte einer Zeile (n)
	//- die Zeile sei mit dem Buchstaben "n" frei auswählbar
	//-  in einem neuen Array "zeile" abgespeichert

	def zeile (n:Int):Array[Int]={
		val zeile = new Array[Int](3);
		zeile (0) = feld (n)(0);
		zeile (1) = feld (n)(1);
		zeile (2) = feld (n)(2);
		return zeile;
	}

	//Eine Spalte sei:
	// - alle 3 Werte einer Spalte (m)
	// - mit dem Buchstaben "m" frein anwählbar
	// - in einem neuen Array "spalte" abgespeichert
	
	def spalte (m:Int):Array[Int]={
		val spalte = new Array[Int](3);
		spalte (0) = feld (0)(m); 
		spalte (1) = feld (1)(m); 
		spalte (2) = feld (2)(m);
		return spalte;
	}
}
