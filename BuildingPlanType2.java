class BuildingPlanType2 {
    /*@ specification BuildingPlanType2 {

double tIndoor;
    double buildingLength;
    double buildingWidth;
    double buildingHeight;
    double windowHeight;
    double windowWidth;
    double flatRoofUValue;
    double wallUValue;
    double windowUValue;
    double floorUValue;
double airVolume;
airVolume= buildingLength* buildingHeight* buildingWidth;

    double airDensity;
    double c;
    double temperature;

   alias airProperties = (temperature, c, airDensity);
	double airM;
		airM=(airVolume)*airDensity;
 double windowArea;
	 windowArea= windowWidth* windowHeight;

double wallArea;
wallArea=(buildingLength*buildingHeight-windowArea)+(buildingLength*buildingHeight)+2*(buildingWidth*buildingHeight);

 double qWindow;
qWindow=windowUValue*windowArea*(tIndoor-temperature);

 double qWalls;
qWalls=wallUValue*wallArea*(tIndoor-temperature);

 double qRoof;
qRoof=flatRoofUValue*(buildingLength*buildingWidth)*(tIndoor-temperature);

 double qFloor;
qFloor=floorUValue*(buildingLength*buildingWidth)*(tIndoor-temperature);




	double dQdT;
dQdT=(-1.0)*(qWindow+qWalls+qRoof+qFloor);






    }@*/


 
}
