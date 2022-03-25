import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Header from './components/Header/Header';
import Footer from './components/Footer/Footer';
import Home from './components/pages/Home/Home';
import Pacotes from './components/pages/Pacotes/Pacotes';
import Destinos from './components/pages/Destinos/Destinos';
import Contato from './components/pages/Contato/Contato';


ReactDOM.render(
  <React.StrictMode>
    <App />
    <BrowserRouter>
      <Header />
      <Routes>
        <Route path="/" element={<Home />} />
      </Routes>
      <Routes>
        <Route path="/Pacotes" element={<Pacotes />} />
      </Routes>
      <Routes>
        <Route path="/Destinos" element={<Destinos />} />
      </Routes>
      <Routes>
        <Route path="/Contato" element={<Contato />} />
      </Routes>
      <Footer />
    </BrowserRouter>
  </React.StrictMode>,
  document.getElementById('root'),
);
