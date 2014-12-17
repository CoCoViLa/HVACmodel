class Scheduler24hSin {
    /*@ specification Scheduler24hSin {
    double min;
    double max;
    double maxTime;
    double time;
    double setPoint;

 time, maxTime, min, max-> setPoint{compute};
    }@*/

	double compute(double t, double mT, double min, double max){
		double s;
		double average=(min+max)/2;
	double tU=60;
	double amplitude=0;
	if(max>0){
		amplitude=Math.abs(max)-average;
	} else{
		amplitude=Math.abs(min)-Math.abs(average);
	}
	
	s=average+amplitude*Math.sin(mT*tU+(t/(4*tU)));

	return s;
}
}
