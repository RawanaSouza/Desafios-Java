# Desafios-Java-Claro 🚀
Repositório para os desafios de código do Coding The Future Claro - Java com Spring Boot na plataforma DIO.

## 1 - Verificação de Serviço

🔗[VerificacaoServico.java](https://github.com/RawanaSouza/Desafios-Java/blob/main/DesafiosCodigoClaro/src/VerificacaoServico.java)

Este projeto em Java tem como objetivo verificar se um cliente especifico contratou um serviço. A aplicação utiliza a classe Scanner para ler entradas do usuário e compara o serviço informado com a lista de serviços associados ao cliente.

- Solicita ao usuário o nome de um serviço.
- Solicita ao usuário o nome do cliente e uma lista de serviços contratados separados por vírgulas.
- Verifica se o serviço informado está presente na lista de serviços do cliente.
- Informa ao usuário se o serviço foi contratado ou não.

Saída: Deverá retornar "Sim" se o cliente contratou o serviço e "Não" caso contrário.

Exemplos: A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas.

| Entrada | Saída |
|---------|------|
| movel |
  Alice,movel,fixa| Sim |
| fixa
  Bob,movel,tv | Não |
| tv
  Carol,movel,fixa,tv | Sim |


## 2 - Verificação de Combo de Serviços

🔗[Main](https://github.com/RawanaSouza/Desafios-Java/blob/main/DesafiosCodigoClaro/src/Main.java)

Este projeto verifica se um cliente contratou um combo completo de serviços (telefonia móvel, banda larga e TV por assinatura). A aplicação utiliza a classe Scanner para ler entradas do usuário e determinar se todos os serviços necessários foram contratados.

- Solicita ao usuário uma lista de serviços contratados.
- Verifica se a lista inclui todos os três serviços essenciais: móvel, banda larga e TV.
- Informa ao usuário se o combo de serviços está completo ou incompleto.

Saída: Deverá retornar "Combo completo" se o cliente contratou todos os três serviços e "Combo incompleto" caso contrário.

Exemplo: A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas.

| Entrada | Saída |
|---------|-------|
| movel,banda larga,tv | Combo Completo |
| movel, tv | Combo Incompleto |
| banda larga,tv,movel | Combo Completo |

