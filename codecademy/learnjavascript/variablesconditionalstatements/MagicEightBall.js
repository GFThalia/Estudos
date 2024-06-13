let userName = 'Lia';
userName = userName || 'Stranger'; 

userName ? console.log(`Hello, ${userName}!`) : console.log('Hello!');


const userQuestion = 'Is it gonna rain?';
console.log(`${userName}: ${userQuestion}`);

const randomNumber = Math.floor(Math.random() * 8);

let eightBall = '';

switch (randomNumber) {
  case 0:
  eightBall = 'It is certain.';
  break;
  case 1:
  eightBall = 'It is decidely so.';
  break;
  case 2:
  eightBall = 'Reply hazy try again.';
  break;
  case 3:
  eightBall = 'Cannot predict now.';
  break;
  case 4:
  eightBall = 'Do not count on it.';
  break;
  case 5:
  eightBall = 'My sources says no.';
  break;
  case 6:
  eightBall = 'Outlook not so good.';
  break;
  case 7:
  eightBall = 'Signs point yes.';
  break;
  
}

console.log(`Time Traveler: ${eightBall}`);