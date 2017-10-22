#include <Wire.h>
#include <BH1750.h>
#include <dht.h>
#include <SoftwareSerial.h>


BH1750 lightMeter;
SoftwareSerial BTSerial(18,19); //rx|tx

#define dht_dpin A2 //Pino DATA do Sensor ligado na porta Analogica A1

dht DHT; //Inicializa o sensor

void setup()
{
  pinMode(9, OUTPUT);
  digitalWrite(9, HIGH);
  Serial.begin(9600);
  Wire.begin();
  lightMeter.begin();
  delay(1000);//Aguarda 1 seg antes de acessar as informações do sensor
  //Wire.begin();
}

void loop()
{
  uint16_t lux = lightMeter.readLightLevel();
  DHT.read11(dht_dpin); //Lê as informações do sensor
  Serial.print("Umidade = ");
  Serial.print(DHT.humidity);
  Serial.print("% | ");
  Serial.print("Temperatura = ");
  Serial.print(DHT.temperature); 
  Serial.println(" Celsius  ");
  Serial.print(" | Light: ");
  Serial.print(lux);
  Serial.println(" lx");
   // Keep reading from HC-05 and send to Arduino Serial Monitor
  if (BTSerial.available())
    Serial.write(BTSerial.read());

  // Keep reading from Arduino Serial Monitor and send to HC-05
  if (Serial.available())
    BTSerial.write(Serial.read());
  //Não diminuir o valor abaixo. O ideal é a leitura a cada 2 segundos
  delay(2000);  
}
