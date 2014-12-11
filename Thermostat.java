class Thermostat {
    /*@ specification Thermostat {
    double tolerance;
    double requiredTemperature;
    double roomTemperature;
    int signal;
	roomTemperature, requiredTemperature,tolerance -> signal{compute};

	
    }@*/
int compute(double roomTemperature,double requiredTemperature, double tolerance) {
	int s=0;
	if((roomTemperature>(requiredTemperature-tolerance))&&(roomTemperature<(requiredTemperature+tolerance))){
		s=0;//ready
	} else if(roomTemperature<(requiredTemperature-tolerance)){
			s=1;//heating
	} else if(roomTemperature>(requiredTemperature+tolerance)){
			s=-1;//cooling
	}
return s;
}
 
}
