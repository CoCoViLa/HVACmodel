class DisplayDN {
    /*@ specification DisplayDN {
	int timeUnit2;
		timeUnit2=60;
	double temperatureDay;
	double temperatureNight;
	int nightBegin;
	int nightEnd;
	double temperature;
	double time; 

	temperatureDay, temperatureNight, time, timeUnit2, nightBegin, nightEnd-> temperature{compute};
    }@*/
	 double compute(double tD, double tN, double time, double tU, double nB, double nE ) {
	 	double temp=0;
		double timeRec=(time/tU)%24;
		if(((timeRec>(nB))&&(timeRec<(24)))||((timeRec>=(0))&&(timeRec<(nE)))){
			temp=tN;
	
		} else{
			temp=tD;
			
		}
		return temp;
	}
}
