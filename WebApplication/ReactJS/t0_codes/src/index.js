import React from 'react';
import './index.css';

class Main extends React.Component {
    constructor(props) {
        super(props)
        this.state = {
            items: [
                'Apple',
                'Orange',
                'Pear'
            ]
        }
    }

    render() {
        return (
            <><ListView items={this.state.items} /></>
        )
    }
}

const ListView = props => {
    <ul>
        {props.items.map(item => (
            <Item item={item} />
        ))}
    </ul>
}

const Item = props => <li>{props.item}</li>

export default Main