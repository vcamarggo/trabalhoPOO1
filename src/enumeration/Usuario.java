package enumeration;

import view.View;
import controller.GerenciadorMensagemController;
import view.MedicoView;
import view.SecretariaView;

/**
 *
 * @author guest-xc8RJZ
 */
public enum Usuario {

    MEDICO {

                @Override
                public View iniciaController() {
                    return new MedicoView();
                }
            }, SECRETARIA {

                @Override
                public View iniciaController() {
                    return new SecretariaView();
                }
            }, GERENCIADORMENSAGEM {

                @Override
                public View iniciaController() {
                    return new GerenciadorMensagemController();
                }
            };

    public abstract View iniciaController();

}