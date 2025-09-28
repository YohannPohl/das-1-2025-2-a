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

O que que é abstração
>Entender ou resolver um problema, simplificando a realidade ao nosso redor, focando no essencial

Código coeso
>Ele faz um trabalho, porém faz ele bem feito. Harmonia entre elementos.

vazada contínua -> herança
<br>
pontilhada -> implementação
<br>
preenchida contínua -> associação


# Aula 05/08

- SOLID
-      Single Responsibility Principle
-      interface Segregation Principle
-     package br.univille;

Usar a orientação de objetos de maneira correta

*Single Responsibility Principle*
>Aplicação direta da ideia de coesão. Uma classe deve ter apenas uma única responsabilidade e um único motivo para mudar.
* _Isso facilita a manutenção e evita que uma alteração afete outras funcionalidades._

*Open/Closed Principle*
>O código deve estar aberto para extensão, mas fechado para modificação.
* _Você pode adicionar novas funcionalidades sem alterar o código já existente, evitando erros em sistemas estáveis._

*Liskov Substitution Principle*
>Subclasses devem poder ser usadas no lugar da superclasse sem alterar o funcionamento do sistema.
* _Ou seja, heranças devem manter o comportamento esperado, sem quebrar regras da classe pai._

*Interface Segregation Principle*
>É melhor ter muitas interfaces específicas do que uma única interface genérica com muitos métodos.
* _Assim, classes implementam apenas o que realmente usam, mantendo o código mais limpo._

*Dependency Inversion Principle*
>Dependa de abstrações (interfaces) e não de classes concretas.
* _Isso torna o sistema mais flexível, facilitando testes e mudanças sem afetar o restante do código._

### MVC

#### Model
>Representa os dados e regras de negócio. É onde ficam as informações e lógica.
#### View
>Exibe a interface visual para o usuário. É responsável pela apresentação.
#### Controller
>Faz a ponte entre Model e View. Recebe comandos (ações do usuário), processa e atualiza a View e o Model.

## Code Single Responsibility Principle

package br.univille;
 
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

Code Interface Segregation Principle

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

### O que é o principio da inversão de dependencia?
* Ambas as classes devem depender de abstrações que definem o comportamento desejado. Com isso pode-se alterar outras classes sem ter alteração nas demais, desde que a interface permaneça a mesma.

### Herança
* Que uma classe utilize caracteristicas de uma classe pai.

### Demeter
* Tenta evitar variáveis globais para que possa ser utilizado variáveis locais. Visando reduzir o acoplamento entre classes e promover o encapsulamento.


# Aula 12/08

- SOLID
-      Princípio Liskov

### Liskov
* Para manter a herança e a compatibilidade com o pai, codificar o código dos filhos desde que não afete o resto. as subclasses devem se comportar de maneira compatível com a superclasse, permitindo que sejam usadas em qualquer contexto onde a superclasse seja esperada.

## Aula 25/08
### Observer
* É um jeito de um objeto avisar automaticamente outros objetos quando algo muda nele.
1. O publisher mantém uma lista de observers que se inscrevem.
2. Quando o estado do publisher muda, ele notifica todos os observers inscritos.
3. Os observers tem um método que é chamado para reagir à mudança.
4. Isso permite que vários objetos fiquem sincronizados sem ficarem muito acoplados.

## Aula 26/08
#### Cararcteristicas de arquiteturas
* As características de arquitetura são os atributos de qualidade de um sistema, como sua performance, segurança e escalabilidade. Elas definem o "quão bem" o sistema faz o que deve fazer, impactando diretamente a experiência do usuário e a manutenção do software.

#### Decisões arquiteturais
* As decisões arquiteturais são as escolhas mais importantes e difíceis de reverter no design de um sistema. Elas incluem a escolha do estilo de arquitetura (como microsserviços ou monolito), a seleção de tecnologias e a forma como os componentes se comunicam. Essas decisões moldam a estrutura e as características de um sistema.

#### Princípios do design
* Os princípios de design são diretrizes que ajudam a equipe a escrever um código de melhor qualidade, mais limpo e fácil de manter. Eles se aplicam a um nível mais detalhado e guiam a criação de componentes, como as classes. Um exemplo famoso é o SOLID, um conjunto de cinco princípios que promovem um código mais flexível e sustentável.


# 01/09 
#### Caracteristicas de arquitetura
1. Não Funcionais
2. Funcionais

#### Decisão Arquiterual
* Escolhe em que arquitetura irá utilizar, decide qual será suas caracteristircas.

1. Tomar decisões de arquiteturas
2. Analisar continuamente a arquitetura
3. Manter-se atualiado com as ultimas tendencias
4. Assegurar a conformidade com as decisoes

_um arquiteto deve orientear quais tecnologias utilizar, baseando-se no seu conhecimento e sabendo quais as melhores para o desenvolvimento do projeto. Levando em consideração desempenho, escalabilidade ou disponibilidade._

* É o papel do arquitero assegurar que seja desenvolvido utilizando os seus princípios documentados e comunicados por ele.

#### DevOps
>Maneira de entregar valor ao meu cliente mais rápido.

[Introdução a DevOps](https://learn.microsoft.com/pt-br/training/modules/introduction-to-devops/2-what-is-devops?ns-enrollment-type=learningpath&ns-enrollment-id=learn.wwl.az-400-work-git-for-enterprise-devops)

Arquiteto deve estabelecer as decisões que quer tomar de acordo com projeto, um arquiteto mais experiente tem mais segurança no momento da escolha do framework.
"O segredo para tomar decisões arquiteturais eficienter é perguntar se a decisão da arquitetura esta ajudando a orientar as equipes ao fazerem a escolha tecnica certa ou se a decisão faz a escolha tecnica por elas"

Java cresceu muito e teve muitas melhorias, muitas atualizações acabam dificultando as codificações

Arquiteto precisa de experiencia!!!

Assegurar a conformidade significa que o arquiteto verifica continuamente se as equipes de desenvolvimento seguem as decisões da arquitetura e os principios do design definidos, documentados e comunicados por ele.

- Continuous Deployment Delivery

DevOps

- ... Implantar -> Operar -> Comentarios -> continuos -> planejar -> criar -> integração -> continua -> Implantar ...

Impossivel atender todos os itens, sempre terá que abrir mão de algo.

## Aula 02/09 Leitura de Capitulo 2 e resumo.

### Diferença entre Arquitetura e Design

#### Arquitetura
1. Refere-se às decisões mais importantes e de longo prazo sobre o sistema.
2. São as escolhas que têm maior impacto em qualidade, manutenibilidade, escalabilidade, segurança e desempenho.
3. Normalmente envolvem restrições que são difíceis ou custosas de mudar depois.
4. Exemplos:
    * Escolher se o sistema será monolítico, em microsserviços ou em camadas.
    * Definir protocolos de comunicação (REST, gRPC, mensageria).
    * Decidir como dados serão persistidos (SQL, NoSQL, event sourcing).
  
#### Design
1. Refere-se às decisões mais locais, de baixo nível, que podem ser mudadas com mais facilidade.
2. São importantes, mas geralmente não têm impacto estrutural em todo o sistema.
3. Envolvem a organização interna de classes, métodos, módulos e padrões de implementação.
4. Exemplos:
    * Usar um padrão de projeto (Factory, Strategy, Singleton).
    * Estruturar os métodos de uma classe.
    * Nomear variáveis e organizar pacotes.
### Como é a formação do conhecimento de um arquiteto modelo T?

#### Produndidade (barra vertical T)
* O arquiteto deve ter profundidade técnica real em uma ou mais áreas específicas.

* Essa profundidade geralmente vem da experiência prática como desenvolvedor, lidando com detalhes de implementação, padrões de projeto, linguagens e frameworks.

* Exemplos: domínio profundo em bancos de dados relacionais, microsserviços, segurança de aplicações, ou computação em nuvem.

* Essa base técnica sólida dá ao arquiteto credibilidade junto aos desenvolvedores e permite avaliar impactos de decisões.

#### Conhecimento Amplo (barra horizontal T)

* Além da profundidade, o arquiteto precisa ter amplitude de conhecimento sobre muitas disciplinas que afetam a arquitetura:

    * Diferentes estilos arquiteturais (monólito, SOA, microsserviços, orientada a eventos etc.).
    * Processos de desenvolvimento (integração contínua, entrega contínua, testes automatizados).
    * Práticas de infraestrutura (DevOps, containers, observabilidade, escalabilidade).
    * Entendimento de domínio de negócio e das necessidades organizacionais.
    * Habilidades interpessoais: comunicação, negociação, facilitação e liderança técnica.

* Essa amplitude ajuda o arquiteto a transitar entre diferentes áreas e conversar com públicos diversos (devs, gestores, stakeholders de negócio).

#### Síntese do modelo T

* O arquiteto modelo T não é só um especialista profundo nem apenas um generalista superficial.

* Ele combina profundidade em pontos específicos (garantindo que entende os detalhes técnicos) com uma base ampla (que dá visão estratégica e capacidade de integração).

* O livro reforça que esse equilíbrio é essencial, porque arquitetura de software envolve trade-offs: só com profundidade + amplitude o arquiteto consegue tomar decisões conscientes.

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

Anotações

# O Arquiteto de software tem seus quatro pilares principais:

# 1. Arquitetura vs Design

- Arquitetura define a estrutura e as diretrizes de um sistema.

- Design cuida dos detalhes de implementação.

- A separação rígida entre arquitetos e desenvolvedores (modelo tradicional) dificulta a aplicação prática da arquitetura.

- O modelo ideal é colaborativo, com comunicação constante e decisões compartilhadas.

# 2. Amplitude Técnica

- Arquitetos precisam conhecer muitas tecnologias (amplitude), mesmo que sem dominar todas (profundidade).

- A “pirâmide do conhecimento” mostra:

- Topo: o que você sabe bem.

- Meio: o que conhece superficialmente.

- Base: o que nem sabe que existe.

- Arquitetos devem investir no meio da pirâmide, ampliando sua visão de soluções possíveis.

# 3. Análise de Trade-offs

- Arquitetura é sobre fazer escolhas conscientes, equilibrando prós e contras técnicos, operacionais e estratégicos.

- O arquiteto deve avaliar alternativas considerando impactos como desempenho, escalabilidade e manutenção.

# 4. Alinhamento com o Negócio

- Arquitetos precisam entender os objetivos da empresa e transformá-los em decisões técnicas coerentes.

- A arquitetura deve atender ao negócio, não apenas à tecnologia.

- Antipadrão: "Homem das Cavernas Congelado"

- Arquitetos às vezes tomam decisões baseadas em traumas passados e medos antigos, não em fatos atuais.

- É essencial avaliar riscos com realismo, evitar obsessões e manter a mente aberta a novas soluções.

# Aula 08/09

* Um tópico atua como um intermediário de comunicação assíncrona entre quem produz e quem consome eventos. Quem dá o lance envia a informação para o tópico, que funciona como um canal centralizado. Esse tópico então distribui o mesmo evento para diferentes consumidores, como os serviços de capturar, rastrear e analisar lance. Dessa forma, o produtor não precisa conhecer diretamente os consumidores, e cada consumidor pode processar o evento de forma independente. Isso garante desacoplamento, flexibilidade e a possibilidade de vários serviços reagirem ao mesmo evento ao mesmo tempo.

* Na abordagem com filas, o produtor envia mensagens diretamente para cada fila destinada a um consumidor específico. Isso significa que, quem dá o lance precisa enviar o mesmo item três vezes: uma vez para a fila de captura, outra para a fila de rastreamento e outra para a fila de análise. Cada fila é consumida por apenas um serviço, que recebe sua própria cópia da mensagem. O modelo garante isolamento no processamento, mas aumenta o acoplamento, já que o produtor precisa conhecer todos os consumidores e enviar a mensagem individualmente para cada um deles.

* Um trade-off é como uma troca. Quando você escolhe uma solução em arquitetura de software, você ganha algo, mas também perde em outro aspecto. Não existe decisão sem consequência — cada escolha tem um preço.

Por exemplo:

1. Se você escolhe microsserviços, ganha escalabilidade e independência de equipes, mas perde em simplicidade, porque a arquitetura fica mais difícil de gerenciar.

2. Se escolhe um monólito, ganha em facilidade de desenvolvimento e implantação, mas perde em flexibilidade e escalabilidade.
O arquiteto precisa sempre pesar essas trocas e decidir o que é mais importante para aquele sistema e naquele momento.

**trade-off é o equilíbrio entre ganhos e perdas ao tomar uma decisão arquitetural.**

