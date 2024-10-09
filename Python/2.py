class Carro:
    def __init__(self, modelo, ano):
        self.modelo = modelo
        self.ano = ano
        self.velocidade = 0 
    
    def acelerar(self, aceleracao):
        self.velocidade += aceleracao
        print(f"O carro acelerou: {aceleracao} km/h.")
    
    def frear(self, desaceleracao):
        self.velocidade -= desaceleracao
        if self.velocidade < 0:
            self.velocidade = 0
        print(f"O carro freou: {desaceleracao} km/h.")
    
    def exibir_velocidade(self):
        print(f"Velocidade atual: {self.velocidade} km/h.")

carro = Carro("Mazda", 1989)
carro.acelerar(90)  
carro.exibir_velocidade()  
carro.frear(20)  
carro.exibir_velocidade() 