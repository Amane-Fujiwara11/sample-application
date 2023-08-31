### base ###
FROM amazoncorretto:17
# port
EXPOSE 8080

#COPY . .
RUN yum update -y
RUN yum -y install curl
RUN yum -y install zip
RUN yum -y install unzip
RUN curl -s "https://get.sdkman.io" | bash
RUN echo ". $HOME/.sdkman/bin/sdkman-init.sh; sdk install gradle" | bash
WORKDIR /java/work/project/