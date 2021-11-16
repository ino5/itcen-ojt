import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import {BrowserRouter, Routes, Route, NavLink, useParams} from 'react-router-dom';

function Home() {
  return (
    <div>
      <h2>Home</h2>
      Home...
    </div>
  );
}

let contents = [
  { id:1, title:'HTML', description:'HTML is ...'},
  { id:2, title:'JavaScript', description:'JavaScript is ...'},
  { id:3, title:'React', description:'React is ...'},
]

function Topic() {
  let params = useParams();
  console.log('params', params);
  let topic_id = params.topic_id;
  let selected_topic = {
    title: 'Sorry',
    description: 'Not Found'
  };

  for (let i = 0; i < contents.length; i++) {
    if (contents[i].id === Number(topic_id)) {
      selected_topic = contents[i];
      break;
    }
  }

  return(
    <div>
      <h3>{selected_topic.title}</h3>
      {selected_topic.description}
    </div>
  );
}

function Topics() {
  console.log('Topics')
  let list = [];
  for(let i = 0; i < contents.length; i++) {
    list.push(<li key={contents[i].id}><NavLink to={'/topics/'+contents[i].id}>{contents[i].title}</NavLink></li>);
  }
  return (
    <div>
      <h2>Topics</h2>
      <ul>
        {list}
      </ul>
      <Routes>
        <Route path=":topic_id" element={<Topic/>}/>
      </Routes>
    </div>
  );
}

function Contact() {
  return (
    <div>
      <h2>Contact</h2>
      Contact...
    </div>
  );
}

function App() {
  return (
    <div>
      <h1>React Router DOM 예제</h1>
      <ul>
        <li><NavLink to="/">Home</NavLink></li>
        <li><NavLink to="/topics">Topics</NavLink></li>
        <li><NavLink to="/contact">Contact</NavLink></li>
      </ul>
        <Routes>
          <Route path="/" element={<Home/>}/>
          <Route path="/topics/*" element={<Topics/>}/>
          <Route path="/contact" element={<Contact/>}/>
        </Routes>
    </div>
  );
}

ReactDOM.render(<BrowserRouter><App/></BrowserRouter>, document.getElementById('root'));