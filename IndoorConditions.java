class IndoorConditions {
    /*@ specification IndoorConditions {
    double initialTemperature;

    alias (double) qs; 

    double airDensity;
    double c;
    double temperature;

   alias airProperties = (temperature, c, airDensity);
   double airVolume;

   double airM;
airM=airVolume*airDensity;

   double tout;

   	double initstate;
		initstate=initialTemperature; 
	double state, nextstate, finalstate;
		state, temperature,  c, airM, qs-> nextstate {compute};
		state = tout;
    }@*/

double compute(double indoorT, double outdoorT, double capacity, double mass, double[] qs) {
	double t=0;
	double qtotal=0;
for ( int i = 0; i < qs.length; i++ ) {
	qtotal+=qs[i];
System.out.println(qs[i]);
}

double deltaT=(60*(qtotal)/(mass*capacity));
System.out.println(indoorT+" "+deltaT+ " "+qtotal);
	t=indoorT+deltaT;


return t;
}
 
}
