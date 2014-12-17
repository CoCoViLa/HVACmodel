class RoomType1 {
    /*@ specification RoomType1 {
    double roomLength;
    double roomWidth;
    double roomHeight;
    double windowUvalue;

    double windowArea;
	 windowArea=roomWidth*roomHeight;
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
		state, outdoorTemperature, windowUvalue, windowArea, heatFlow, airM, c-> nextstate {compute};
		state = temperature;



    }@*/
double compute(double rt, double ot, double wU, double wA, double heatFlow, double airM, double c ) {
	double t=0;

	double qL=	wU*wA*(rt-ot);

	double deltaT=(60*(heatFlow-qL)/(airM*c));

	t=rt+deltaT;
//System.out.println("\t rt="+temperature+"\t hf="+heatFlow+"\t l="+qL+"\t dT="+deltaT);


return t;
}

 
}
