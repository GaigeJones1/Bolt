//Team Members: Gaige Jones & Gage Hensley
//Date: 1.14.2025
//Program: Pre-Competition
//Hardware: Bolt #SB-2FAE

//start program
async function startProgram(){

//Start & Say Start
//Bolt will say Start Acrossed the LED's
//Driver: Gaige Jones
//Navigator: Gage Hensley


    await speak("start", true);
    
        await delay(1);
	await scrollMatrixText('Start', { r: 66, g: 56, b: 255 }, 30, true) 




//red
//bolt led will turn red
//driver: Gage Hensley
//Navigator: Gaige Jones

//Forward & Turn 90 degrees and forward
//driver: Gaige Jones
//Navigator: Gage Hensley

//play sound
//driver: Gage Hensley
//Navigator: Gaige Jones


//end program
}