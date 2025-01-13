//Programmer: Gaige Jones
//Date: 1.13.2025
//Program: Sandbox
//Hardware: Bolt #SB-2FAE

async function startProgram() {
	setMainLed({ r: 0, g: 0, b: 255 });
	await speak("SandBox");
    setSpeed(60);
    await delay (3);
    setSpeed(0);
    await roll((getHeading() + 180), 60, 1);
    setSpeed(60);
    await delay (3);
    setSpeed(0);
    setMainLed({ r: 0, g: 60, b: 195});
}