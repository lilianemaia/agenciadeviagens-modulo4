import React from 'react';
import '../Pacotes/Pacotes.css';
import Jeri from '../../../assets/jeri.jpeg';
import Ssa from '../../../assets/ssa.jpeg';
import Rj from '../../../assets/rj.jpeg';

function Pacotes() {
  return (
    <section id="promocoes" className="promocoes">
      <h1 className="promocoes-title">Conheça nossos pacotes</h1>
      <div className="promocoes-cards">
        <div className="card">
          <div className="card-tag card-tag-top">
            <p>Promoção</p>
          </div>
          <div className="card-tag card-tag-bottom">
            <p>R$ 1450,00</p>
          </div>
          <img className="card-image " src={Jeri} alt="Jericoacoara" />
          <div className="card-content">
            <h1>Pacote Paraíso Jeri</h1>
            <ul>
              <li>
                <i data-feather="coffee"></i>Café da manhã incluso
              </li>
              <li>
                <i data-feather="wifi"></i>Wi-Fi
              </li>
              <li>
                <i data-feather="map"></i>Passeio
              </li>
            </ul>
            <form
              name="form1"
              id="form1"
              method="post"
              action="/controllers/controllerForm.php"
            >
              <input
                type="text"
                name="pacote"
                id="pacote"
                placeholder="Pacote:"
              />
              <input
                number="text"
                name="duracao"
                id="duracao"
                placeholder="Duração:"
              />
              <input
                number="text"
                name="preco"
                id="preco"
                placeholder="Preço:"
              />
              <input type="submit" value="Enviar" />
            </form>
          </div>
        </div>

        <div class="card">
          <div class="card-tag card-tag-top">
            <p>Promoção</p>
          </div>
          <div class="card-tag card-tag-bottom">
            <p>R$ 1390,00</p>
          </div>
          <img class="card-image " src={Ssa} alt="Salvador" />
          <div class="card-content">
            <h1>Pacote Vou ali em Salvador</h1>
            <ul>
              <li>
                <i data-feather="coffee"></i>Café da manhã incluso
              </li>
              <li>
                <i data-feather="wifi"></i>Wi-Fi
              </li>
              <li>
                <i data-feather="map"></i>Passeio incluso
              </li>
            </ul>
            <form
              name="form1"
              id="form1"
              method="post"
              action="/controllers/controllerForm.php"
            >
              <input
                type="text"
                name="pacote"
                id="pacote"
                placeholder="Pacote:"
              />
              <input
                number="text"
                name="duracao"
                id="duracao"
                placeholder="Duração:"
              />
              <input
                number="text"
                name="preco"
                id="preco"
                placeholder="Preço:"
              />
              <input type="submit" value="Enviar" />
            </form>
          </div>
        </div>

        <div class="card">
          <div class="card-tag card-tag-top">
            <p>Promoção</p>
          </div>
          <div class="card-tag card-tag-bottom">
            <p>R$ 1270,00</p>
          </div>
          <img class="card-image " src={Rj} alt="Rio de Janeiro" />
          <div class="card-content">
            <h1>Pacote Rio cidade maravilhosa</h1>
            <ul>
              <li>
                <i data-feather="coffee"></i>Café da manhã incluso
              </li>
              <li>
                <i data-feather="wifi"></i>Wi-Fi
              </li>
              <li>
                <i data-feather="map"></i>Passeio
              </li>
              <form
                name="form1"
                id="form1"
                method="post"
                action="/controllers/controllerForm.php"
              >
                <input
                  type="text"
                  name="pacote"
                  id="pacote"
                  placeholder="Pacote:"
                />
                <input
                  number="text"
                  name="duracao"
                  id="duracao"
                  placeholder="Duração:"
                />
                <input
                  number="text"
                  name="preco"
                  id="preco"
                  placeholder="Preço:"
                />
                <input type="submit" value="Enviar" />
              </form>
            </ul>
          </div>
        </div>
      </div>
    </section>
  );
}

export default Pacotes;
