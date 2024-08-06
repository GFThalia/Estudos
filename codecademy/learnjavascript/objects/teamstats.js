const team = {
    _players: [{
     firstName: 'Pete',
     lastName: 'Steele',
     age: 61
     }, {
     firstName: 'Michael',
     lastName: 'Gira',
     age: 69
     }, {
     firstName: 'Trent',
     lastName: 'Reznor',
     age: 58
    }],
    _games: [{
     opponent: 'Broncos',
     teamPoints: 42,
     opponentPoints: 27
     },{
     opponent: 'Lemur',
     teamPoints: 22,
     opponentPoints: 13
     },{
     opponent: 'Ashton',
     teamPoints: 14,
     opponentPoints: 21
    }],
  
    get players (){
     return this._players;
     },
    get games (){
     return this._games;
     },
  
  
    addPlayer(newFirstName, newLastName, newAge) {
      const player = {
        firstName: newFirstName,
        lastName: newLastName,
        age: newAge,
      };
      this._players.push(player);
    },
  
  
    addGame (newOpponent, newTeamPoints, newOpponentPoints){
      const game = {
        opponnentName : newOpponent,
        myPoints : newTeamPoints,
        oppPoints : newOpponentPoints
      };
      this._games.push(game);
    }
  };
  
  team.addPlayer('Bugs', 'Buuny', 79);
  team.addGame('Titans', 100, 98);
  console.log(team.players);
  console.log(team.games);