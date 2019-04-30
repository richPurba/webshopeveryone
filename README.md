# Build
mvn clean package && docker build -t com.webshop.everyone/foreveryone .

# RUN

docker rm -f foreveryone || true && docker run -d -p 8080:8080 -p 4848:4848 --name foreveryone com.webshop.everyone/foreveryone 