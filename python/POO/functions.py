class Aluno:
    alunos = []
    identificador = 0

    def __init__(self, nome, media):
        Aluno.identificador += 1
        self.identificador = Aluno.identificador
        self.nome = nome
        self.media = media
        Aluno.alunos.append(self)

    @classmethod
    def editar(cls, identificador):
        opcao = input('''
Escolha uma opção para editar: 
    [1] Nome
    [2] Média
    -> ''')
        for aluno in Aluno.alunos:
            if (aluno.nome == identificador) or (aluno.identificador == identificador):
                match (opcao):
                    case 1:
                        aluno.nome = input("Digite o novo nome: ")
                    case 2:
                        aluno.media = int(input("Digite a nova média"))
                    case _:
                        input("\n ***Valor incorreto digitado. Pressione ENTER para tentar novamente.")
            
    @classmethod
    def remover(cls, identificador):
        if not(Aluno.alunos):
            print(" -> Não é possível remover, pois não há alunos cadastrados.")
            return

        for aluno in Aluno.alunos:
            if (aluno.nome == identificador) or (aluno.identificador == identificador):
                print(f" -> O aluno \"{aluno.nome}\" (ID: {aluno.identificador}) foi removido.")
                Aluno.alunos.remove(aluno)
                return
            
        print(" -> Não é possível remover, pois o aluno não está cadastrado.")

    @classmethod
    def listar(cls):
        if not(Aluno.alunos):
            print(" -> Não é possível listar, pois não há alunos cadastrados.")
            return

        print(f"\n{f"| {"ID":^4} | {"Nome":^20} | {"Média":^5} |":^47}")
        print(f"{" ":<3}", "-" * 39)
        for i in range(len(Aluno.alunos)):
            print(f"{f"| {Aluno.alunos[i].identificador:^4} | {Aluno.alunos[i].nome:^20} | {Aluno.alunos[i].media:^5} |":^47}")
