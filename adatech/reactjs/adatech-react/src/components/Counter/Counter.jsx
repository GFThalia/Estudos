import React from "react";

export class Counter extends React.Component{
constructor(){
    super();
    //this.contador = 0;
    this.state = { contador: 0 }
}

    render(){
        return(
            <div style={{marginTop: '20px', marginLeft:'20px'}} >
                <h1> {this.state.contador}</h1>
                <div> 
                    <button 
                        onClick={() => {
                        //this.contador = this.contador -1;
                        this.setState({contador: this.state.contador -1})
                    }}>Diminuir</button>
                    
                    <button 
                        onClick={() => {
                            //this.contador += 1;
                            this.setState({contador: this.state.contador +1})
                    }}>
                        Aumentar
                    </button>
                </div>
            </div>
        );
    }
}