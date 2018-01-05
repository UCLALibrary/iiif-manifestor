# iiif-manifestor

## Introduction

This program is used for generating [IIIF](http://iiif.io) manifests which conform to the Presentation API 2.0 specification. It was designed for UCLA Library's Sinai Palimpsests Project, but could be used for other projects after some further cleanup and generalization.

## Installation

First, make sure that Java 8, Maven 3, and Git are installed on your development machine. Then, clone this repository and do:

```bash
cd iiif-manifestor
mvn clean package
```

This will create a "fat jar" that contains dependencies for easy deployment.

## Usage

For full usage instructions:

```bash
java -jar target/build-artifact/iiif-manifestor-0.0.1-SNAPSHOT-exec.jar --help
```

## Contact

Contact Mark Matney <mmatney@library.ucla.edu> with questions.