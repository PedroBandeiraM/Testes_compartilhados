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
        if not(Aluno.alunos):
            print(" -> Não é possível editar, pois não há alunos cadastrados.")
            return
        
        opcao = int(input('''
Escolha uma opção para editar: 
    [1] Nome
    [2] Média
    -> '''))
        
        for aluno in Aluno.alunos:
            if (aluno.nome == identificador) or (aluno.identificador == identificador):
                match (opcao):
                    case 1:
                        aluno.nome = input("\n - Digite o novo nome: ")
                        aluno_escolhido = aluno
                        print(f'''
As informaçõs novas são:
    - Nome: {aluno_escolhido.nome}  
    - Média: {aluno_escolhido.media} ''')
                        return
                    case 2:
                        aluno.media = float(input("\n - Digite a nova média: "))
                        aluno_escolhido = aluno
                        print(f'''
As informaçõs novas são:
    - Nome: {aluno_escolhido.nome}  
    - Média: {aluno_escolhido.media} ''')
                        return
                    case _:
                        input("\n ***Valor incorreto digitado. Pressione ENTER para tentar novamente.")
            
        print(" -> Não é possível editar, pois o aluno não está cadastrado.")
        
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
        if not(cls.alunos):
            print(" -> Não é possível listar, pois não há alunos cadastrados.")
            return
        
        print(f"\n{" ":<3}", f"{" ALUNOS CADASTRADOS ":~^39}\n")
        print(f"{" ":<3}", "-" * 39)
        print(f"{f"| {"ID":^4} | {"Nome":^20} | {"Média":^5} |":^47}")
        print(f"{" ":<3}", "-" * 39)
        for i in range(len(cls.alunos)):
            print(f"{f"| {cls.alunos[i].identificador:^4} | {cls.alunos[i].nome:^20} | {cls.alunos[i].media:^5} |":^47}")
        print(f"{" ":<3}", "-" * 39)


    @classmethod
    def media_turma(cls):
        soma = 0
        for aluno in Aluno.alunos:
            soma += aluno.media
        media = soma / len(Aluno.alunos)

        print(f"\n - A média da turma é: {media}")
