class Aluno:
    def __init__(self, nome, media):
        self.nome = nome
        self.media = media

    @property
    def media(self):
        return round(self._media, 2)
    

    @media.setter
    def media(self, valor):
        if (isinstance(valor, str)):
            valor = float(valor.replace(",", "."))
            self._media = valor

aluno_1 = Aluno("Paulo", "7,5")

print(aluno_1.media)
