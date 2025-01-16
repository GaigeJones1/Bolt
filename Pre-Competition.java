
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
    await delay(2);
    setSpeed(0);
    await roll((getHeading() + 90), 60, 1);
    setSpeed(30);
    await delay(1);
    setSpeed(0);

//play sound
//driver: Gage Hensley
//Navigator: Gaige Jones

    await delay(1);
    await Sound.Animal.Monkey.play(true);

//Figure Eight
//Driver: Gaige Jones
//Navigator: Gage Hensley

    await delay(1);
    setMainLed({ r: 0, g: 133, b: 202 });
    await turn(316);
    await rollDistance(316, 35, 4);
    await rollDistance(0, 35, 7);
    await rollDistance(56, 35, 7);
    await rollDistance(79, 35, 7);
    await rollDistance(108, 35, 4);
    await rollDistance(124, 35, 7);
    await rollDistance(194, 35, 7);
    await rollDistance(245, 35, 7);
    await rollDistance(243, 35, 4);
    await rollDistance(216, 35, 7);
    await rollDistance(183, 35, 7);
    await rollDistance(140, 35, 7);
    await rollDistance(118, 35, 7);
    await rollDistance(74, 35, 7);
    await rollDistance(25, 35, 7);
    await rollDistance(354, 35, 7);
    await rollDistance(305, 35, 4);
    await rollDistance(327, 35, 6);
    await comeToStop();
    exitProgram();


    var MIN_SPEED = 5.0;
    var minSpeedSq = MIN_SPEED ** 2;

    async function comeToStop() {
        stopRoll();

        while ((getVelocity().x ** 2) + (getVelocity().y ** 2) > minSpeedSq) {
            await delay(0.025);
        }
    }

    async function turn(heading) {
        setHeading(heading);
        await delay(0.5);
    }

    async function rollDistance(heading, speed, distance) {
        await roll(heading, speed);

        var distanceSq = distance ** 2;
        var startLocation = getLocation();

        while (((getLocation().x - startLocation.x) ** 2) + ((getLocation().y - startLocation.y) ** 2) < distanceSq) {
            await delay(0.025);
        }
    }
    
//Star
//driver: Gaige Jones
//Navigator: Gage Hensley

//End Program
}