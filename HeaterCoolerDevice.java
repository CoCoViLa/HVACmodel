class HeaterCoolerDevice {
    /*@ specification HeaterCoolerDevice {
	int signal;
	double heaterTemperature;
    	double coolerTemperature;
    	double flowRate;
	double c;

	double roomTemperature;
	double heatFlow;
		heaterTemperature,coolerTemperature, roomTemperature, flowRate, c, signal -> heatFlow{compute};
	
	

    }@*/

double compute(double heaterTemperature, double coolerTemperature, double roomTemperature, double flowRate, double c, int signal ) {
	double timeUnit1=3600;//3600 sec in h

	double hf=0;
	if(signal==0){
		hf=0.0;
	} else if(signal==1){
			hf=(heaterTemperature-roomTemperature)*flowRate*timeUnit1*c;
	} else if(signal==-1){
			hf=(coolerTemperature-roomTemperature)*flowRate*timeUnit1*c;
	}
	
return hf;
    }

}
