# das-1-2025-2-a
# Design e Arquitetura de Software 1 - 2025/2 Turma A


Espaço



# Configuração do GIT

git config --global user.name "NOME DO USUARIO NO GITHUB"
git config --global user.email "EMAIL DA CONTA DO GITHUB"

# Configuração ao ambiente
- Instalação do Maven

sudo su
apt-get update -y
apt-get upgrade -y
apt-get install maven -y
exit

# Arquitetura de Código

# Aula 04/08
- Princípios de projeto de código
- Padronização de código
- Ocultamento de Informação
- Coesão
- Acoplamento

# Aula 05/08

- SOLID
-      Single Responsibility Principle
-      interface Segregation Principle
-     package br.univille;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Janelinha extends JFrame{

    private JButton botaozinho;
    private Controlador controlador;

    public Janelinha() {
        setTitle("Eu nao acredito");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        botaozinho = new JButton("ME CLICA");
        controlador = new Controlador();
        botaozinho.addActionListener(controlador);

        /*botaozinho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"oi");
            }
        });*/
        
        add(botaozinho);

        setVisible(true);
    }
    public static void main(String[] args) {
        new Janelinha();
    }
}
package br.univille;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controlador implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        meClica();
    }

    private void meClica(){
        JOptionPane.showMessageDialog(null, "NAO ACREDITO");
    }
    
    
}

# Aula 11/08

- SOLID
-     Princípio da inversão de dependências
-     Prefira composição a herança
-     Princípio de Demeter (menor conhecimento)
-     Princípio Aberto/Fechado

# Aula 12/08

- SOLID
-      Princípio Liskov

# 01/09 
# Caracteristicas da Arquitetura
-Requisitos não funcionais

Impossivel atender todos os itens, sempre terá que abrir mão de algo.

# das-1-2025-2-a
# Design e Arquitetura de Software 1 - 2025/2 Turma A


Espaço



# Configuração do GIT

git config --global user.name "NOME DO USUARIO NO GITHUB"
git config --global user.email "EMAIL DA CONTA DO GITHUB"

# Configuração ao ambiente
- Instalação do Maven

sudo su
apt-get update -y
apt-get upgrade -y
apt-get install maven -y
exit

# Arquitetura de Código

# Aula 04/08
- Princípios de projeto de código
- Padronização de código
- Ocultamento de Informação
- Coesão
- Acoplamento

# Aula 05/08

- SOLID
-      Single Responsibility Principle
-      interface Segregation Principle
-     package br.univille;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Janelinha extends JFrame{

    private JButton botaozinho;
    private Controlador controlador;

    public Janelinha() {
        setTitle("Eu nao acredito");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        botaozinho = new JButton("ME CLICA");
        controlador = new Controlador();
        botaozinho.addActionListener(controlador);

        /*botaozinho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"oi");
            }
        });*/
        
        add(botaozinho);

        setVisible(true);
    }
    public static void main(String[] args) {
        new Janelinha();
    }
}
package br.univille;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controlador implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        meClica();
    }

    private void meClica(){
        JOptionPane.showMessageDialog(null, "NAO ACREDITO");
    }
    
    
}

# Aula 11/08

- SOLID
-     Princípio da inversão de dependências
-     Prefira composição a herança
-     Princípio de Demeter (menor conhecimento)
-     Princípio Aberto/Fechado

# Aula 12/08

- SOLID
-      Princípio Liskov

# Revisão de Aulas 25-26/08
# Caracteristicas da Arquitetura
- Requisitos não funcionais

Impossivel atender todos os itens, sempre terá que abrir mão de algo.

# Decisões Estruturais
- Quando decidimos a estutura do nosso Software.

# Principios Do Design
- Mensageria Assincrona
- Mecanismo de mensagem
- Comunicação através dessas mensagens, para manter arquitetura.

# Definir caracteristicas, definir principios = Para Definir Estrutura.

-----------------------------------------------------------------------------
# 01/09

Arquiteto deve estabelecer as decisões que quer tomar de acordo com projeto, um arquiteto mais experiente tem mais segurança no momento da escolha do framework.
"O segredo para tomar decisões arquiteturais eficienter é perguntar se a decisão da arquitetura esta ajudando a orientar as equipes ao fazerem a escolha tecnica certa ou se a decisão faz a escolha tecnica por elas"

Java cresceu muito e teve muitas melhorias, muitas atualizações acabam dificultando as codificações

Arquiteto precisa de experiencia!!!

Assegurar a conformidade significa que o arquiteto verifica continuamente se as equipes de desenvolvimento seguem as decisões da arquitetura e os principios do design definidos, documentados e comunicados por ele.

- Continuous Deployment Delivery

DevOps

- ... Implantar -> Operar -> Comentarios -> continuos -> planejar -> criar -> integração -> continua -> Implantar ...

