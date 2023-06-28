# Documentação do Sistema de Listagem de Afazeres

## Visão Geral
O Sistema de Listagem de Afazeres é uma aplicação web que permite aos usuários gerenciar uma lista de afazeres. Os usuários podem se cadastrar, fazer login, adicionar, editar, excluir e marcar como concluído seus afazeres. A aplicação foi desenvolvida utilizando a arquitetura MVC com Spring Boot, Thymeleaf, JDBC e MySQL.

## Requisitos do Sistema
Para executar a aplicação, certifique-se de ter os seguintes requisitos:

- Java 8 ou superior instalado
- MySQL instalado
- Servidor de aplicação compatível com Spring Boot (por exemplo, Apache Tomcat)

## Configuração do Banco de Dados
O sistema utiliza o MySQL como banco de dados. Siga os passos abaixo para configurar o banco de dados:

1. Crie um banco de dados chamado `listagem_afazeres`.
2. Execute os scripts SQL fornecidos para criar as tabelas `usuario` e `afazer`.

## Configuração da Aplicação
1. Faça o download do código-fonte do Sistema de Listagem de Afazeres.
2. Abra o projeto em sua IDE de preferência.
3. Configure as informações de conexão com o banco de dados no arquivo `application.properties`.
4. Compile e execute a aplicação.

## Funcionalidades do Sistema
O Sistema de Listagem de Afazeres oferece as seguintes funcionalidades:

- Cadastro de Usuário:
    - Os usuários podem se cadastrar fornecendo um nome, email e senha.
    - As informações do usuário são armazenadas no banco de dados.

- Login de Usuário:
    - Os usuários podem fazer login na aplicação utilizando seu email e senha.
    - O sistema valida as credenciais fornecidas e autentica o usuário.

- Gerenciamento de Afazeres:
    - Os usuários autenticados podem adicionar novos afazeres à sua lista.
    - Os afazeres consistem em uma descrição e um status de conclusão.
    - Os usuários podem editar a descrição e o status de conclusão dos afazeres existentes.
    - Os usuários também podem excluir afazeres da lista.
    - Os afazeres são armazenados no banco de dados associados ao usuário correspondente.

## Considerações Finais
O Sistema de Listagem de Afazeres é uma aplicação simples e prática para gerenciar uma lista de afazeres. Com suas funcionalidades de cadastro, login e gerenciamento de afazeres, os usuários podem manter um registro organizado de suas tarefas pendentes.

# Explicação sobre a Arquitetura do Sistema de Listagem de Afazeres
O Sistema de Listagem de Afazeres atualmente é implementado como um monolito, o que significa que todas as funcionalidades são construídas e entregues como um único e grande sistema.

## Monolito
O sistema monolítico tem as seguintes características:

- Acoplamento: Todas as funcionalidades estão intimamente acopladas no mesmo código base. Uma alteração em uma parte do sistema pode afetar outras partes.
- Escalabilidade limitada: O sistema monolítico é dimensionado como um todo. É necessário aumentar a escala de todas as funcionalidades, mesmo que apenas uma delas esteja sobrecarregada.
- Implantação e atualizações complexas: Como um único sistema, todas as partes do monolito precisam ser implantadas e atualizadas em conjunto.
- Manutenção complexa: Com o aumento da complexidade e o acoplamento entre as funcionalidades, a manutenção do sistema pode se tornar desafiadora.

## Arquitetura de Microsserviços
Uma abordagem alternativa seria a adoção de uma arquitetura de microsserviços, na qual cada funcionalidade do sistema seria dividida em serviços independentes que se comunicam entre si. Cada serviço seria responsável por uma única tarefa e teria seu próprio banco de dados e interface de comunicação.

A arquitetura de microsserviços tem as seguintes vantagens:

- Desacoplamento: Cada serviço é autônomo e pode ser desenvolvido, implantado e escalado independentemente. As alterações em um serviço não afetam diretamente os outros.
- Escalabilidade granular: É possível escalar apenas os serviços que estão sobrecarregados, em vez de ter que aumentar a escala de todo o sistema.
- Implantação e atualizações independentes: Os serviços podem ser implantados e atualizados separadamente, permitindo uma entrega mais rápida e eficiente.
- Manutenção simplificada: Com a separação das funcionalidades em serviços independentes, a manutenção e a depuração do sistema se tornam mais gerenciáveis. 

- No caso do Sistema de Listagem de Afazeres, as funcionalidades poderiam ser divididas em microsserviços, como:

- Serviço de Autenticação: Responsável pelo registro, login e autenticação de usuários.
- Serviço de Gerenciamento de Usuários: Lidaria com o cadastro, edição e exclusão de usuários.
- Serviço de Gerenciamento de Afazeres: Responsável pelo gerenciamento da lista de afazeres, incluindo adição, edição, exclusão e marcação de conclusão.

- Cada um desses serviços teria sua própria base de código, banco de dados e interface de comunicação definida (por exemplo, API REST) para se comunicar com outros serviços, se necessário.

Essa arquitetura de microsserviços permitiria escalabilidade e manutenção mais flexíveis e independentes, além de facilitar a evolução e adição de novas funcionalidades no sistema.