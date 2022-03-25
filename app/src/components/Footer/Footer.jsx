import React from 'react';
import styles from '../Footer/Footer.css';

function Footer () {
  return (
    <footer className="footer">
      <div className={styles.footer} class="copyright">
        {' '}
        © 2022 Dendê Agência de Viagens. Todos os direitos reservados.
      </div>
    </footer>
  );
};

export default Footer;
