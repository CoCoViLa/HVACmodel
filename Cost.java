class Cost {
    /*@ specification Cost {
    double price;
	double heatFlow;
	double accCost;

	double initstate;
		initstate=0.0; 
	double state, nextstate, finalstate;

state, price, heatFlow-> nextstate {compute};
		state = accCost;

    }@*/
 double compute(double aC, double price, double heatFlow) {
	double timeUnit1=3600.0;
	double timeUnit2=60.0;
	double t=0;
	double cost=(price/timeUnit2)/3.6e6;
	//0.12 per kW-h, 1 kw-h=3.6e6J


	t=aC+(Math.abs(heatFlow)*cost);
System.out.println("acc cost "+t);


return t;
}
}
