import React from "react"

function productComponent(props){
    return(
        <div>
            <h2>{props.productObject.name}</h2>
            <h3>{props.productObject.price}</h3>
            <p>{props.productObject.description}</p>
        </div>
    )
}

export default productComponent