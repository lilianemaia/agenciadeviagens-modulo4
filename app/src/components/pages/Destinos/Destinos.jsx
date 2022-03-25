import React from 'react';
import '../Destinos/Destinos.css';

function Destinos() {
  return (
    <section id="destinos" className="destinos">
      <h1 className="destinos-title">Destinos</h1>
      <div className="destinos-cards">
        <div className="card">
          <div className="card-content">
            <h3>Jericoacoara</h3>
            <p>Viva as belezas da Lagoa do Paraiso e da Pedra Furada.</p>
            <form
              name="form1"
              id="form1"
              method="post"
              action="/controllers/controllerForm.php"
            >
              <input type="text" name="destino" id="destino" placeholder="Destino:" />
              <input type="text" name="cidade" id="cidade"
              placeholder="Cidade:"
              />
              <input type="text" name="estado" id="estado"
              placeholder="Estado:"
              />
              <textarea
                name="descicao"
                id="descricao"
                placeholder="Descrição:"
              ></textarea>
              <input type="submit" value="Enviar" />
            </form>
          </div>
        </div>

        <div className="card">
          <div className="card-content">
            <h3>Salvador</h3>
            <p>Conheça as belezas do Pelourinho e do Farol da Barra.</p>
          </div>
          <form
              name="form1"
              id="form1"
              method="post"
              action="/controllers/controllerForm.php"
            >
              <input type="text" name="destino" id="destino" placeholder="Destino:" />
              <input type="text" name="cidade" id="cidade"
              placeholder="Cidade:"
              />
              <input type="text" name="estado" id="estado"
              placeholder="Estado:"
              />
              <textarea
                name="descicao"
                id="descricao"
                placeholder="Descrição:"
              ></textarea>
              <input type="submit" value="Enviar" />
            </form>
        </div>

        <div className="card">
          <div className="card-content">
            <h3>Rio de Janeiro</h3>
            <p>
              Conheça a vista maravilhosa do Cristo Redentor e do Pão de Açúcar.
            </p>
          </div>
          <form
              name="form1"
              id="form1"
              method="post"
              action="/controllers/controllerForm.php"
            >
              <input type="text" name="destino" id="destino" placeholder="Destino:" />
              <input type="text" name="cidade" id="cidade"
              placeholder="Cidade:"
              />
              <input type="text" name="estado" id="estado"
              placeholder="Estado:"
              />
              <textarea
                name="descicao"
                id="descricao"
                placeholder="Descrição:"
              ></textarea>
              <input type="submit" value="Enviar" />
            </form>
        </div>
      </div>
    </section>
  );
}

export default Destinos;
