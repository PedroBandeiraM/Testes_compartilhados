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

# -----------------------------------------------------------------------------------------------

class Carta:
    def __init__(self, paises):
        self.selos = paises

    @property
    def selos(self): #Retorna uma lista com as siglas dos países
        siglas = []
        for i in range(len(self._selos)):
            siglas.append(self._selos[i][:2])
        return siglas
    
    @selos.setter
    def selos(self, paises): # Valida os dados: Capitaliza as strings
        for i in range(len(paises)):
            paises[i] = paises[i].capitalize()
        self._selos = paises

pacote_1 = Carta(["brasil", "rÚssIa", "índia", "MaLawi"])

print(f"\nSelos de países (com getter): {pacote_1.selos}") 
print(f"Selos de países (sem getter): {pacote_1._selos} \n")

