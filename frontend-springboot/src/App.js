import axios from 'axios';
import {useState} from "react";

function App() {
    const [Data,setData] = useState([]);

    function handleClick() {
        axios.get('http://localhost:8080/data').then(response => {
            console.log(response.data);
            setData(response.data);
        });
    }

    function   handleClick1() {
        axios.get('http://localhost:8080/').then(response => {
            console.log(response.data);
        });
    }
  return (
    <div className="App">

        <button onClick={handleClick} >Click me</button>
        <button onClick={handleClick1} >Click me</button>

    </div>
  );
}

export default App;
