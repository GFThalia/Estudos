import React from 'react';
import './styles/App.css';
import {Navbar} from './components/Navbar/Navbar';
import { Article } from './components/Article/Article';

import article1Img from './assets/imagens/articles.png'
import { Counter } from './components/Counter/Counter';


// Compenente em classe é uma classe que herda a classe Component do React,
// e retorna HTML dentro do método render.
class App extends React.Component {


  render(){ 
   return(
    <>
     <Navbar/>
     <Counter/>
     <section id='articles'>
      <Article 
            title='Exemple 1'
            provider='ex1' 
            description='Lorem ipsum dolor sit amet consectetur adipisicing elit. Velit, unde. Quo, maxime mollitia atque quae libero delectus harum pariatur earum sunt nisi natus possimus, iste perferendis deserunt aut voluptas? Aliquid?'
            thumbnail = {article1Img}
         />
         <Article 
            title='Exemple 2'
            provider='ex2' 
            description='Lorem ipsum dolor sit amet consectetur adipisicing elit. Aut earum, eum sunt consequuntur nisi maxime natus unde blanditiis. Quod molestias facilis quos dignissimos repellendus qui alias exercitationem debitis mollitia aspernatur!'
            thumbnail = {article1Img}
         />
         <Article 
            itle='Exemple 3'
            provider='ex3' 
            description='Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolores voluptatibus libero ea est, nihil itaque debitis quasi iusto perferendis vel possimus. Quae vel repellendus quasi laudantium non laborum molestiae doloremque!'
            thumbnail = {article1Img}
         />
      
         <Article 
            title= 'Exemple 4'
            provider='ex4'
            description='Lorem, ipsum dolor sit amet consectetur adipisicing elit. Hic quibusdam, explicabo aperiam minus cum libero molestiae sequi aliquid consequuntur. Fugiat, laborum accusantium! Recusandae, vel modi fuga minus dolorem explicabo animi!'
            thumbnail = {article1Img}
         />

     </section>
    </>
   );
  }
}

export default App;
