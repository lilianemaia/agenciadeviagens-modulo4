import React from 'react';
import { Link } from 'react-router-dom';
import '../Header/Header.css';
import '../../index.css';
import Logo from '../../assets/logo.svg';

function Header() {
  return (
    <header className="header">
      <nav className="navbar navbar-default custom">
        <div className="container-fluid men ">
          <Link to="/">
            <img src={Logo} alt="Logo" className="logo" />
          </Link>
          </div>
          <div className="men">
          <div
            class="collapse navbar-collapse justify-content-end"
            id="navbarNavAltMarkup"
          ></div>
          <div class="navbar-nav navbaixa">
            <Link className="nav-item" to="/">
              Home
            </Link>
            <Link className="nav-item" to="/Pacotes">
              Pacotes
            </Link>
            <Link className="nav-item" to="/Destinos">
              Destinos
            </Link>
            <Link className="nav-item" to="/Contato">
              Contato
            </Link>
          </div>
        </div>
      </nav>
    </header>
  );
}

export default Header;
