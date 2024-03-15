package gr.atc.training.greekIsoDate;

public class App {
	
    public static void main( String[] args ) {
       DateProcessor dp = new DateProcessor();
       dp.printGreekDate("19901231T235959Z");
       dp.printGreekDate("19980221T154545Z");
       dp.printGreekDate("20240314T064101Z");
       dp.printGreekDate("19520802T120555Z");
    }
}
