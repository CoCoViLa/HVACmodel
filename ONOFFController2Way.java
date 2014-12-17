class ONOFFController2Way {
    /*@ specification ONOFFController2Way {
     double hysteresis;
    double setPoint;
    double processValue;
    int signal;
int initstate, state, nextstate, finalstate;
	initstate=0;
	state, processValue, setPoint,hysteresis -> nextstate{compute};
state=signal;

	
    }@*/
int compute(int sig, double processValue, double setPoint, double tolerance) {
	int s=0;
	if(processValue>(setPoint+hysteresis)){
		s=0;//ready
	} else if(processValue<(setPoint-hysteresis)) {
			s=1;
	}else{
s=sig;
}
	
return s;
 
}}
