import React from 'react';
import '../Contato/Contato.css';

export default class Contact extends React.Component {
  render() {
    return (
      <>
        <section className="main-container">
          <div className="formulario">
            <h1>Entre em contato conosco!</h1>
            <form
              name="form1"
              id="form1"
              method="post"
              action="/controllers/controllerForm.php"
            >
              <input type="text" name="nome" id="nome" placeholder="Nome:" />
              <input
                type="tel"
                name="telefone"
                id="telefone"
                placeholder="Telefone:"
              />
              <input
                type="email"
                name="email"
                id="email"
                placeholder="Email:"
              />
              <textarea
                name="mensagem"
                id="mensagem"
                placeholder="Mensagem:"
              ></textarea>
              <input type="submit" value="Enviar" />
            </form>
          </div>
        </section>
      </>
    );
  }
}
