# Locus Map, TTS commands

Repository for TTS voice commands for Locus Map application.

Voices are used for *Navigation* and *Audio coach* systems.

## Contribution

We always update en.tts file, so use it also as a sample file, what is already possible. cs.tts is also updated by us and it is nice example how to deal with more complex languages than just en.tts. 

There are two methods of how to contribute to modifications or even a new TTS voice. Before we accept any changes, please use below *Custom voice* method and test your modifications.

Format used for values is called JSON. This format is very sensitive on incorrect syntax, so suggest double-check before publishing.

### Pull request

Recommended method. Useful if you plan to contribute more often and are at least a little familiar with Git workflow.

### Create a new issue

Open [new issue](https://github.com/asamm/locus-map-tts-commands/issues) in this repository with proposed changes. We will confirm and merge them as soon as possible.

## Custom voices

For testing purpose (modifications) or for creating own funny voice, a simple method is supported:

Any *\*.tts* file copy into */Locus/data/tts/* directory. When creating TTS engine in the app, Locus firstly check if correct file is available in this directory and use it.
 
## TTS file format

TODO