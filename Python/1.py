class Carro:
    def __init__(self, marca,modelo,ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano

    def exibir(self):
        print(
            self.marca,
            self.modelo,
            self.ano
        )


carro1 = Carro('Nissan', 'Skyline Gt-r R-34', 1973)
carro2 = Carro('Ford', 'GT40', 1964)

carro1.exibir()
carro2.exibir()