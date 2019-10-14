import React from "react"
import Conditional from "./Conditional.js"

//this class renders the actual stuff in the component
class CharacterCardComponent extends React.Component{ 
    clickEvent(){                                //this function gets called when clicked
        console.log("the button was clicked")     
    }  
    
    constructor(){
        super()
        this.state = {
            isLoading : true
        }
    }
    
    componentDidMount() {
        fetch("https://swapi.co/api/people/1")
            .then(response => response.json())
            .then(data => console.log(data))
    }
         
    render(){
        return(
            <div>
                {this.state.isLoading? <h1>LOADING</h1>:<Conditional/>}
                <h1>{this.props.cardObj.name}</h1>
                <img src = {this.props.cardObj.imgUrl}/>
                <button onClick = {this.clickEvent}> click me! </button>   
            </div>
        )
    }     
}

//this class renders the CharacterCardComponent which in turn renders the text and image
class MyApp extends React.Component{
    render(){
        return(
            //here we are asing it to render CharacterCard Component and passing it the properties to dispalay
            <CharacterCardComponent         
                cardObj = {{
                    name : "FanArt",
                    imgUrl : "https://i.redd.it/nulcuqfb3up31.jpg"
                }}
            />
        )
    }
}
export default MyApp