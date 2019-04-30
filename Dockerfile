FROM airhacks/glassfish
COPY ./target/foreveryone.war ${DEPLOYMENT_DIR}
