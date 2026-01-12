class Aluno:
    def __init__(self, nome, media):
        self.nome = nome
        self.media = media

    def listar():
        print(f"\n| {"Nome":^15} | {"Média":^5} |")
        print("-" * 27)
        for i in range(len(alunos)):
            print(f"| {alunos[i].nome:^15} | {alunos[i].media:^5} |")

alunos = []

print(f"{" ESCOLINHA DO JAGUNÇO ":=^50}")

while True:
    opcao = int(input('''
Escolha uma opção:                           
    [1] Cadastrar aluno
    [2] Listar alunos cadastrados
    [3] Remover cadastro de aluno
    [4] Editar cadastro de aluno
    [5] Calcular média da turma
    -> '''))

    match (opcao):
        case 1:
            nome = input("\n - Digite o nome do aluno: ")
            media = float(input(" - Digite a média do aluno: "))
            alunos.append(Aluno(nome, media))
        case 2:
            Aluno.listar()
        case 3:
            pass
        case 4:
            pass
        case 5:
            pass
        case _:
            pass
