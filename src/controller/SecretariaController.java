/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Secretaria;
import view.SecretariaView;
import view.SelecaoPerfilView;

/**
 *
 * @author Camargo
 */
class SecretariaController {

    private Secretaria model;
    private SecretariaView view;

    public SecretariaController() {
    }

    public SecretariaController(Secretaria model, SecretariaView view) {
        this.model = model;
        this.view = view;
        this.view.setVisible(true);
    }

    public void controla() {
        view.getBtnVoltarSelecaoPerfil().addActionListener((ActionEvent actionEvent) -> {
            view.dispose();
            SelecaoPerfilController selecaoPerfilController = new SelecaoPerfilController(new SelecaoPerfilView());
            selecaoPerfilController.controla();
        });
    }

}