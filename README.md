# Checkpoint 2 | Java (2TDSPY)

Este projeto é um sistema de registro e manipulação de brinquedos

## Membros

- Wesley Sena | RM: 558043
- Vanessa Yukari | RM: 558092
- Samara Victoria | RM: 558719
- Vinicius Murtinho | RM: 551151

## Funcionalidades

- **Pesquisa por parâmetros**: Pesquisas feitas pelos parâmetros da classe como `name`, `type`, `classification`;

## Estrutura de Arquivos

### 1. **Model**
Onde estão as classes principais juntamente dos Enums

### 2. **DTO**
Onde ficam as classes que validam o recebimento e envio de dados a partir de Bean Validation:
![image](https://github.com/user-attachments/assets/612a2ebd-f4c9-453f-98a5-90b10e034470)

### 3. **Repository**
Onde estão as classes que definem as operações do banco de dados e onde estão as pesquisas personalizadas além dos métodos CRUD básicos por meio de JpaRepository:
![image](https://github.com/user-attachments/assets/2dd1235a-0922-411a-9ea4-4769df20c722)


### 4. **Service**
Repositório onde está a classe que controla as regras de serviço da classe Toy assim mantendo um padrão e realizando possíveis operações complexas:
![image](https://github.com/user-attachments/assets/9f43860d-80b2-408e-8900-6c491eeec151)

### 5. **Controller**
Repositório onde são realizadas as chamadas HTTP juntamente de todos os seus métodos:
![image](https://github.com/user-attachments/assets/14303bb1-d8cb-403f-acd4-c74e13022729)


## Exemplificações Funcionalidades

### Anotações das classes
Todas as classes foram anotadas utilizando anotações JPA para mapear as classes para tabelas no banco de dados Oracle:
![image](https://github.com/user-attachments/assets/2811f3fe-6571-4e8f-9e93-158a68143aa1)

### Exemplo de JSON

Há duas maneiras de se cadastrar um `Toy` e ambos os JSONs são:

- **Sem a `Store`**:
  {
    "name" : "Barbie Faz Tudo",
    "type" : "BONECA",
    "classification" : "L",
    "size" : 20.0,
    "price" : 149.99
  }

- **Com `Store`**:
          {
            "name": "Lego Batman Batmóvel",
            "type": "LEGO",
            "classification": "MAIS_5",
            "size": 11.8,
            "price": 1499.99,
            "stores": [
                {
                    "name": "ToyStore Paulista",
                    "address": "Avenida Paulista"
                }
            ]
        }

### Saídas

#### Método Post
![image](https://github.com/user-attachments/assets/7c39140e-0661-40f2-b9bf-9ee03ff45650)

#### Método GET
- **GetAll**:
  ![image](https://github.com/user-attachments/assets/7ab58137-4b91-491b-98b4-a45ebb941db6)

- **GetName**:
  ![image](https://github.com/user-attachments/assets/7e3a3697-b22d-48a1-84da-4268678925b9)

- **GetType**:
  ![image](https://github.com/user-attachments/assets/646cd261-b90a-4a02-a8ba-1bb5bc06e642)

- **GetPublic**:
  ![image](https://github.com/user-attachments/assets/84455536-4a44-4985-900d-de21f363c0be)

- **PUT**:
  ![image](https://github.com/user-attachments/assets/32079ce8-260b-4239-a23e-1cbc261acc1c)
  Ele devolve o objeto que era antes da atualização.

- **DELETE**:
  ![image](https://github.com/user-attachments/assets/b39782e9-466d-406a-9528-ec0452827514)


## Como Usar

1. **Configurar do Banco de Dados:**
A configuração do banco de dados deve ser feita no arquivo `application.properties`;

2. **Utilização de endpoints:**
Agora só rodar o projeto e escolher um software para rodar as requisições, como o `Postman` e o `Insomnia`;

