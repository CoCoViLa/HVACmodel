class House {
    /*@ specification House {
	double roomLength;
	double roomWidth;
    	double roomHeight;
	int windows;
   	double windowsHeight;
    	double windowsWidth;
 	double windowsArea;
 	double wallArea;
		windowsArea=windows*windowsHeight*windowsWidth;
 		wallArea=2 * roomLength * roomHeight + 2* roomWidth * roomHeight - windowsArea;

   	double wallK;
    	double wallL;
 	double wallR;
 		wallR=wallL/(wallK*3600*wallArea);
	
	double windowsK;
    	double windowsL;
	double windowsR;
		windowsR=windowsL/(windowsK*3600*windowsArea);
	double req;
		req= wallR*windowsR/(wallR+windowsR);

	double initialTemperature;
    	double c;
    	double outdoorTemperature;
   	double heatFlow;
   	double temperature;
   	double density;
	double airM;
		airM=(roomLength*roomHeight*roomWidth)*density;

	double initstate;
		initstate=initialTemperature; 
	double state, nextstate, finalstate;
		state, outdoorTemperature, req, heatFlow, airM, c-> nextstate {compute};
		state = temperature;



    }@*/
double compute(double rt, double ot, double req, double heatFlow, double airM, double c ) {
	double timeUnit1=3600.0;
	double timeUnit2=60.0;
	double t=0;
heatFlow=0;
double losses=(rt-ot)/req;

	double deltaT=((heatFlow*timeUnit2-losses)/(airM*c));

	t=rt+deltaT;
System.out.println("\t rt="+temperature+"\t hf="+heatFlow+"\t l="+losses+"\t dT="+deltaT);


return t;
}

}
