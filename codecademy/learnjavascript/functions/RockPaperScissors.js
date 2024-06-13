console.log("lets play!");

const getUserChoice = userInput =>{
  userInput = userInput.toLowerCase();
  if(userInput === 'rock' || userInput === 'paper'|| userInput === 'scissoros'){
    return userInput;
  }else{
    console.log('error');
  }
  };


const getComputerChoice = () =>{
 const randomNumber =  Math.floor(Math.random()*3);
  switch (randomNumber){
    case 0:
    return 'rock';
    break;
    case 1:
    return 'paper';
    break;
    case 2: 
    return 'scissors';
    break;
  }
}


const determineWinner = (userChoice, computerChoice) => {
  if (userChoice === computerChoice) {
      return 'The game is a tie!';
  }

  if (userChoice === 'rock'){
    if (computerChoice === 'paper'){
     return 'computer win!';
    }else{ 
     return 'user win!';
    }
  }

  if(userChoice === 'papel'){
    if (computerChoice === 'scissors'){
     return 'computer win!';
    }else{
     return 'user win!';
    }
  }

  if(userChoice === 'scissors'){
    if (computerChoice === 'rock'){
     return 'computer win!';
    }else{
     return 'user win!';
    }
}
  
  if (userChoice === 'bomb') {
      return 'You won!';
  }else{
    return 'theres no game!';
  }
}


const playGame = () => {
    const userChoice = getUserChoice('rock');
    const computerChoice = getComputerChoice(); 
    console.log(`user chose: ${userChoice}.`);
    console.log(`Computer chose: ${computerChoice}.`);
    console.log(determineWinner(userChoice, computerChoice));
};

playGame();