//Programmer: Gaige Jones
//Date: 1.8.2025
//Program: Hello World
//Hardware: Bolt #SB-2FAE

async function startProgram() {
	await speak("Hello World", true);
	setMainLed({ r: 0, g: 0, b: 255});
	setSpeed(60);
	await delay (2);
	setSpeed(0);

}
