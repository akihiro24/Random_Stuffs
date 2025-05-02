import './App.css';
import {BrowserRouter, Routes, Route} from 'react-router-dom';
import Home from './pages/Home.jsx'
import Club1 from './pages/Club1.jsx'
import Club2 from './pages/Club2.jsx'
import Club3 from './pages/Club3.jsx'

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/club-one" element={<Club1 />} />
        <Route path="/club-two" element={<Club2 />} />
        <Route path="/club-three" element={<Club3 />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
