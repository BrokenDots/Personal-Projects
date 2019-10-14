import React, {Component} from "react"

class MemeGenerator extends Component{
    constructor(){
        super()
        this.state = {
            topText : "",
            bottomText : "",
            randomImg:"http://i.imgflip.com/1bij.jpg" ,
            allMemeImages:[]
        }
        this.handleChange = this.handleChange.bind(this) //binding handlechange method
        this.handleClick = this.handleClick.bind(this)
    }
    
    handleChange(event){ //this function fires when we make changes to the input box
        //the things we do inside are unclear to me
        const {name, value} = event.target
        this.setState({ [name]: value })
        
    }
    
    handleClick(event) {
       const randNum = Math.floor(Math.random() * this.state.allMemeImgs.length)
        const randMemeImg = this.state.allMemeImgs[randNum].url
        this.setState({ randomImg: randMemeImg })
    }
    
    componentDidMount(){
        fetch("https://api.imgflip.com/get_memes")
            .then(response => response.json())  //stores respone as a json object
            .then(response => {                 //here we store respone's data new array memes
                const {memes} = response.data
                this.setState({allMemeImages:memes})    //set the state to that array
            })
    }
    
    
    
    render(){
        return(
            <div>
                <form className = "meme-form">
                    <button onClick = {this.handleClick}>GEN</button>
                    <input 
                        name="topText"
                        type = "text"
                        placeholder = "Top Text"
                        value = {this.state.topText}
                        onChange = {this.handleChange}/>
                </form>
                
                <div className="meme">
                    <img src={this.state.randomImg} alt="" />
                    <h2 className="top">{this.state.topText}</h2>
                    <h2 className="bottom">{this.state.bottomText}</h2>
                </div>
                
            </div>
        )
    }
}

export default MemeGenerator