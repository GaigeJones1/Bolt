
//Team Members: Gaige Jones & Gage Hensley
//Date: 1.14.2025
//Program: Pre-Competition
//Hardware: Bolt #SB-2FAE

//Start Program
async function startProgram(){

    //Start & Say Start
    //Bolt will say Start Acrossed the LED's & say it outloud
    //Driver: Gaige Jones
    //Navigator: Gage Hensley
        await speak("start", true);
        await delay(1);
        await scrollMatrixText('Start', { r: 66, g: 56, b: 255 }, 30, true);

    //Green Checkpoint
    //LED's turn Green
    //Driver: Gage Hensley
    //Navigator: Gaige Jones
        await delay(1);
        setSpeed(35);
        await delay(5);
        setSpeed(0);
        setMainLed({ r: 0, g: 255, b: 0 });

    //Sound #1 Checkpoint
    //Bolt makes sound of choice
    //Driver: Gaige Jones
    //Navigator: Gage Hensley
        await delay(1);
        await roll((getHeading() + 90), 35, 1);
        setSpeed(35);
        await delay(2.3);
        setSpeed (0);
        await delay(1);
        await roll((getHeading() + 90), 35, 1);
        setSpeed(35);
        await delay(.8);
        setSpeed (0);
        await delay(1);
        await Sound.Animal.Eagle.play(true);

    //Red Checkpoint
    //LED's turn Red
    //Driver: Gage Hensley
    //Navigator: Gaige Jones
        await delay(1);
        await roll((getHeading() + 37), 35, 1);
        setSpeed(35);
        await delay(1.4);
        setSpeed(0);
        setMainLed({ r: 255, g: 0, b: 0 });
    //Sound #2 Checkpoint
    //Bolt makes sound of choice - update sound
    //Driver: Gaige Jones
    //Navigator: Gage Hensley
      	await delay(1);
      	await roll((getHeading() - 90), 35, 1);
      	await delay(1);
      	setSpeed(35);
      	await delay(.3);
      	setSpeed(0);
      	await delay(1);
      	await roll((getHeading() - 87), 35, 1);
      	await delay(1);
      	setSpeed(35)
      	await delay(1.8)
      	setSpeed(0)
      	await Sound.Animal.Elephant.play(true);

    //Purple Checkpoint
    //LED's turn purple
    //Driver: Gage Hensley
    //Navigator: Gaige Jones

      	await delay(1);
      	await roll((getHeading() + 90), 35, 1);
      	await delay(1);
      	setSpeed(35);
      	await delay(1.1);
      	setSpeed(0);
      	await delay(1);
      	await roll((getHeading() + 45), 35, 1);
      	await delay(1);
      	setSpeed(35);
      	await delay(0.12);
      	setSpeed(0);
	  	  setMainLed({ r: 255, g: 0, b: 255 });

    //Sound #3 Checkpoint
    //Bolt makes sound of choice - update sound
    //Driver: Gaige Jones
    //Navigator: Gage Hensley
	await delay(1);
	await roll((getHeading() - 90), 35, 1);
	setSpeed(35);
	await delay(1);
	setSpeed(0);
	await roll((getHeading() - 90), 35, 1);
	await delay(1);
	setSpeed(35);
	await delay(.6)
	setSpeed(0);
	await Sound.Animal.Horse.play(true); 
    //Blue Checkpoint
    //LED's turn blue
    //Driver: Gage Hensley
    //Navigator: Gaige Jones
	
	
    //Finish & Say finish
    //Bolt will say finished Acrossed the LED's & say it outloud
    //Driver: Gaige Jones
    //Navigator: Gage Hensley
	
    //End Program
    }