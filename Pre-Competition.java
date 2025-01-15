//Team Members: Gaige Jones & Gage Hensley
//Date: 1.14.2025
//Program: Pre-Competition
//Hardware: Bolt #SB-2FAE

//Start Program
async function startProgram(){

    //Start & Say Start
    //Bolt will say Start Acrossed the LED's
    //Driver: Gaige Jones
    //Navigator: Gage Hensley
    
        await speak("start", true);
    
            await delay(1);
        await scrollMatrixText('Start', { r: 66, g: 56, b: 255 }, 30, true);
    
    
    
    
    //red
    //bolt led will turn red
    //driver: Gage Hensley
    //Navigator: Gaige Jones
    
        await delay(1);
        setMainLed({ r: 255, g: 0, b: 0 });
    
    //Forward & Turn 90 degrees and forward
    //driver: Gaige Jones
    //Navigator: Gage Hensley

    await delay(1);
    setSpeed(60);
    await delay(2)
    setSpeed(0);
    await roll((getHeading() + 90), 60, 1);
    setSpeed(30);
    await delay(1);
    setSpeed(0);

    //play sound
    //driver: Gage Hensley
    //Navigator: Gaige Jones
     
    //End Program
    }
