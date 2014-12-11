class OutdoorConditions {
    /*@ specification OutdoorConditions {
	int timeUnit2;
		timeUnit2=60;
   	double temperature;
    	double airDensity;
   	double c;
   	double time;
   	double min;
   	double max;
 time, timeUnit2, min, max-> temperature{compute};
    }@*/

	double compute(double t, double tU, double min, double max){
		double temp;
		//temp=10;
	double average=(min+max)/2;
	double amplitude=0;
	if(max>0){
		amplitude=Math.abs(max)-average;
	} else{
		amplitude=Math.abs(min)-Math.abs(average);
	}
	System.out.println(amplitude+" "+average);

	temp=average+amplitude*Math.sin(14*tU+(t/(4*tU)))+getFluctuation();

	return temp;
}

double getFluctuation(){
//	double fluctuation=Math.random()*3;
double fluctuation=0.0;
return fluctuation;
}
 
}
