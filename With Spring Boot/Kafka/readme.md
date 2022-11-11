# kafka

Download Kafka Scalar : https://kafka.apache.org/downloads
Unzip in one folder then open the folder in command prompt and do the following,

1. install Zookeeper : 

.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

2. install Kafka :

.\bin\windows\kafka-server-start.bat .\config\server.properties

3. Create Topic : 

.\bin\windows\kafka-topics.bat --create --topic dummy_topic --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1