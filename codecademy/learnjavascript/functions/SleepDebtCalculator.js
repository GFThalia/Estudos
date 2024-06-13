const getSleepHours = day => {
    if (day === 'dom'){
      return 8;
    } else if (day === 'seg'){
       return 8;
    } else if (day === 'terca'){
       return 8;
    } else if (day === 'quarta'){
       return 8;
    } else if (day === 'quinta'){
       return 8;
    } else if (day === 'sexta'){
       return 8;
    } else if (day === 'sab'){
       return 8;
    } else if (day === 'dom'){
      return 8;
   }
   };
   
   const getActualSleepHours = () => getSleepHours('dom') + getSleepHours('seg') + getSleepHours('terca') + getSleepHours('quarta') + getSleepHours('quinta') + getSleepHours('sexta') + getSleepHours('sab') + getSleepHours('dom');
   
   const getIdealSleepHours = idealHours => idealHours * 7;
   
   
   const calculateSleepDebt = () => {
     const actualSleepHours = getActualSleepHours();
     const idealSleepHours = getIdealSleepHours(10);
   
    if (actualSleepHours === idealSleepHours){
      console.log('perfect amount of sleep');
    }else if (actualSleepHours > idealSleepHours){
      console.log('You got ' + (actualSleepHours - idealSleepHours) + ' hour(s) more sleep than you needed this week.');
    }else{
      console.log('You got ' + (idealSleepHours - actualSleepHours) + ' hour(s) less sleep than you needed this week. Get some rest.');
    }
   }
   
   calculateSleepDebt();