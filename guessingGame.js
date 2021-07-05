// library to take user input. Need to install
const getInput = require('prompt-sync')(); // npm install promt-sync

for ( let i=0; i < 5;i++) {
  randomNumber = Math.round(Math.random() * 10 + 1) // generates a random number
  userGuess = getInput("What's your guess ? "); // takes user input

// condition to check the user input matches the random number generated
if (userGuess == randomNumber) {
  console.log("You guessed the number correctly!")
  console.log("You guessed " + randomNumber + '\n')
}

else {
  console.log("You are wrong")
  console.log("The correct was " + randomNumber + '\n')
}

}
