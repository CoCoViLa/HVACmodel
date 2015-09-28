class ONOFFController3Way {
    /*@ specification ONOFFController3Way {
    double hysteresis;
    double setPoint;
    double processValue;
    int signal;
	processValue, setPoint,hysteresis -> signal{compute};

	
    }@*/
int compute(double processValue, double setPoint, double hysteresis) {
	int s=0;
	if((processValue>(setPoint-hysteresis))&&(processValue<(setPoint+hysteresis))){
		s=0;//ready
	} else if(processValue<(setPoint-hysteresis)){
			s=1;//heating
	} else if(processValue>(setPoint+hysteresis)){
			s=-1;//cooling
	}
return s;
}


 
}
