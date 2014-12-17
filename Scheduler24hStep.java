class Scheduler24hStep {
    /*@ specification Scheduler24hStep {
    int nightBegin;
    int nightEnd;
    double setPointDay;
    double setPointNight;
    double setPoint;
    double time; 
	
setPointDay, setPointNight, time, nightBegin, nightEnd-> setPoint{compute};
    }@*/
	 double compute(double sD, double sN, double time, double nB, double nE ) {
	 	double point=0;
		double tU=60;
		double timeRec=(time/tU)%24;
		if(((timeRec>(nB))&&(timeRec<(24)))||((timeRec>=(0))&&(timeRec<(nE)))){
			point=sN;
	
		} else{
			point=sD;
			
		}
		return point;
	}
    
 
}
