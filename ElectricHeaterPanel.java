class ElectricHeaterPanel {
    /*@ specification ElectricHeaterPanel {
    double heatFlow;
    int signal;
    double dQdT;
	heatFlow, signal -> dQdT{compute};

    }@*/
double compute( double heatFlow, int signal ) {
	double hf=0;
	if(signal==0){
		hf=0.0;
	} else {
	hf=heatFlow;
System.out.println(signal);
}
	
return hf;
    }
 
}
