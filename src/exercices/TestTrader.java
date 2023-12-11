package exercices;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class TestTrader implements Comparable<Trader> {

	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
	    Trader mario = new Trader("Mario", "Milan");
	    Trader alan = new Trader("Alan", "Cambridge");
	    Trader brian = new Trader("Brian", "Cambridge");

	    List<Transaction> transactions = Arrays.asList(
	        new Transaction(brian, 2011, 300),
	        new Transaction(raoul, 2012, 1000),
	        new Transaction(raoul, 2011, 400),
	        new Transaction(mario, 2012, 710),
	        new Transaction(mario, 2012, 700),
	        new Transaction(alan, 2012, 950)
	    );
	    
	 // Q1:  transactions réalisées en 2011 triées par valeur .
	    List<Transaction> tr2011 = transactions.stream()
	    		.filter(tr->tr.getYear()==2011)
	    		.sorted(comparing(Transaction::getValue))
	    		.toList();
	    		tr2011.forEach(System.out::println);
	    
	    
	    		

	    // Q2 : Toutes les villes (sans les doublons)
	    List<String> cities =  transactions.stream()
	    		.map(Transaction::getTrader)   //stream<Trader>
	    		.map(Trader::getCity) //stream<String>
	    		
	    		.distinct()
	    		.toList();
	    
	    cities.forEach(System.out::println);


	    // Q3: les traders résidant à Cambridge triés par name.
	    
	    
	    List<Trader> traders = transactions.stream()
	    		.map(Transaction::getTrader)
	    		.distinct()
	    		.filter(tr->tr.getCity()=="Cambridge")
	    		
	    		.toList();
	    traders.forEach(System.out::println);

	    // Q4: la liste des noms des traders (liste triée).
	    String traderStr ;
	    

	    // Q5: afficher toutes les valeurs des transactions réalisées par les traders résidant à Cambridge.
	/*    transactions.stream()
	        .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
	        .map(Transaction::getValue)
	        .forEach(System.out::println);
*/
	    // Q6: afficher la plus grande valeur de toutes les transaction ;
	    int highestValue ;

	    
	    
	    
	}

	@Override
	public int compareTo(Trader o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
