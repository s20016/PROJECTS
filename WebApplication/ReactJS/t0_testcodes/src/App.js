import React from 'react'

// Lesson 12 (01-14-2021)
// Basic structure of React Code
class Main extends React.Component {
  constructor (props) {
    super(props)
    // this.state = { items: [1, 2, 3, 4, 5] }   // Method 1
    this.state = { items: [] } // Method 2
  }

  componentDidMount () {
    // const DATA_URI = 'http://localhost:3000/list.json'
    const DATA_URI = 'https://yesno.wtf/api'

    window
      .fetch(DATA_URI)
      .then(res => res.json())
      .then(json => this.setState({ items: json }))
      .catch(error => console.log(error))
  }

  render () {
    // console.log(this.state)
    return <ImageView items={this.state.items} />
  }
}

const ImageView = props => {
  const { image, answer } = props.items
  return (
    <>
      <h1>{answer}k</h1>
      <img src={image} />
    </>
  )
}

// const ListView = props => (
//   <ul>
//     {props.items.map((item, i) => (
//       <li key={i}>{item}</li>
//     ))}
//   </ul>
// )

export default Main
