//Programmer: Gaige Jones
//Date: 1.8.2025
//Program: Hello World
//Hardware: Bolt #SB-2FAE

async function startProgram() {
	await speak("I am the Tech Giant", true);
	setMainLed({ r: 0, g: 150, b: 105});
	setSpeed(60);
	await delay (2);
	setSpeed(0);

}