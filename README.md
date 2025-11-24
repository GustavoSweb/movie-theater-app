# Movie Theater App
Aplicativo desenvolvido para facilitar a compra de ingressos e a gestão das operações de um cinema.
## Arquitetura
Descrição...
### Estrutura de pastas
```bash

movie-theater-app/
├── src/
│   ├
│   │── App.java                     # Ponto de entrada do programa
│   │
│   ├── Model/
│   │   ├── Movie.java                   # Modelo de Filme
│   │   ├── Showing.java                 # Modelo de Sessão
│   │   ├── Ticket.java                  # Modelo de Ingresso
│   │   └── User.java                    # Modelo de Usuário
│   │
│   ├── Repository/
│   │   ├── BaseRepository.java          # Funções genéricas para repositórios
│   │   ├── MovieRepository.java         # Persistência de filmes
│   │   ├── ShowingRepository.java       # Persistência de sessões
│   │   └── TicketRepository.java        # Persistência de ingressos
│   │
│   ├── Controller/
│   │   ├── MovieController.java         # Regras de filme
│   │   ├── ShowingController.java       # Regras de sessão
│   │   ├── TicketController.java        # Regras de ingressos
│   │   └── UserController.java          # Regras de usuário
│   │
│   ├── View/
│   │   ├── MovieView.java               # Interface de menu para filmes
│   │   ├── ShowingView.java             # Interface de menu para sessões
│   │   └── TicketView.java              # Interface de menu de ingressos
│   │
│   ├── Util/
│   │   └── Validator.java               # Regras de validação
│   │
│   ├── Exception/
│   │   ├── FileOperationException.java  # Erros de leitura/gravação
│   │   └── InvalidTicketException.java  # Erros relacionados a ingressos inválidos
│
├── out/                                 # Arquivos compilados
├── README.md                            # Documentação do projeto
├── LICENSE                              # Licença
└── .gitignore                           # Arquivos ignorados pelo Git
