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
	double t=0;
	double cost=(price*3600)/3.6e6;
	//0.12 per kW-h, 1 kw-h=3.6e6J


	t=aC+(Math.abs(heatFlow)*cost/60);

return t;
}
}
