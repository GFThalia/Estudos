import React from "react";

export class Counter extends React.Component{
    constructor(){
        super();
        console.log("Construindo a classe Counter!");
    }

    render(){
        return(
            <div> 
                <h1> 0</h1>
                <button onClick={() => this.setState({contador: this.state.contador - 1})}>Diminuir</button>
                <button onClick={() => this.setState({contador: this.state.contador + 1})}>Aumentar</button>
            </div>
        )
    }
}