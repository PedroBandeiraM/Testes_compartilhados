class Museu:
    def __init__(self):
        self.obras = []
    
    def adicionar(self, obra):
        self.obras.append(obra)

    def remover(self, obra):
        self.obras.remove(obra)

    def listar_obras(self):
        print(f"\n| {"Nome":^15} | {"Data":^6} |")
        print("-" * 28)
        for obra in self.obras:
            print(f"| {obra.nome:^15} | {obra.data:^6} |")
        print()

class Obra:
    def __init__(self, nome, data):
        self.nome = nome
        self.data = data


museu_vasconcelos = Museu()
quadro = Obra("Hamlet", 1947)
escultura = Obra("Michelangelo", 1682)

museu_vasconcelos.adicionar(quadro)
museu_vasconcelos.adicionar(escultura)

museu_vasconcelos.listar_obras()

museu_vasconcelos.remover(quadro)

museu_vasconcelos.listar_obras()

